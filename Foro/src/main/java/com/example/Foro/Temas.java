package com.example.Foro;

import java.util.Vector;


public class Temas {
	private int _attribute;
	private int _iD;
	private int _id_tema;
	private String _nombre;
	private int _num__likes;
	public BD_Temas _unnamed_BD_Temas_;
	public Secciones _pertenece_a;
	public Vector<Usuario> _es_gustado = new Vector<Usuario>();
	public Temas _publico;
	public Temas _unnamed_Temas_;
	public Temas _privados;
	public Temas _unnamed_Temas_2;
	public Temas _ocultos;
	public Temas _temas;
	public Usuario _creado_por;
	public Vector<Mensaje> _tiene = new Vector<Mensaje>();
}