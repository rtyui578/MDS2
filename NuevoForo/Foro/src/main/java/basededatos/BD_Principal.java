package basededatos;
/*
import Interfaces.iUsuario_No_Registrado;
import Interfaces.iAdministrador;
import Interfaces.iCom�n_privilegiados;
import Interfaces.iCom�n_registrados;
import Interfaces.iCom�n_usuarios;
import Interfaces.iModerador;
import Interfaces.iUsuario_propietario_mensaje;
import Interfaces.iUsuario_Registrado;*/

import java.util.List;

public class BD_Principal 
/*implements iUsuario_No_Registrado, iAdministrador, iCom�n_privilegiados, iCom�n_registrados, 
 * iCom�n_usuarios, iModerador, iUsuario_propietario_mensaje, iUsuario_Registrado*/ {
	public BD_Temas _bD_Temas = new BD_Temas();
	public BD_Imagenes _bD_Imagenes = new BD_Imagenes();
	public BD_Videos _bD_Videos = new BD_Videos();
	public BD_Mensajes _bD_Mensajes = new BD_Mensajes();
	public BD_Secciones _bD_Secciones = new BD_Secciones();
	public BD_Usuarios _bD_Usuarios = new BD_Usuarios();
	public BD_Moderadores _bD_Moderadores = new BD_Moderadores();
	public BD_Administradores _bD_Administradores = new BD_Administradores();
	public BD_Notificaciones _bD_Notificaciones = new BD_Notificaciones();

	public int iniciarSesion(String aUsuario, String aContrasena) {
		return _bD_Usuarios.iniciarSesion(aUsuario, aContrasena);
	}

	public boolean Registrarse(String aUsuario, String aContrasena, String aEmail) {
		return _bD_Usuarios.Registrarse(aUsuario, aContrasena, aEmail);
	}

	public void banearUsuario(int aId_usuario) {
		_bD_Usuarios.banearUsuario(aId_usuario);
	}

	public void desbanearUsuario(int aId_usuario) {
		_bD_Usuarios.desbanearUsuario(aId_usuario);
	}
	
	public Usuario[] usuariosReportados() {
		return _bD_Usuarios.usuariosReportados();
	}

	public void eliminarUsuario(int idusuario) {
		_bD_Usuarios.eliminarUsuario(idusuario);
	}
	
	public void eliminarAmigo(int aId_usuario1, int aId_usuario2) {
		_bD_Usuarios.eliminarAmigo(aId_usuario1, aId_usuario2);
	}
	
	public Usuario[] listaAmigos(int aId_usuario) {
		return _bD_Usuarios.listaAmigos(aId_usuario);
	}
	
	public Usuario[] listaUsuarios(int id) {
		return _bD_Usuarios.listaUsuarios(id);
	}
	
	public Usuario[] usuariosBaneados() {
		return _bD_Usuarios.usuariosBaneados();
	}
	
	public void Reportar(int aId_reportado, int aId_reportador) {
		 _bD_Usuarios.Reportar(aId_reportado, aId_reportador);
	}
	
	public Usuario conseguirUsuario(int aId_usuario) {
		 return _bD_Usuarios.conseguirUsuario(aId_usuario);
	}
	
	public void quitarReportado(int idusuario) {
		 _bD_Usuarios.quitarReportado(idusuario);
	}
	
	public Notificacion[] notificacionesUsuario(int aId_usuario) {
		return _bD_Notificaciones.notificacionesUsuario(aId_usuario);
	}
	
	public void crearNotificacion(int aId_usuario, String aContenido) {
		_bD_Notificaciones.crearNotificacion(aId_usuario, aContenido);
	}
	
	public List<Integer> listaModeradores() {
		return  _bD_Moderadores.listaModeradores();
	}
	
	public List<Integer> listaAdministradores() {
		return  _bD_Administradores.listaAdministradores();
	}
	
	public void borrarTema(int aId_Tema) {
		_bD_Temas.borrar_Tema(aId_Tema);
	}
	
	public Tema[] listaTemas(int aNivel) {
		return _bD_Temas.listaTemas(aNivel);
	}
	
	public void gustarTema(int aId_tema, int aId_usuario) {
		_bD_Temas.gustarTema(aId_tema, aId_usuario);
	}
	
	public Tema conseguirTema(int aId_tema) {
		return _bD_Temas.conseguirTema(aId_tema);
	}
	
	public Tema[] temasSeccion(int aId_seccion) {
		return _bD_Temas.temasSeccion(aId_seccion);
	}
	
	public void crearTema(String aTitulo, int aId_seccion,int nivel) {
		 _bD_Temas.crearTema(aTitulo, aId_seccion, nivel);
	}
	
	public void agregarAmigo(int aId_usuario1, int aId_usuario2) {
		_bD_Usuarios.agregarAmigo(aId_usuario1, aId_usuario2);
	}

	public void crearMensaje(String aContenido, int aId_usuario, int aId_tema, int aId_respuesta) {
		_bD_Mensajes.crearMensaje(aContenido, aId_usuario, aId_tema, aId_respuesta);
	}
	
	public void gustarMensaje(int aId_usuario, int aId_mensaje) {
		_bD_Mensajes.gustarMensaje(aId_usuario, aId_mensaje);
	}
	public Mensaje[] ultimoMensajes() {
		return _bD_Mensajes.ultimoMensajes();
	}
	
	public Mensaje[] mensajesUsuario(int aId_usuario) {
		return _bD_Mensajes.mensajesUsuario(aId_usuario);
	}
	
	public Mensaje conseguirMensaje(int aId_mensaje) {
		return _bD_Mensajes.conseguirMensaje(aId_mensaje);
	}
	
	public Mensaje[] mensajesTema(int aId_tema) {
		return _bD_Mensajes.mensajesTema(aId_tema);
	}
	
	
	public void borrarMensaje_(int aId_mensaje) {
		_bD_Mensajes.BorrarMensaje(aId_mensaje);
	}

	public List<Mensaje> respuestas(int idmensaje) {
		return _bD_Mensajes.respuestas(idmensaje);
	}

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarContrasena(String aAntiguaC, String aNuevaC, int aId_usuario) {
		return _bD_Usuarios.modificarContrasena(aAntiguaC, aNuevaC, aId_usuario);
	}
	
	public Seccion[] listaSecciones() {
		return _bD_Secciones.listaSecciones();
	}
	
	public Seccion conseguirSeccion(int aId_seccion) {
		return _bD_Secciones.conseguirSeccion(aId_seccion);
	}

	public void crearSeccion(String aTitulo, int aId_usuario) {
		_bD_Secciones.crearSeccion(aTitulo, aId_usuario);
	}

	public void borrarSeccion(int aId_seccion) {
		_bD_Secciones.borrarSeccion(aId_seccion);
	}
}