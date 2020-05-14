package com.example.Foro;

import java.util.Vector;


public class BD_Temas {
	public BD_Pincipal _bD_Pincipal;
	public Vector<Temas> _unnamed_Temas_ = new Vector<Temas>();

	public void crearTema(String aTitulo, String aSubtitulo, int aId_tema, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void meGustaTema(int aId_tema, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void borrarTema(int aId_tema, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Temas(int aId_usuario, FormaOrdenar aFormaOrdenar) {
		throw new UnsupportedOperationException();
	}

	public Tema[] buscarTema(String aTema) {
		throw new UnsupportedOperationException();
	}
}