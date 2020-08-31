package com.example.Foro;

import com.vaadin.navigator.Navigator;

//import basededatos.iCom�n_usuarios;

public class Comun_usuarios extends Vista_foro_no_registrado_ventana{
	//public iCom�n_usuarios _iCom�n_usuarios;
	public Logo _unnamed_Logo_;
	public Secciones _unnamed_Secciones_;
	public Navigator navigator;
	private Object iniciarsesion;
	public Comun_usuarios(Navigator nav) {
		navigator=nav;
		//navigator.addView("VistaNoRegistrado", this.getClass());
		/*this.iniciarsesion.addClickListener(e -> {Iniciar_Sesión is = new Iniciar_Sesión();
													this.navigator.addView("IniciarSesion", is);
													is.setNavigator(navigator);
													this.navigator.navigateTo("IniciarSesion");
																							});*/
	}
}