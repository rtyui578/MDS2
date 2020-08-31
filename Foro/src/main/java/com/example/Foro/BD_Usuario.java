package com.example.Foro;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.orm.PersistentException;

import foro.AdministradorDAO;
import foro.Usuario;
import foro.UsuarioCriteria;
import foro.UsuarioDAO;


public class BD_Usuario {
	public BD_Principal _bD_Principal;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

	public int iniciarSesion(String aUsuario, String aContraseña) {
		try {
			foro.Usuario[] users = UsuarioDAO.listUsuarioByCriteria(new UsuarioCriteria());
			for(foro.Usuario user : users) {
				if(user.getNombre_usuario().equals(aUsuario)) {
					if(user.getContraseña().equals(aContraseña))
						return user.getId_usuario();
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	public boolean Registrarse(String aUsuario, String aContraseña) {
		foro.Usuario user = new foro.Usuario();
		user.setContraseña(aContraseña);
		user.setNombre_usuario(aUsuario);
		try {
			UsuarioDAO.save(user);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void banearUsuario(int aId_usuario_administrador, int aId_usuario_baneado) {
		try {
			foro.Administrador admin = AdministradorDAO.getAdministradorByORMID(2);
			admin.elimina.add(UsuarioDAO.getUsuarioByORMID(aId_usuario_baneado));
			AdministradorDAO.save(admin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void desbanearUsuario(Object aId_usuario_administrador,int aId_usuario_desbaneado) {
		try {
			foro.Administrador admin = AdministradorDAO.getAdministradorByORMID(2);
			admin.elimina.remove(UsuarioDAO.getUsuarioByORMID(aId_usuario_desbaneado));
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean modificar_Contraseña(String aAntiguaContraseña, String aNuevaContraseña, int aId_usuario) {
		foro.Usuario user;
		try {
			user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			if(aAntiguaContraseña.equals(user.getContraseña())) {
				user.setContraseña(aNuevaContraseña);
				UsuarioDAO.save(user);
				return true;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return false;
				
	}

	public void reportarUsuario(int aId_usuario_reportador, int aId_usuario_reportado) {
		try {
			foro.Usuario user1 = UsuarioDAO.getUsuarioByORMID(2);
			user1.reporta_a.add(UsuarioDAO.getUsuarioByORMID(aId_usuario_reportado));
			UsuarioDAO.save(user1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void agregarAmigo(int aId_usuario1, int aId_usuario2) {
		try {
			foro.Usuario user1 = UsuarioDAO.getUsuarioByORMID(aId_usuario1);
			foro.Usuario user2 = UsuarioDAO.getUsuarioByORMID(aId_usuario2);
			user1.es_amigo_de.add(user2);
			UsuarioDAO.save(user1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void eliminarAmigo(int aId_usuario1, int aId_usuario2) {
		try {
			foro.Usuario user1 = UsuarioDAO.getUsuarioByORMID(aId_usuario1);
			foro.Usuario user2 = UsuarioDAO.getUsuarioByORMID(aId_usuario2);
			user1.es_amigo_de.remove(user2);
			UsuarioDAO.save(user1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public foro.Usuario informacionUsuario(int aId_usuario) {
		try {
			return UsuarioDAO.getUsuarioByORMID(aId_usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public foro.Usuario[] conseguirLista() {
		try {
			foro.Usuario[] users = UsuarioDAO.listUsuarioByCriteria(new UsuarioCriteria());
			return users;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public foro.Usuario[] rellenarAmigos(int aId_usuario) {
		foro.Usuario[] listaUsuarios;
		foro.Usuario user;
		try {
			user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			listaUsuarios=user.es_amigo_de.toArray();
			return listaUsuarios;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public foro.Usuario[] usuariosReportados() {
	try {
		foro.Usuario user = UsuarioDAO.getUsuarioByORMID(2);
		return user.reporta_a.toArray();
	} catch (PersistentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

	public foro.Usuario[] usuariosBaneados() {
		try {
			return AdministradorDAO.getAdministradorByORMID(2).elimina.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public foro.Usuario[] buscarUsuario(String aUsuario) {
		try {
			foro.Usuario user = UsuarioDAO.loadUsuarioByQuery("Usuario.Nombre_usuario='"+aUsuario+"'", null);
			foro.Usuario[] usuarios = new foro.Usuario[1];
			usuarios[0]=user;
			return usuarios;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2) {
		try {
			foro.Usuario user1 = UsuarioDAO.getUsuarioByORMID(aId_usuario1);
			foro.Usuario user2 = UsuarioDAO.getUsuarioByORMID(aId_usuario2);
			user1.es_amigo_de.add(user2);
			UsuarioDAO.save(user1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}