package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import foro.AdministradorDAO;

import com.vaadin.ui.Button.ClickEvent;

public class Item_lista_usuario_heredar extends Item_lista_usuario implements View{

	Button reportar,banear,añadir,nombreboton;
	Navigator navegador;
	public Item_lista_usuario_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(foro.Usuario user,int nivel,int idusuario) {
		reportar=this.reportar_html;
		banear=this.banear_html;
		añadir=this.añadir_html;
		nombreboton=this.nombreusuario_html;
		
		
		if(nivel==1) {
			reportar.setVisible(false);
			banear.setVisible(false);
			añadir.setVisible(false);
			nombreboton.setVisible(false);
		}
		if(nivel==2) {
			reportar.setVisible(false);
			banear.setVisible(false);
			nombreboton.setCaption(user.getNombre_usuario());
			nombreboton.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_usuario_registrado_perfil_heredar vurph = new Vista_usuario_registrado_perfil_heredar();
					vurph.setNavegador(navegador);
					vurph.inicio(user.getId_usuario(), idusuario);
					navegador.addView("vurph", vurph);
					navegador.navigateTo("vurph");
				}
			});
			}
		
		//Nivel 4 son los usuarios presentes en la lista de un no registrado
		if(nivel==4) {
			reportar.setVisible(false);
			banear.setVisible(false);
			añadir.setVisible(false);
			nombreboton.setCaption(user.getNombre_usuario());
			nombreboton.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_usuario_registrado_perfil_heredar vurph = new Vista_usuario_registrado_perfil_heredar();
					vurph.setNavegador(navegador);
					vurph.inicio(user.getId_usuario(), idusuario);
					navegador.addView("vurph", vurph);
					navegador.navigateTo("vurph");
				}
			});
			
		}
		
	}
}
