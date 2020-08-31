package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import foro.AdministradorDAO;
import foro.ModeradorDAO;
import foro.UsuarioDAO;

public class Modificar_perfil_heredar extends Modificar_perfil_ventana implements View {
	Button cambiar;
	TextField nombre,email;
	Navigator navegador;
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public Modificar_perfil_heredar() {
		
	}
	public void inicio(int idusuario) {
		cambiar=this.cambiar_html;
		nombre=this.nombre_html;
		email=this.emial_html;
		
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombre.setValue(user.getNombre_usuario());
			email.setValue(user.getEmail());
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cambiar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
					if(user.getEmail().equals(email.getValue())==false)
						user.setEmail(email.getValue());
					if(user.getNombre_usuario().equals(nombre.getValue())==false)
						user.setEmail(nombre.getValue());
					UsuarioDAO.save(user);
					if(idusuario==2) {
						Ajustes_administrador_perfil_heredar auph = new Ajustes_administrador_perfil_heredar();
						auph.setNavegador(navegador);
						auph.inicio(idusuario);
						navegador.addView("auph", auph);
						navegador.navigateTo("auph");
					}
					
					Ajustes_usuario_perfil_heredar auph = new Ajustes_usuario_perfil_heredar();
					auph.setNavegador(navegador);
					auph.iniciar(idusuario);
					navegador.addView("auph", auph);
					navegador.navigateTo("auph");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
