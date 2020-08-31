package basededatos;
public interface iAdministrador {

	public void banearUsuario(int aId_usuario);

	public void desbanearUsuario(int aId_usuario);

	public void crearSeccion(String aTitulo, int aId_usuario);

	public void borrarSeccion(int aId_seccion);
}