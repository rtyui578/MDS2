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
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_da_me_gusta, es_reportado_por, gusta, es_su_amigo, tiene, reporta_a, es_amigo_de, escribe, crea_un, eliminado_por
			foro.UsuarioDAO.save(fOROUsuario);
			foro.Mensaje fOROMensaje = foro.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, pertenece_a, tiene, num_likes, es_gustado, son_de, respuesta_de, eliminado_por
			foro.MensajeDAO.save(fOROMensaje);
			foro.Tema fOROTema = foro.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ocultos, tiene, creado_por, num__likes, es_gustado, publico, privados, tema, pertenece_a
			foro.TemaDAO.save(fOROTema);
			foro.Notificacion fORONotificacion = foro.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : de
			foro.NotificacionDAO.save(fORONotificacion);
			foro.Moderador fOROModerador = foro.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : borra
			foro.ModeradorDAO.save(fOROModerador);
			foro.Administrador fOROAdministrador = foro.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elimina, crea
			foro.AdministradorDAO.save(fOROAdministrador);
			foro.Media fOROMedia = foro.MediaDAO.createMedia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_de
			foro.MediaDAO.save(fOROMedia);
			foro.Seccion fOROSeccion = foro.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene, es_creada_por
			foro.SeccionDAO.save(fOROSeccion);
			foro.Video fOROVideo = foro.VideoDAO.createVideo();
			// Initialize the properties of the persistent object here
			foro.VideoDAO.save(fOROVideo);
			foro.Foto fOROFoto = foro.FotoDAO.createFoto();
			// Initialize the properties of the persistent object here
			foro.FotoDAO.save(fOROFoto);
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
