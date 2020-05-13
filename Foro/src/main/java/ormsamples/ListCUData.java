/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListCUData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		foro.Usuario[] fOROUsuarios = foro.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(fOROUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		foro.Mensaje[] fOROMensajes = foro.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(fOROMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Temas...");
		foro.Temas[] fOROTemases = foro.TemasDAO.listTemasByQuery(null, null);
		length = Math.min(fOROTemases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROTemases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video...");
		foro.Video[] fOROVideos = foro.VideoDAO.listVideoByQuery(null, null);
		length = Math.min(fOROVideos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROVideos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		foro.Foto[] fOROFotos = foro.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(fOROFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificaciones...");
		foro.Notificaciones[] fORONotificacioneses = foro.NotificacionesDAO.listNotificacionesByQuery(null, null);
		length = Math.min(fORONotificacioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fORONotificacioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		foro.Moderador[] fOROModeradors = foro.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(fOROModeradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROModeradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		foro.Administrador[] fOROAdministradors = foro.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(fOROAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Media...");
		foro.Media[] fOROMedias = foro.MediaDAO.listMediaByQuery(null, null);
		length = Math.min(fOROMedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROMedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Secciones...");
		foro.Secciones[] fOROSeccioneses = foro.SeccionesDAO.listSeccionesByQuery(null, null);
		length = Math.min(fOROSeccioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fOROSeccioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		foro.UsuarioCriteria fOROUsuarioCriteria = new foro.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROUsuarioCriteria.attribute.eq();
		fOROUsuarioCriteria.setMaxResults(ROW_COUNT);
		foro.Usuario[] fOROUsuarios = fOROUsuarioCriteria.listUsuario();
		int length =fOROUsuarios== null ? 0 : Math.min(fOROUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		foro.MensajeCriteria fOROMensajeCriteria = new foro.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROMensajeCriteria.attribute.eq();
		fOROMensajeCriteria.setMaxResults(ROW_COUNT);
		foro.Mensaje[] fOROMensajes = fOROMensajeCriteria.listMensaje();
		length =fOROMensajes== null ? 0 : Math.min(fOROMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Temas by Criteria...");
		foro.TemasCriteria fOROTemasCriteria = new foro.TemasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROTemasCriteria.attribute.eq();
		fOROTemasCriteria.setMaxResults(ROW_COUNT);
		foro.Temas[] fOROTemases = fOROTemasCriteria.listTemas();
		length =fOROTemases== null ? 0 : Math.min(fOROTemases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROTemases[i]);
		}
		System.out.println(length + " Temas record(s) retrieved."); 
		
		System.out.println("Listing Video by Criteria...");
		foro.VideoCriteria fOROVideoCriteria = new foro.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROVideoCriteria.attribute.eq();
		fOROVideoCriteria.setMaxResults(ROW_COUNT);
		foro.Video[] fOROVideos = fOROVideoCriteria.listVideo();
		length =fOROVideos== null ? 0 : Math.min(fOROVideos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROVideos[i]);
		}
		System.out.println(length + " Video record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		foro.FotoCriteria fOROFotoCriteria = new foro.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROFotoCriteria.attribute.eq();
		//fOROFotoCriteria.attribute.eq();
		fOROFotoCriteria.setMaxResults(ROW_COUNT);
		foro.Foto[] fOROFotos = fOROFotoCriteria.listFoto();
		length =fOROFotos== null ? 0 : Math.min(fOROFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing Notificaciones by Criteria...");
		foro.NotificacionesCriteria fORONotificacionesCriteria = new foro.NotificacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fORONotificacionesCriteria.attribute.eq();
		fORONotificacionesCriteria.setMaxResults(ROW_COUNT);
		foro.Notificaciones[] fORONotificacioneses = fORONotificacionesCriteria.listNotificaciones();
		length =fORONotificacioneses== null ? 0 : Math.min(fORONotificacioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fORONotificacioneses[i]);
		}
		System.out.println(length + " Notificaciones record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		foro.ModeradorCriteria fOROModeradorCriteria = new foro.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROModeradorCriteria.attribute.eq();
		fOROModeradorCriteria.setMaxResults(ROW_COUNT);
		foro.Moderador[] fOROModeradors = fOROModeradorCriteria.listModerador();
		length =fOROModeradors== null ? 0 : Math.min(fOROModeradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROModeradors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		foro.AdministradorCriteria fOROAdministradorCriteria = new foro.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROAdministradorCriteria.attribute.eq();
		fOROAdministradorCriteria.setMaxResults(ROW_COUNT);
		foro.Administrador[] fOROAdministradors = fOROAdministradorCriteria.listAdministrador();
		length =fOROAdministradors== null ? 0 : Math.min(fOROAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Media by Criteria...");
		foro.MediaCriteria fOROMediaCriteria = new foro.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROMediaCriteria.attribute.eq();
		fOROMediaCriteria.setMaxResults(ROW_COUNT);
		foro.Media[] fOROMedias = fOROMediaCriteria.listMedia();
		length =fOROMedias== null ? 0 : Math.min(fOROMedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROMedias[i]);
		}
		System.out.println(length + " Media record(s) retrieved."); 
		
		System.out.println("Listing Secciones by Criteria...");
		foro.SeccionesCriteria fOROSeccionesCriteria = new foro.SeccionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fOROSeccionesCriteria.attribute.eq();
		fOROSeccionesCriteria.setMaxResults(ROW_COUNT);
		foro.Secciones[] fOROSeccioneses = fOROSeccionesCriteria.listSecciones();
		length =fOROSeccioneses== null ? 0 : Math.min(fOROSeccioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fOROSeccioneses[i]);
		}
		System.out.println(length + " Secciones record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListCUData listCUData = new ListCUData();
			try {
				listCUData.listTestData();
				//listCUData.listByCriteria();
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
