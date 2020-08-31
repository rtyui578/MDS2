/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateCUData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = foro.CUPersistentManager.instance().getSession().beginTransaction();
		try {
			foro.Usuario fOROUsuario = foro.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			foro.UsuarioDAO.save(fOROUsuario);
			foro.Mensaje fOROMensaje = foro.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			foro.MensajeDAO.save(fOROMensaje);
			foro.Tema fOROTema = foro.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			foro.TemaDAO.save(fOROTema);
			foro.Notificacion fORONotificacion = foro.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			foro.NotificacionDAO.save(fORONotificacion);
			foro.Moderador fOROModerador = foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			foro.ModeradorDAO.save(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			foro.AdministradorDAO.save(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			foro.MediaDAO.save(fOROMedia);
			foro.Seccion fOROSeccion = foro.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			foro.SeccionDAO.save(fOROSeccion);
			foro.Video fOROVideo = foro.VideoDAO.loadVideoByQuery(null, null);
			// Update the properties of the persistent object
			foro.VideoDAO.save(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			foro.FotoDAO.save(fOROFoto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		foro.UsuarioCriteria fOROUsuarioCriteria = new foro.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROUsuarioCriteria.id_usuario.eq();
		System.out.println(fOROUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		foro.MensajeCriteria fOROMensajeCriteria = new foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROMensajeCriteria.id_mensaje.eq();
		System.out.println(fOROMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		foro.TemaCriteria fOROTemaCriteria = new foro.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROTemaCriteria.id_tema.eq();
		System.out.println(fOROTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		foro.NotificacionCriteria fORONotificacionCriteria = new foro.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fORONotificacionCriteria.id_notificacion.eq();
		System.out.println(fORONotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		foro.ModeradorCriteria fOROModeradorCriteria = new foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROModeradorCriteria.id_usuario.eq();
		System.out.println(fOROModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		foro.AdministradorCriteria fOROAdministradorCriteria = new foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROAdministradorCriteria.id_usuario.eq();
		System.out.println(fOROAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Media by MediaCriteria");
		foro.MediaCriteria fOROMediaCriteria = new foro.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROMediaCriteria.id_media.eq();
		System.out.println(fOROMediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		foro.SeccionCriteria fOROSeccionCriteria = new foro.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROSeccionCriteria.id__seccion.eq();
		System.out.println(fOROSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Video by VideoCriteria");
		foro.VideoCriteria fOROVideoCriteria = new foro.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROVideoCriteria.id_media.eq();
		System.out.println(fOROVideoCriteria.uniqueVideo());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		foro.FotoCriteria fOROFotoCriteria = new foro.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROFotoCriteria.id_media.eq();
		System.out.println(fOROFotoCriteria.uniqueFoto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateCUData retrieveAndUpdateCUData = new RetrieveAndUpdateCUData();
			try {
				retrieveAndUpdateCUData.retrieveAndUpdateTestData();
				//retrieveAndUpdateCUData.retrieveByCriteria();
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
