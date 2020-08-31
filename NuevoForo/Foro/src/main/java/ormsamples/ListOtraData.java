/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListOtraData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Seccion...");
		basededatos.Seccion[] baseDeDatosSeccions = basededatos.SeccionDAO.listSeccionByQuery(null, null);
		int length = Math.min(baseDeDatosSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Media...");
		basededatos.Media[] baseDeDatosMedias = basededatos.MediaDAO.listMediaByQuery(null, null);
		length = Math.min(baseDeDatosMedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosMedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video...");
		basededatos.Video[] baseDeDatosVideos = basededatos.VideoDAO.listVideoByQuery(null, null);
		length = Math.min(baseDeDatosVideos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosVideos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		basededatos.Imagen[] baseDeDatosImagens = basededatos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(baseDeDatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		basededatos.Usuario[] baseDeDatosUsuarios = basededatos.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(baseDeDatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		basededatos.Moderador[] baseDeDatosModeradors = basededatos.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(baseDeDatosModeradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosModeradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] baseDeDatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(baseDeDatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		basededatos.Tema[] baseDeDatosTemas = basededatos.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(baseDeDatosTemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosTemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		basededatos.Mensaje[] baseDeDatosMensajes = basededatos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(baseDeDatosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		basededatos.Notificacion[] baseDeDatosNotificacions = basededatos.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(baseDeDatosNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Seccion by Criteria...");
		basededatos.SeccionCriteria baseDeDatosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosSeccionCriteria.id_seccion.eq();
		baseDeDatosSeccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Seccion[] baseDeDatosSeccions = baseDeDatosSeccionCriteria.listSeccion();
		int length =baseDeDatosSeccions== null ? 0 : Math.min(baseDeDatosSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Media by Criteria...");
		basededatos.MediaCriteria baseDeDatosMediaCriteria = new basededatos.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosMediaCriteria.id_media.eq();
		baseDeDatosMediaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Media[] baseDeDatosMedias = baseDeDatosMediaCriteria.listMedia();
		length =baseDeDatosMedias== null ? 0 : Math.min(baseDeDatosMedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosMedias[i]);
		}
		System.out.println(length + " Media record(s) retrieved."); 
		
		System.out.println("Listing Video by Criteria...");
		basededatos.VideoCriteria baseDeDatosVideoCriteria = new basededatos.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosVideoCriteria.id_media.eq();
		baseDeDatosVideoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Video[] baseDeDatosVideos = baseDeDatosVideoCriteria.listVideo();
		length =baseDeDatosVideos== null ? 0 : Math.min(baseDeDatosVideos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosVideos[i]);
		}
		System.out.println(length + " Video record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		basededatos.ImagenCriteria baseDeDatosImagenCriteria = new basededatos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosImagenCriteria.id_media.eq();
		baseDeDatosImagenCriteria.setMaxResults(ROW_COUNT);
		basededatos.Imagen[] baseDeDatosImagens = baseDeDatosImagenCriteria.listImagen();
		length =baseDeDatosImagens== null ? 0 : Math.min(baseDeDatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioCriteria.id_usuario.eq();
		baseDeDatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario[] baseDeDatosUsuarios = baseDeDatosUsuarioCriteria.listUsuario();
		length =baseDeDatosUsuarios== null ? 0 : Math.min(baseDeDatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		basededatos.ModeradorCriteria baseDeDatosModeradorCriteria = new basededatos.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosModeradorCriteria.id_usuario.eq();
		baseDeDatosModeradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Moderador[] baseDeDatosModeradors = baseDeDatosModeradorCriteria.listModerador();
		length =baseDeDatosModeradors== null ? 0 : Math.min(baseDeDatosModeradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosModeradors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAdministradorCriteria.id_usuario.eq();
		baseDeDatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] baseDeDatosAdministradors = baseDeDatosAdministradorCriteria.listAdministrador();
		length =baseDeDatosAdministradors== null ? 0 : Math.min(baseDeDatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		basededatos.TemaCriteria baseDeDatosTemaCriteria = new basededatos.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosTemaCriteria.id_tema.eq();
		baseDeDatosTemaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Tema[] baseDeDatosTemas = baseDeDatosTemaCriteria.listTema();
		length =baseDeDatosTemas== null ? 0 : Math.min(baseDeDatosTemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosTemas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		basededatos.MensajeCriteria baseDeDatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosMensajeCriteria.id_mensaje.eq();
		baseDeDatosMensajeCriteria.setMaxResults(ROW_COUNT);
		basededatos.Mensaje[] baseDeDatosMensajes = baseDeDatosMensajeCriteria.listMensaje();
		length =baseDeDatosMensajes== null ? 0 : Math.min(baseDeDatosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		basededatos.NotificacionCriteria baseDeDatosNotificacionCriteria = new basededatos.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosNotificacionCriteria.id_notificacion.eq();
		baseDeDatosNotificacionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Notificacion[] baseDeDatosNotificacions = baseDeDatosNotificacionCriteria.listNotificacion();
		length =baseDeDatosNotificacions== null ? 0 : Math.min(baseDeDatosNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOtraData listOtraData = new ListOtraData();
			try {
				listOtraData.listTestData();
				//listOtraData.listByCriteria();
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
