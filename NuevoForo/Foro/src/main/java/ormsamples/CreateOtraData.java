/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOtraData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.OtraPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Seccion baseDeDatosSeccion = basededatos.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene, creada_por
			basededatos.SeccionDAO.save(baseDeDatosSeccion);
			basededatos.Media baseDeDatosMedia = basededatos.MediaDAO.createMedia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_de
			basededatos.MediaDAO.save(baseDeDatosMedia);
			basededatos.Video baseDeDatosVideo = basededatos.VideoDAO.createVideo();
			// Initialize the properties of the persistent object here
			basededatos.VideoDAO.save(baseDeDatosVideo);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.createImagen();
			// Initialize the properties of the persistent object here
			basededatos.ImagenDAO.save(baseDeDatosImagen);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reportados, baneados, tiene, es_amigo_de, gusta_a, escribe, gusta, amigo, crea
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Moderador baseDeDatosModerador = basededatos.ModeradorDAO.createModerador();
			// Initialize the properties of the persistent object here
			basededatos.ModeradorDAO.save(baseDeDatosModerador);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Tema baseDeDatosTema = basededatos.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_gustado, temas_privados, temas_publicos, temas_ocultos, tiene, num_likes_tema, es_de
			basededatos.TemaDAO.save(baseDeDatosTema);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a, tiene_respuestas, contiene, num_likes_mensaje, es_de, es_gustado_por, responde_a
			basededatos.MensajeDAO.save(baseDeDatosMensaje);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_de
			basededatos.NotificacionDAO.save(baseDeDatosNotificacion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOtraData createOtraData = new CreateOtraData();
			try {
				createOtraData.createTestData();
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
