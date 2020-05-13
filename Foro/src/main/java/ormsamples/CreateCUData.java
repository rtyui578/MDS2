/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateCUData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = foro.CUPersistentManager.instance().getSession().beginTransaction();
		try {
			foro.Usuario fOROUsuario = foro.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_da_me_gusta, es_reportado_por, gusta, eliminado_por, es_su_amigo, tiene, reporta_a, escribe, crea_un, id_usuario, ID, es_amigo_de
			foro.UsuarioDAO.save(fOROUsuario);
			foro.Mensaje fOROMensaje = foro.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a, tiene, num_likes, id_mensaje, ID, es_gustado, son_de, respuesta_de, eliminado_por
			foro.MensajeDAO.save(fOROMensaje);
			foro.Temas fOROTemas = foro.TemasDAO.createTemas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ocultos, tiene, creado_por, num__likes, id_tema, ID, es_gustado, pertenece_a, publico, privados, temas
			foro.TemasDAO.save(fOROTemas);
			foro.Video fOROVideo = foro.VideoDAO.createVideo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ID
			foro.VideoDAO.save(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.createFoto();
			// Initialize the properties of the persistent object here
			foro.FotoDAO.save(fOROFoto);
			foro.Notificaciones fORONotificaciones = foro.NotificacionesDAO.createNotificaciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ID, de
			foro.NotificacionesDAO.save(fORONotificaciones);
			foro.Moderador fOROModerador = foro.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : borra
			foro.ModeradorDAO.save(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elimina, crea
			foro.AdministradorDAO.save(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.createMedia();
			// Initialize the properties of the persistent object here
			foro.MediaDAO.save(fOROMedia);
			foro.Secciones fOROSecciones = foro.SeccionesDAO.createSecciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene, id, es_creada_por
			foro.SeccionesDAO.save(fOROSecciones);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCUData createCUData = new CreateCUData();
			try {
				createCUData.createTestData();
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
