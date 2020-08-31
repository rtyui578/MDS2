package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

public class BD_Mensajes {
	public BD_Principal _bD_Principal;
	public Vector<Mensaje> _mensajes = new Vector<Mensaje>();

	public void crearMensaje(String aContenido, int aId_usuario, int aId_tema, int aId_respuesta) {
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			Mensaje mensaje = new Mensaje();
			Tema tema = TemaDAO.getTemaByORMID(aId_tema);
			mensaje.setContenido_mensaje(aContenido);
			mensaje.setPertenece_a(user);
			mensaje.setEs_de(tema);
			mensaje.setNum_likes_mensaje(0);
			if(aId_respuesta!=-1) {
				mensaje.setResponde_a(MensajeDAO.getMensajeByORMID(aId_respuesta));
			}
			else {
				mensaje.setResponde_a(MensajeDAO.getMensajeByORMID(1));
			}
			MensajeDAO.save(mensaje);
			user.escribe.add(mensaje);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gustarMensaje(int aId_usuario, int aId_mensaje) {
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			Mensaje mensaje = MensajeDAO.getMensajeByORMID(aId_mensaje);
			if(user.gusta.contains(mensaje)==false) {
				user.gusta.add(MensajeDAO.getMensajeByORMID(aId_mensaje));
			}
			mensaje.setNum_likes_mensaje(mensaje.es_gustado_por.size());
			UsuarioDAO.save(user);
			} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Mensaje[] ultimoMensajes() {
		try {
			return MensajeDAO.listMensajeByCriteria(new MensajeCriteria());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Mensaje[] mensajesUsuario(int aId_usuario) {
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			return user.escribe.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Mensaje conseguirMensaje(int aId_mensaje) {
		Mensaje mensaje=null;
		try {
			mensaje=MensajeDAO.getMensajeByORMID(aId_mensaje);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensaje;
	}

	public Mensaje[] mensajesTema(int aId_tema) {
		
		Tema tema;
		List<Mensaje> mensajes=new ArrayList<Mensaje>();
		try {
			tema = TemaDAO.getTemaByORMID(aId_tema);
			Mensaje[] ms = tema.tiene.toArray();
			for(int i=0;i<ms.length;i++) {
				if(ms[i].getResponde_a().getId_mensaje()==1) {
					mensajes.add(ms[i]);
				}
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mensaje[] respuesta= new Mensaje[mensajes.size()];
		for(int i=0;i<respuesta.length;i++) {
			respuesta[i]=mensajes.get(i);
		}
		
		return respuesta;
	}

	public void BorrarMensaje(int aId_mensaje) {
		try {
			System.out.println("idmensaje" + aId_mensaje);
			Mensaje mensaje = MensajeDAO.getMensajeByORMID(aId_mensaje);
			mensaje.getContenido_mensaje();
			Usuario user = mensaje.getPertenece_a();
			if(mensaje.tiene_respuestas.size()!=0) {
				Mensaje[] respuestas = mensaje.tiene_respuestas.toArray();
				for(int i=0;i<respuestas.length;i++) {
					new BD_Mensajes().BorrarMensaje(respuestas[i].getId_mensaje());
				}
			}
			
			MensajeDAO.deleteAndDissociate(mensaje);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Mensaje> respuestas(int idmensaje) {
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		try {
			Mensaje[] m = MensajeDAO.listMensajeByCriteria(new MensajeCriteria());
			for(int i=0;i<m.length;i++) {
				if(m[i].getResponde_a().getId_mensaje()==idmensaje) {
					mensajes.add(m[i]);
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensajes;
	}
	
}