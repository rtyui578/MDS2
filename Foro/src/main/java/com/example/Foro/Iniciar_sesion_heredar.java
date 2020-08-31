package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

import foro.Usuario;

import com.vaadin.ui.Button.ClickEvent;

public class Iniciar_sesion_heredar extends Iniciar_sesion_ventana implements View{

		TextField nombre;
		PasswordField contraseña;
		Button entrar,registrarse;
		Navigator navegador;
		public Iniciar_sesion_heredar() {
			nombre=this.nombre_html;
			contraseña=this.contraseña_html;
			entrar=this.entrar_html;
			registrarse=this.registrarse_html;
			entrar.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					
					foro.Usuario user = new foro.Usuario();
					BD_Usuario bd = new BD_Usuario();
					int pasa =bd.iniciarSesion(nombre.getValue(), contraseña.getValue());
					if(pasa!=-1) {
						Vista_foro_usuario_registrado_heredar vfrh = new Vista_foro_usuario_registrado_heredar();
						vfrh.setNavegador(navegador);
						vfrh.inicio(pasa);
						navegador.addView("vfrh", vfrh);
						navegador.navigateTo("vfrh");
					}
						
					else
						nombre.setCaption("No pasastes");
				}
			});
			registrarse.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Registrase_herencia rh = new Registrase_herencia();
					rh.setNavegador(navegador);
					navegador.addView("Registrarse", rh);
					navegador.navigateTo("Registrarse");
				}
			});
			
		}
		
		public void setNavegador(Navigator nav) {
			navegador=nav;
		}
}
