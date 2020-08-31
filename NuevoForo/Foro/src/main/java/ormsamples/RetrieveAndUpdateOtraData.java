/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOtraData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.OtraPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Seccion baseDeDatosSeccion = basededatos.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.SeccionDAO.save(baseDeDatosSeccion);
			basededatos.Media baseDeDatosMedia = basededatos.MediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.MediaDAO.save(baseDeDatosMedia);
			basededatos.Video baseDeDatosVideo = basededatos.VideoDAO.loadVideoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.VideoDAO.save(baseDeDatosVideo);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ImagenDAO.save(baseDeDatosImagen);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Moderador baseDeDatosModerador = basededatos.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ModeradorDAO.save(baseDeDatosModerador);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Tema baseDeDatosTema = basededatos.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.TemaDAO.save(baseDeDatosTema);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.MensajeDAO.save(baseDeDatosMensaje);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.NotificacionDAO.save(baseDeDatosNotificacion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Seccion by SeccionCriteria");
		basededatos.SeccionCriteria baseDeDatosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosSeccionCriteria.id_seccion.eq();
		System.out.println(baseDeDatosSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Media by MediaCriteria");
		basededatos.MediaCriteria baseDeDatosMediaCriteria = new basededatos.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosMediaCriteria.id_media.eq();
		System.out.println(baseDeDatosMediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving Video by VideoCriteria");
		basededatos.VideoCriteria baseDeDatosVideoCriteria = new basededatos.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosVideoCriteria.id_media.eq();
		System.out.println(baseDeDatosVideoCriteria.uniqueVideo());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		basededatos.ImagenCriteria baseDeDatosImagenCriteria = new basededatos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosImagenCriteria.id_media.eq();
		System.out.println(baseDeDatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioCriteria.id_usuario.eq();
		System.out.println(baseDeDatosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		basededatos.ModeradorCriteria baseDeDatosModeradorCriteria = new basededatos.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosModeradorCriteria.id_usuario.eq();
		System.out.println(baseDeDatosModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAdministradorCriteria.id_usuario.eq();
		System.out.println(baseDeDatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		basededatos.TemaCriteria baseDeDatosTemaCriteria = new basededatos.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosTemaCriteria.id_tema.eq();
		System.out.println(baseDeDatosTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		basededatos.MensajeCriteria baseDeDatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosMensajeCriteria.id_mensaje.eq();
		System.out.println(baseDeDatosMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		basededatos.NotificacionCriteria baseDeDatosNotificacionCriteria = new basededatos.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosNotificacionCriteria.id_notificacion.eq();
		System.out.println(baseDeDatosNotificacionCriteria.uniqueNotificacion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOtraData retrieveAndUpdateOtraData = new RetrieveAndUpdateOtraData();
			try {
				retrieveAndUpdateOtraData.retrieveAndUpdateTestData();
				//retrieveAndUpdateOtraData.retrieveByCriteria();
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
