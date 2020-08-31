package basededatos;

import java.util.Vector;

import org.orm.PersistentException;

public class BD_Notificaciones {
	public BD_Principal _bD_Principal;
	public Vector<Notificacion> _notificacions = new Vector<Notificacion>();

	public Notificacion[] notificacionesUsuario(int aId_usuario) {
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			return user.tiene.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void crearNotificacion(int aId_usuario, String aContenido) {
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			Notificacion notificacion = new Notificacion();
			notificacion.setContenido_notificacion(aContenido);
			notificacion.setEs_de(user);
			NotificacionDAO.save(notificacion);
			} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}