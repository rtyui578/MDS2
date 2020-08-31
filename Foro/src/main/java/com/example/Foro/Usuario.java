package com.example.Foro;
import java.util.Vector;


public class Usuario {
	private int _id_usuario;
	private String _email;
	private String _contrasena;
	private String _nombre_usuario;
	public BD_Usuario _unnamed_BD_Usuario_;
	public Vector<Tema> _crea_un = new Vector<Tema>();
	public Vector<Mensaje> _escribe = new Vector<Mensaje>();
	public Vector<Usuario> _es_su_amigo = new Vector<Usuario>();
	public Vector<Usuario> _es_amigo_de = new Vector<Usuario>();
	public Vector<Usuario> _es_reportado_por = new Vector<Usuario>();
	public Vector<Usuario> _reporta_a = new Vector<Usuario>();
	public Vector<Notificacion> _tiene = new Vector<Notificacion>();
	public Administrador _eliminado_por;
	public Vector<Mensaje> _gusta = new Vector<Mensaje>();
	public Vector<Tema> _le_da_me_gusta = new Vector<Tema>();
}