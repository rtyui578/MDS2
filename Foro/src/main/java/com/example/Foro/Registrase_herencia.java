package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import foro.AdministradorDAO;
import foro.UsuarioDAO;

public class Registrase_herencia extends Registrarse_ventana implements View{
	
	TextField nombreusuario,nombre;
	PasswordField contraseña;
	Button registrarse;
	Navigator navegador;
	public Registrase_herencia() {
		nombreusuario=this.nombreusuario_html;
		nombre=this.nombre_html;
		contraseña=this.contraseña_html;
		registrarse=this.registrarse_html;
		registrarse.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				nombreusuario.getValue();
				foro.Usuario user = new foro.Usuario();
			    
				user.setContraseña(contraseña.getValue());
				user.setNombre_usuario(nombreusuario.getValue());
				user.setEmail(nombre.getValue());
				try {
					UsuarioDAO.save(user);
					
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Iniciar_sesion_heredar ish = new Iniciar_sesion_heredar();
				ish.setNavegador(navegador);
				navegador.addView("ish",ish);
				navegador.navigateTo("ish");
				
			}
		});
				
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}

}
