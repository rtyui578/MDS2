package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Vista_usuario_administrador_amigos_heredar extends Vista_usuario_administrador_amigos implements View{
	Button mensajes,amigos,listausuarios,perfil,foro,ajustes,notificaciones,cerrarsesion;
	Label nombreusuario;
	VerticalLayout listaamigos;
	Navigator navegador;
	public Vista_usuario_administrador_amigos_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario,int idUsuarioNavega) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		nombreusuario=this.nombreusuario_html;
		amigos=this.amigos_html;
		listausuarios=this.usuarios_html;
		perfil=this.perfil_html;
		mensajes=this.mensajes_html;
		listaamigos=this.listaamigos_html;
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue("Visualizando al usuario : " + user.getNombre_usuario());
		    BD_Usuario bdusuario = new BD_Usuario();
		    foro.Usuario[] lista = bdusuario.rellenarAmigos(idusuario);
		    Item_lista_usuario_heredar[] listaItems = new Item_lista_usuario_heredar[lista.length];
		    for(int i=0;i<lista.length;i++) {
		    	listaItems[i]=new Item_lista_usuario_heredar();
		    	listaItems[i].setNavegador(navegador);
		    	listaItems[i].inicio(lista[i],2,idusuario);
		    }
		    listaamigos.addComponents(listaItems);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_administrador_perfil_heredar vuaph = new Vista_usuario_administrador_perfil_heredar();
				vuaph.setNavegador(navegador);
				vuaph.inicio(idusuario,idUsuarioNavega);
				navegador.addView("vuaph", vuaph);
				navegador.navigateTo("vuaph");
			}
		});
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_administrador_heredar vfah = new Vista_foro_administrador_heredar();
				vfah.setNavegador(navegador);
				vfah.inicio(idUsuarioNavega);
				navegador.addView("vfah", vfah);
				navegador.navigateTo("vfah");
			}
		});
		cerrarsesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_no_registrado_heredar vfn = new Vista_foro_no_registrado_heredar();
				vfn.setNavegador(navegador);
				vfn.iniciar();
				navegador.addView("vfn",vfn);
				navegador.navigateTo("vfn");
			}
		});
		ajustes.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_perfil_heredar aaph = new Ajustes_administrador_perfil_heredar();
				aaph.setNavegador(navegador);
				aaph.inicio(idUsuarioNavega);
				navegador.addView("aaph", aaph);
				navegador.navigateTo("aaph");
			}
		});
		notificaciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Notificaciones_heredar nh = new Notificaciones_heredar();
				nh.setNavegador(navegador);
				nh.inicio(idUsuarioNavega);
				navegador.addView("nh", nh);
				navegador.navigateTo("nh");
			}
		});
		amigos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_administrador_amigos_heredar auah = new Vista_usuario_administrador_amigos_heredar();
				auah.setNavegador(navegador);
				auah.inicio(idusuario,idUsuarioNavega);
				navegador.addView("auah", auah);
				navegador.navigateTo("auah");
				
				}
		});
		mensajes.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_administrador_mensajes_heredar vuamh = new Vista_usuario_administrador_mensajes_heredar();
				vuamh.setNavegador(navegador);
				vuamh.iniciar(idusuario,idUsuarioNavega);
				navegador.addView("vuamh", vuamh);
				navegador.navigateTo("vuamh");
			}
		});
	}
}