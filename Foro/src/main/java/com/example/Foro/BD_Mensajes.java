package com.example.Foro;

import java.util.Vector;


public class BD_Mensajes {
	public BD_Pincipal _bD_Pincipal;
	public Vector<Mensaje> _unnamed_Mensaje_ = new Vector<Mensaje>();

	public void escribirMensaje(String aContenido, int aId_usuario, int aId_tema) {
		throw new UnsupportedOperationException();
	}

	public void me_Gusta_Mensaje(int aId_mensaje, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void borrarMensaje(int aId_usuario, int aId_mensaje) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] Mensajes(int aId_usuario, FormaOrdenar aFormaOrdenar) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] conseguirMensajes(int aId_usuario) {
		throw new UnsupportedOperationException();
	}
}