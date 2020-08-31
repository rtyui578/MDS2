package basededatos;

public interface iUsuario_No_Registrado {

	public boolean iniciarSesion(String aUsuario, String aContrasena);

	public boolean Registrarse(String aUsuario, String aContrasena, String aEmail);
}