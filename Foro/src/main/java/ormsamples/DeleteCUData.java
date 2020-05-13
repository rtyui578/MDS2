/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteCUData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = foro.CUPersistentManager.instance().getSession().beginTransaction();
		try {
			foro.Usuario fOROUsuario = foro.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			foro.UsuarioDAO.delete(fOROUsuario);
			foro.Mensaje fOROMensaje = foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			foro.MensajeDAO.delete(fOROMensaje);
			foro.Temas fOROTemas = foro.TemasDAO.loadTemasByQuery(null, null);
			// Delete the persistent object
			foro.TemasDAO.delete(fOROTemas);
			foro.Video fOROVideo = foro.VideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			foro.VideoDAO.delete(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			foro.FotoDAO.delete(fOROFoto);
			foro.Notificaciones fORONotificaciones = foro.NotificacionesDAO.loadNotificacionesByQuery(null, null);
			// Delete the persistent object
			foro.NotificacionesDAO.delete(fORONotificaciones);
			foro.Moderador fOROModerador = foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			foro.ModeradorDAO.delete(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			foro.AdministradorDAO.delete(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			foro.MediaDAO.delete(fOROMedia);
			foro.Secciones fOROSecciones = foro.SeccionesDAO.loadSeccionesByQuery(null, null);
			// Delete the persistent object
			foro.SeccionesDAO.delete(fOROSecciones);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteCUData deleteCUData = new DeleteCUData();
			try {
				deleteCUData.deleteTestData();
			}
			finally {
				foro.CUPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
