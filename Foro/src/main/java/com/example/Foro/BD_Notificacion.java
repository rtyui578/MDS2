package com.example.Foro;

import java.util.Vector;

import org.orm.PersistentException;

import foro.NotificacionDAO;
import foro.UsuarioDAO;

public class BD_Notificacion {
	public BD_Principal _bD_Principal;
	public Vector<Notificacion> _unnamed_Notificacion_ = new Vector<Notificacion>();

	public void borrarNotificacion(int aId_notificacion) {
		try {
			foro.Notificacion n = NotificacionDAO.getNotificacionByORMID(aId_notificacion);
			NotificacionDAO.delete(n);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public foro.Notificacion[] Notificaciones(int aId_usuario) {
		
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			return user.tiene.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void añadirNotificacion(String titulo, int aId_usuario) {
		foro.Notificacion notificacion = new foro.Notificacion();
		try {
			notificacion.setDe(UsuarioDAO.getUsuarioByORMID(aId_usuario));
			notificacion.setTitulo(titulo);
			NotificacionDAO.save(notificacion);
			UsuarioDAO.getUsuarioByORMID(aId_usuario).tiene.add(notificacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}