package com.example.Foro;

public interface iUsuario_Registrado {

	public default void eliminarAmigo(int aId_usuario1, int aId_usuario2) {};

	

	public default void contenidoMensaje(String aContenido) {};

	public void meGustaMensaje(int aId_mensaje, int aId_usuario);

	public void agregarAmigo(int aId_usuario1, int aId_usuario2);

	public void reportarUsuario(int aId_usuario_reportador, int aId_usuario_reportado);

	public void escribirMensaje(String aContenido, int aId_usuario, int aId_tema);

	public void meGustaTema(int aId_tema, int aId_usuario);

	public void crearTema(String aTitulo, String aSubtitulo, int aId_tema, int aId_usuario);

	

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2);

	public boolean modificarInformacion(int aId_usuario, String aNuevaInformacion);

	public default boolean modificar_Contraseña(String aAntiguaContraseña, String aNuevaContraseña, int aId_usuario) {
		return false;
	};
}