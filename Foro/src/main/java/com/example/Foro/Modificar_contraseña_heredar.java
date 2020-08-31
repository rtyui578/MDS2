package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

import foro.UsuarioDAO;

import com.vaadin.ui.Button.ClickEvent;

public class Modificar_contraseña_heredar extends Modificar_contraseña_ventana implements View{

	
	Button aceptar;
	PasswordField ncontraseña2,acontraseña,ncontraseña;
	Navigator navegador;
	public Modificar_contraseña_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario) {
		acontraseña=this.acontraseña_html;
		ncontraseña=this.ncontraseña_html;
		ncontraseña2=this.ncontraseña2_html;
		aceptar=this.aceptar_html;
		aceptar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
					if(acontraseña.getValue().equals(user.getContraseña()) && ncontraseña.getValue().equals(ncontraseña2.getValue())) {
						user.setContraseña(ncontraseña.getValue());
						UsuarioDAO.save(user);
						
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
