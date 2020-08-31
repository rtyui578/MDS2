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
			foro.Tema fOROTema = foro.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			foro.TemaDAO.delete(fOROTema);
			foro.Notificacion fORONotificacion = foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			foro.NotificacionDAO.delete(fORONotificacion);
			foro.Moderador fOROModerador = foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			foro.ModeradorDAO.delete(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			foro.AdministradorDAO.delete(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			foro.MediaDAO.delete(fOROMedia);
			foro.Seccion fOROSeccion = foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			foro.SeccionDAO.delete(fOROSeccion);
			foro.Video fOROVideo = foro.VideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			foro.VideoDAO.delete(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			foro.FotoDAO.delete(fOROFoto);
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
