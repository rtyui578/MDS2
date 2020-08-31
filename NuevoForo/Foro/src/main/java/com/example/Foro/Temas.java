package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;

import basededatos.BD_Principal;

public class Temas extends Temas_ventana implements View {
	
	VerticalLayout listausuarios,listatemas;
	Button iniciarsesion,registrarse,foro,ajustes,notificaciones,cerrarsesion,publicartema;
	HorizontalLayout parteregistrado,partenoregistrado;
	Navigator navegador;
	TextField titulo;
	BD_Principal bd;
	MyUI m;
	
	public Temas() {
		
	}
	
	public Temas(MyUI myui) {
		// TODO Auto-generated constructor stub
		m=myui;
	}

	public void inicio(int idusuario) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		cerrarsesion=this.cerrarsesion_html;
		notificaciones=this.notificacion_html;
		iniciarsesion=this.iniciarsesion_html;
		registrarse=this.registrarse_html;
		
		parteregistrado=this.parteregistrado_html;
		partenoregistrado=this.partenoregistrado_html;
		listatemas=this.listatemas_html;
		listausuarios=this.listausuarios_html;
		
		int i=0;
		bd = new BD_Principal();
		
		if(idusuario==-1) {
			parteregistrado.setVisible(false);
			partenoregistrado.setVisible(true);
			basededatos.Tema[] lista2 = bd.listaTemas(0);
			Vista_tema_heredar[] itemListaTemas = new Vista_tema_heredar[lista2.length];
			for(i=0;i<itemListaTemas.length;i++) {
				itemListaTemas[i] = new Vista_tema_heredar(m);
				itemListaTemas[i].setNavegador(navegador);
			    itemListaTemas[i].inicio(lista2[i].getId_tema(), idusuario);
			}
			listatemas.addComponents(itemListaTemas);
			listatemas.setHeight(lista2.length*70 + "%");
		}
		else {
			basededatos.Tema[] lista2 = bd.listaTemas(3);
			Vista_tema_heredar[] itemListaTemas = new Vista_tema_heredar[lista2.length];
			for(i=0;i<itemListaTemas.length;i++) {
				itemListaTemas[i] = new Vista_tema_heredar(m);
				itemListaTemas[i].setNavegador(navegador);
			    itemListaTemas[i].inicio(lista2[i].getId_tema(), idusuario);
			}
			listatemas.addComponents(itemListaTemas);
			listatemas.setHeight(lista2.length*70 + "%");
		}
		
		basededatos.Usuario[] lista4 = bd.listaUsuarios(idusuario);
		Vista_usuario_heredar[] itemListaUsuarios = new Vista_usuario_heredar[lista4.length];
		for(i=0;i<itemListaUsuarios.length;i++) {
			itemListaUsuarios[i] = new Vista_usuario_heredar(m);
			itemListaUsuarios[i].setNavegador(navegador);
			itemListaUsuarios[i].inicio(idusuario,lista4[i].getId_usuario(),0);
		}
		listausuarios.addComponents(itemListaUsuarios);
		listausuarios.setHeight(lista4.length*20 + "%");
		
		foro.addClickListener(e->{
			Visualizar v =  new Visualizar(m);
			v.inicio(idusuario);
			m.setContent(v);
		});
	
		notificaciones.addClickListener(e->{
			Notificaciones notificaciones =  new Notificaciones(m);
			notificaciones.inicio(idusuario);
			m.setContent(notificaciones);
		});
	
		iniciarsesion.addClickListener(e->{
			Iniciar_Sesion is =  new Iniciar_Sesion(m);
			is.inicio();
			m.setContent(is);
		});
	
		registrarse.addClickListener(e->{
			Registrarse reg =  new Registrarse(m);
			reg.inicio();
			m.setContent(reg);
		});
	
		cerrarsesion.addClickListener(e->{
			Visualizar v =  new Visualizar(m);
			v.inicio(-1);
			m.setContent(v);
		});
		
		if(bd.listaAdministradores().contains(idusuario)) {
			ajustes.addClickListener(e-> {
					Ajustes_administrador ajustes =  new Ajustes_administrador(m);
					ajustes.inicio(idusuario,1);
					m.setContent(ajustes);
				
			});
		}
		else if(!bd.listaAdministradores().contains(idusuario) && bd.listaModeradores().contains(idusuario)) {
			ajustes.addClickListener(e-> {
					Ajustes_moderador ajustes =  new Ajustes_moderador(m);
					ajustes.inicio(idusuario,1);
					m.setContent(ajustes);
			});
			
		}
		else {
			ajustes.addClickListener(e-> {
				Ajustes ajustes =  new Ajustes(m);
				ajustes.inicio(idusuario,1);
				m.setContent(ajustes);
			
		});
		}
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}

	public basededatos.Tema[] listaTemas(){
		return new BD_Principal().listaTemas(3);
	}
}
