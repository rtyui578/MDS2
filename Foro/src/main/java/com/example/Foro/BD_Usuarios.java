package com.example.Foro;

import java.util.Vector;


public class BD_Usuarios {
	public BD_Pincipal _bD_Pincipal;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

	public boolean iniciarSesion(String aUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrarse(String aUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void banearUsuario(int aId_usuario_administrador, Object aId_usuario_baneado) {
		throw new UnsupportedOperationException();
	}

	public void desbanearUsuario(Object aId_usuario_administrador, Object aId_usuario_desbaneado) {
		throw new UnsupportedOperationException();
	}

	public void modificar_Contrasena(String aAntiguaContrasena, Object aNuevaContrasena, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void reportarUsuario(int aId_usuario_reportador, Object aId_usuario_reportado) {
		throw new UnsupportedOperationException();
	}

	public void agregarAmigo(int aId_usuario1, int aId_usuario2) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAmigo(int aId_usuaio1, int aId_usuario2) {
		throw new UnsupportedOperationException();
	}

	public Usuario informacionUsuario(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] conseguirLista() {
		throw new UnsupportedOperationException();
	}

	public Usuario[] rellenarAmigos(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] usuariosReportados() {
		throw new UnsupportedOperationException();
	}

	public Usuario[] usuariosBaneados() {
		throw new UnsupportedOperationException();
	}

	public Usuario[] buscarUsuario(String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void enviarSolicitud(int aId_usuario1, int aId_usuario2) {
		throw new UnsupportedOperationException();
	}
}