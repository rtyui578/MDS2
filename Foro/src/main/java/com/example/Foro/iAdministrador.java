package com.example.Foro;

public interface iAdministrador  {

	public void desbanearUsuario(int aId_usuario_administrador, int aId_usuario_desbaneado);

	public void banearUsuario(int aId_usuario_administrador, int aId_usuario_baneado);
}