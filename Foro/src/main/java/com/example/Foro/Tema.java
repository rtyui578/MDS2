package com.example.Foro;

import java.util.Vector;


public class Tema {
	private int _id_tema;
	private String _nombre;
	private int _num__likes;
	public BD_Tema _unnamed_BD_Tema_;
	public Seccion _pertenece_a;
	public Vector<Usuario> _es_gustado = new Vector<Usuario>();
	public Tema _publico;
	public Tema _unnamed_Tema_;
	public Tema _privados;
	public Tema _unnamed_Tema_2;
	public Tema _ocultos;
	public Tema _tema;
	public Usuario _creado_por;
	public Vector<Mensaje> _tiene = new Vector<Mensaje>();
}