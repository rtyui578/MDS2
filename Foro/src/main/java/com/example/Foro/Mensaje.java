package com.example.Foro;
import java.util.Vector;


public class Mensaje {
	private int _id_mensaje;
	private int _num_likes;
	private String _contenido;
	public BD_Mensaje _unnamed_BD_Mensaje_;
	public Tema _son_de;
	public Mensaje _respuesta_de;
	public Vector<Mensaje> _tiene = new Vector<Mensaje>();
	public Moderador _eliminado_por;
	public Vector<Usuario> _es_gustado = new Vector<Usuario>();
	public Usuario _pertenece_a;
	public Vector<Media> _contiene = new Vector<Media>();
}