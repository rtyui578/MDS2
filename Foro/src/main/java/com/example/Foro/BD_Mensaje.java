package com.example.Foro;

import java.util.Vector;

import org.orm.PersistentException;

import foro.Mensaje;
import foro.MensajeCriteria;
import foro.MensajeDAO;
import foro.TemaDAO;
import foro.UsuarioDAO;


public class BD_Mensaje {
	public BD_Principal _bD_Principal;
	public Vector<Mensaje> _unnamed_Mensaje_ = new Vector<Mensaje>();

	public void escribirMensaje(String aContenido, int aId_usuario, int aId_tema) {
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			foro.Mensaje mensaje = new foro.Mensaje();
			mensaje.setContenido(aContenido);
			mensaje.setPertenece_a(user);
			mensaje.setSon_de(TemaDAO.getTemaByORMID(aId_tema));
			mensaje.setNum_likes(0);
			MensajeDAO.save(mensaje);
			user.escribe.add(mensaje);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void me_Gusta_Mensaje(int aId_mensaje, int aId_usuario) {
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			user.gusta.add(MensajeDAO.getMensajeByORMID(aId_mensaje));
			UsuarioDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrarMensaje(int aId_usuario, int aId_mensaje) {
		try {
			UsuarioDAO.getUsuarioByORMID(aId_usuario).escribe.remove(MensajeDAO.getMensajeByORMID(aId_mensaje));
			MensajeDAO.delete(MensajeDAO.getMensajeByORMID(aId_mensaje));
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public foro.Mensaje[] Mensajes(int aId_usuario, String aFormaOrdenar) {
		try {
			return UsuarioDAO.getUsuarioByORMID(aId_usuario).escribe.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public foro.Mensaje[] conseguirMensajes(int aId_usuario) {
		if(aId_usuario==0) {
		foro.Mensaje[] mensajes;
		try {
			mensajes = MensajeDAO.listMensajeByCriteria(new MensajeCriteria());
			return mensajes;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
		else {
			try {
				
				int j=0;
				foro.Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
				System.out.println(user.getNombre_usuario());
				foro.Mensaje[] mensajes = MensajeDAO.listMensajeByCriteria(new MensajeCriteria());
				
				foro.Mensaje[] devolver = new foro.Mensaje[mensajes.length];
				for(int i=0;i<mensajes.length;i++) {
					System.out.println(mensajes[i].getPertenece_a()==user);
					if(mensajes[i].getPertenece_a()==user) {
						devolver[j]=mensajes[i];
						j++;
					}
				}
				return devolver;
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}
	public foro.Mensaje[] mensajesDeTema(int idtema){
		try {
			int j=0;
			int i=0;
			foro.Mensaje[] todos = MensajeDAO.listMensajeByCriteria(new MensajeCriteria());
			foro.Mensaje[] devolver = new foro.Mensaje[todos.length];
			for(i=0;i<todos.length;i++) {
				if(todos[i].getSon_de().getId_tema()==idtema) {
					devolver[j]=todos[i];
					j++;
				}
			}
			foro.Mensaje[] otro = new foro.Mensaje[j];
			for(i=0;i<j;i++) {
				otro[i]=devolver[i];
			}
			return otro;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}