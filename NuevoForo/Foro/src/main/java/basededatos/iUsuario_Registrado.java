package basededatos;

public interface iUsuario_Registrado {

	public void agregarAmigo(int aId_usuario1, int aId_usuario2);

	public void borrarMensaje_(int aId_mensaje);

	public Tema[] buscarTema(String aNombre);

	public Usuario[] buscarUsuario(String aNombre);

	public void crearMensaje(String aContenido, int aId_usuario, int aId_tema, int aId_respuesta);

	public void crearTema(String aTitulo, int aId_seccion);

	public void gustarMensaje(int aId_usuario, int aId_mensaje);

	public void gustarTema(int aId_tema, int aId_usuario);

	public void eliminarAmigo(int aId_usuario1, int aId_usuario2);

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2);

	public boolean modificarContrasena(String aAntiguaC, String aNuevaC, int aId_usuario);

	public void Reportar(int aId_reportado, int aId_reportador);
}