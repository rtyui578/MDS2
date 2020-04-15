package com.example.Foro;

import java.util.Vector;


public class Temas_publicos extends Vista_foro_no_registrado_ventana{
	public Temas_publicos() {
		this.registrarse.addClickListener(e->{this.iniciarsesion.setCaption("Iniciado");});
	}
}