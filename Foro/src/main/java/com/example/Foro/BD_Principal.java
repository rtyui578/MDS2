package com.example.Foro;
import java.util.Vector;

public class BD_Principal implements iUsuario_No_Registrado, iModerador, iAdministrador, iComún_privilegiados, iCorreo, iComún_registrados, iComún_usuarios {
	public BD_Imagenes _bD_Imagenes;
	public BD_Videos _bD_Videos;
	public BD_Mensaje _bD_Mensaje;
	public BD_Tema _bD_Tema;
	public BD_Seccion _bD_Seccion;
	public BD_Usuario _bD_Usuario;
	public Vector<BD_Administrador> _bD_Administradores = new Vector<BD_Administrador>();
	public BD_Moderador _bD_Moderador;
	public BD_Notificacion _bD_Notificacion;

	public boolean Registrarse(String aUsuario, String aContraseña) {
		return _bD_Usuario.Registrarse(aUsuario, aContraseña);
	}

	public Usuario_No_Registrado get_Usuario_No_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Comun_usuarios get_Comun_usuarios() {
		throw new UnsupportedOperationException();
	}

	public void eliminarAmigo(int aId_usuario1, int aId_usuario2) {
		_bD_Usuario.eliminarAmigo(aId_usuario1, aId_usuario2);
	}

	public void contenidoMensaje(String aContenido) {
		throw new UnsupportedOperationException();
	}

	public void meGustaMensaje(int aId_mensaje, int aId_usuario) {
		_bD_Mensaje.me_Gusta_Mensaje(aId_mensaje, aId_usuario);
	}

	public void agregarAmigo(int aId_usuario1, int aId_usuario2) {
		_bD_Usuario.agregarAmigo(aId_usuario1, aId_usuario2);
	}

	public void reportarUsuario(int aId_usuario_reportador, int aId_usuario_reportado) {
		_bD_Usuario.reportarUsuario(aId_usuario_reportador, aId_usuario_reportado);
	}

	public void escribirMensaje(String aContenido, int aId_usuario, int aId_tema) {
		_bD_Mensaje.escribirMensaje(aContenido, aId_usuario, aId_tema);
	}

	public void meGustaTema(int aId_tema, int aId_usuario) {
		_bD_Tema.meGustaTema(aId_tema, aId_usuario);
	}

	public void crearTema(String aTitulo, String aSubtitulo, int aId_seccion, int aId_usuario) {
		_bD_Tema.crearTema(aTitulo, aSubtitulo, aId_seccion, aId_usuario);
	}

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2) {
		_bD_Usuario.enviarSolicitud(aId_usuario1, aId_usuario2);
	}

	public boolean modificarInformacion(int aId_usuario, String aNuevaInformacion) {
	return false;
	}

	public boolean modificar_Contraseña(String aAntiguaContraseña, String aNuevaContraseña, int aId_usuario) {
		return _bD_Usuario.modificar_Contraseña(aAntiguaContraseña, aNuevaContraseña, aId_usuario);
	}

	public void borrarMensaje(int aId_usuario, int aId_mensaje) {
		_bD_Mensaje.borrarMensaje(aId_usuario, aId_mensaje);
	}

	public void borrarTema(int aId_tema, int aId_usuario) {
		_bD_Tema.borrarTema(aId_tema, aId_usuario);
	}

	public void desbanearUsuario(int aId_usuario_administrador, int aId_usuario_desbaneado) {
		_bD_Usuario.desbanearUsuario(aId_usuario_administrador, aId_usuario_desbaneado);
	}

	public void banearUsuario(int aId_usuario_administrador, int aId_usuario_baneado) {
		_bD_Usuario.banearUsuario(aId_usuario_administrador, aId_usuario_baneado);
	}

	public foro.Moderador get_Moderador() {
		return new foro.Moderador();
	}

	public Usuario_Registrado get_Usuario_Registrado() {
		return new Usuario_Registrado();
	}

	public Comun_registrados get_Comun_registrados() {
		return new Comun_registrados();
	}

	public Usuario_propietario_mensaje get_Usuario_propietario_mensaje() {
		return new Usuario_propietario_mensaje();
	}

	public Comun_privilegiados get_Comun_privilegiados() {
		return new Comun_privilegiados();
	}

	public foro.Administrador get_Administrador() {
		return new foro.Administrador();
	}

	public Correo get_Correo() {
		return new Correo();
	}

	public void registrarse(String aUsuario, String aContrasena) {
		_bD_Usuario.Registrarse(aUsuario, aContrasena);
	}

	public boolean IniciarSesion(String aUsuario, String aContrasena) {
		return -1!=_bD_Usuario.iniciarSesion(aUsuario, aContrasena);
	}

	public void contenidoMensaje_string___contenido____void() {
		
	}

	public void reportarUsuario_____void() {
		
	}
}