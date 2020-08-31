/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteOtraData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.OtraPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Seccion baseDeDatosSeccion = basededatos.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			basededatos.SeccionDAO.delete(baseDeDatosSeccion);
			basededatos.Media baseDeDatosMedia = basededatos.MediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			basededatos.MediaDAO.delete(baseDeDatosMedia);
			basededatos.Video baseDeDatosVideo = basededatos.VideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			basededatos.VideoDAO.delete(baseDeDatosVideo);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			basededatos.ImagenDAO.delete(baseDeDatosImagen);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioDAO.delete(baseDeDatosUsuario);
			basededatos.Moderador baseDeDatosModerador = basededatos.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			basededatos.ModeradorDAO.delete(baseDeDatosModerador);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(baseDeDatosAdministrador);
			basededatos.Tema baseDeDatosTema = basededatos.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			basededatos.TemaDAO.delete(baseDeDatosTema);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			basededatos.MensajeDAO.delete(baseDeDatosMensaje);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			basededatos.NotificacionDAO.delete(baseDeDatosNotificacion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOtraData deleteOtraData = new DeleteOtraData();
			try {
				deleteOtraData.deleteTestData();
			}
			finally {
				basededatos.OtraPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
