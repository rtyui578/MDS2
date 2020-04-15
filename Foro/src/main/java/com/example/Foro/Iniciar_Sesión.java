package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;

public class Iniciar_Sesión extends Iniciar_sesion_ventana implements View{
	/*private Label _iniciarSesionL;
	private Label _descripcion;
	private Label _nombreUsuarioL;
	private TextField _nombreUsuarioTF;
	private Label _contrase�aL;
	private TextField _contrase�aTF;
	private Button _registrarseB;
	private Label _registrarseL;
	private Button _entrarB;
	private Label _entrarL;
	private Label _recordarContrase�aL;
	private Button _recordarContrase�aB;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Validar_sesi�n _unnamed_Validar_sesión_;
	public Recordar_contrase�a _unnamed_Recordar_contraseña_;*/
	Navigator nav;
	public Iniciar_Sesión() {
		
	}
    
	public void iniciarSesion(String aNombreUsuario, String aContraseña) {
		throw new UnsupportedOperationException();
	}

	public void recordarContraseña() {
		throw new UnsupportedOperationException();
	}
	public void setNavigator(Navigator nav){
		this.nav=nav;
	}
}