package com.example.Foro;

public interface iUsuario_No_Registrado extends iComún_usuarios {

	public boolean Registrarse(String aUsuario, String aContraseña);

	public boolean IniciarSesion(String aUsuario, String aContraseña);
}