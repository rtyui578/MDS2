package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Vista_usuario_registrado_amigos_heredar extends Vista_usuario_registrado_amigos_ventana implements View{
	Button mensajes,amigos,listausuarios,perfil,foro,ajustes,notificaciones,cerrarsesion;
	Label nombreusuario;
	VerticalLayout listaamigos;
	Navigator navegador;
	public Vista_usuario_registrado_amigos_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario,int idusuarionavega) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		nombreusuario=this.nombreusuario_html;
		amigos=this.amigos_html;
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
				Vista_usuario_registrado_perfil_heredar vurph = new Vista_usuario_registrado_perfil_heredar();
				vurph.setNavegador(navegador);
				vurph.inicio(idusuario,idusuarionavega);
				navegador.addView("vurph", vurph);
				navegador.navigateTo("vurph");
			}
		});
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_usuario_registrado_heredar vfurh = new Vista_foro_usuario_registrado_heredar();
				vfurh.setNavegador(navegador);
				vfurh.inicio(idusuarionavega);
				navegador.addView("vfurh", vfurh);
				navegador.navigateTo("vfurh");
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
				Ajustes_usuario_perfil_heredar aaph = new Ajustes_usuario_perfil_heredar();
				aaph.setNavegador(navegador);
				aaph.iniciar(idusuarionavega);
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
				nh.inicio(idusuarionavega);
				navegador.addView("nh", nh);
				navegador.navigateTo("nh");
			}
		});
		amigos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_registrado_amigos_heredar vurah = new Vista_usuario_registrado_amigos_heredar();
				vurah.setNavegador(navegador);
				vurah.inicio(idusuario,idusuarionavega);
				navegador.addView("vurah", vurah);
				navegador.navigateTo("vurah");
				
				}
		});
		mensajes.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_registrado_mensajes_heredar vurmh = new Vista_usuario_registrado_mensajes_heredar();
				vurmh.setNavegador(navegador);
				vurmh.inicio(idusuario,idusuarionavega);
				navegador.addView("vurmh", vurmh);
				navegador.navigateTo("vurmh");
			}
		});
	}


}
