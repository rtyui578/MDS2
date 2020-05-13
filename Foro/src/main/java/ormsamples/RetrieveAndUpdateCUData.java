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
			foro.Temas fOROTemas = foro.TemasDAO.loadTemasByQuery(null, null);
			// Update the properties of the persistent object
			foro.TemasDAO.save(fOROTemas);
			foro.Video fOROVideo = foro.VideoDAO.loadVideoByQuery(null, null);
			// Update the properties of the persistent object
			foro.VideoDAO.save(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			foro.FotoDAO.save(fOROFoto);
			foro.Notificaciones fORONotificaciones = foro.NotificacionesDAO.loadNotificacionesByQuery(null, null);
			// Update the properties of the persistent object
			foro.NotificacionesDAO.save(fORONotificaciones);
			foro.Moderador fOROModerador = foro.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			foro.ModeradorDAO.save(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			foro.AdministradorDAO.save(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			foro.MediaDAO.save(fOROMedia);
			foro.Secciones fOROSecciones = foro.SeccionesDAO.loadSeccionesByQuery(null, null);
			// Update the properties of the persistent object
			foro.SeccionesDAO.save(fOROSecciones);
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
		//fOROUsuarioCriteria.attribute.eq();
		System.out.println(fOROUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		foro.MensajeCriteria fOROMensajeCriteria = new foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROMensajeCriteria.attribute.eq();
		System.out.println(fOROMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Temas by TemasCriteria");
		foro.TemasCriteria fOROTemasCriteria = new foro.TemasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROTemasCriteria.attribute.eq();
		System.out.println(fOROTemasCriteria.uniqueTemas());
		
		System.out.println("Retrieving Video by VideoCriteria");
		foro.VideoCriteria fOROVideoCriteria = new foro.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROVideoCriteria.attribute.eq();
		System.out.println(fOROVideoCriteria.uniqueVideo());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		foro.FotoCriteria fOROFotoCriteria = new foro.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROFotoCriteria.attribute.eq();
		//fOROFotoCriteria.attribute.eq();
		System.out.println(fOROFotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving Notificaciones by NotificacionesCriteria");
		foro.NotificacionesCriteria fORONotificacionesCriteria = new foro.NotificacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fORONotificacionesCriteria.attribute.eq();
		System.out.println(fORONotificacionesCriteria.uniqueNotificaciones());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		foro.ModeradorCriteria fOROModeradorCriteria = new foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROModeradorCriteria.attribute.eq();
		System.out.println(fOROModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		foro.AdministradorCriteria fOROAdministradorCriteria = new foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROAdministradorCriteria.attribute.eq();
		System.out.println(fOROAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Media by MediaCriteria");
		foro.MediaCriteria fOROMediaCriteria = new foro.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROMediaCriteria.attribute.eq();
		System.out.println(fOROMediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving Secciones by SeccionesCriteria");
		foro.SeccionesCriteria fOROSeccionesCriteria = new foro.SeccionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fOROSeccionesCriteria.attribute.eq();
		System.out.println(fOROSeccionesCriteria.uniqueSecciones());
		
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
