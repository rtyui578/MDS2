package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import foro.AdministradorDAO;

import com.vaadin.ui.Button.ClickEvent;

public class Vista_foro_usuario_registrado_heredar extends Vista_foro_usuario_registrado implements View {
	
	VerticalLayout listausuarios,listamensajes,listatemas,listasecciones;
	Button cerrarsesion,notificaciones,ajustes,foro;
	Navigator navegador;
	public Vista_foro_usuario_registrado_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario) {
		int numeroSecciones=3;
		int numeroTemas=3;
		int numeroMensajes=3;
		int numeroUsuarios=3;
		listausuarios=this.usuarios_html;
		listamensajes=this.listamensajes_html;
		listatemas=this.listatemas_html;
		listasecciones=this.listasecciones_html;
		cerrarsesion=this.cerrarsesion_html;
		notificaciones=this.notificacion_html;
		ajustes=this.ajustes_html;
		foro=this.foro_html;
		int i;
		
		
		BD_Seccion bdsecciones = new BD_Seccion();
		foro.Seccion[] lista1 = bdsecciones.Secciones(0, "");
		Item_lista_secciones_heredar[] itemlistaSecciones = new Item_lista_secciones_heredar[numeroSecciones];
		for( i=0;i<itemlistaSecciones.length;i++) {
			itemlistaSecciones[i] = new Item_lista_secciones_heredar();
			itemlistaSecciones[i].setNavegador(navegador);
			itemlistaSecciones[i].iniciar(lista1[i],1,idusuario);
		}
		listasecciones.addComponents(itemlistaSecciones);
		
		
		
		BD_Tema bdtemas = new BD_Tema();
		foro.Tema[] lista2 = bdtemas.Temas(0, "");
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[numeroTemas];
		for(i=0;i<itemListaTemas.length;i++) {
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(navegador);
		    itemListaTemas[i].iniciar(lista2[i],1,idusuario);
		}
		listatemas.addComponents(itemListaTemas);
		
		
		BD_Mensaje bdmensaje = new BD_Mensaje();
		foro.Mensaje[] lista3 = bdmensaje.conseguirMensajes(0);
		Item_lista_mensaje_heredar[] itemListaMensajes = new Item_lista_mensaje_heredar[numeroMensajes];
		for(i=0;i<itemListaMensajes.length;i++) {
			itemListaMensajes[i] = new Item_lista_mensaje_heredar();
			itemListaMensajes[i].setNavegador(navegador);
			itemListaMensajes[i].inicio(lista3[i],1,idusuario);
		}
		listamensajes.addComponents(itemListaMensajes);
		
		
		BD_Usuario bdusuario = new BD_Usuario();
		foro.Usuario[] lista4 = bdusuario.conseguirLista();
		Item_lista_usuario_heredar[] itemListaUsuarios = new Item_lista_usuario_heredar[numeroUsuarios];
		for(i=0;i<itemListaUsuarios.length;i++) {
			itemListaUsuarios[i] = new Item_lista_usuario_heredar();
			itemListaUsuarios[i].setNavegador(navegador);
			itemListaUsuarios[i].inicio(lista4[i],4,idusuario);
		}
		listausuarios.addComponents(itemListaUsuarios);
		
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
		try {
			foro.Administrador a = AdministradorDAO.getAdministradorByORMID(2);
			ajustes.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Ajustes_administrador_perfil_heredar auv = new Ajustes_administrador_perfil_heredar();
					auv.setNavegador(navegador);
					auv.inicio(idusuario);
					navegador.addView("a", auv);
					navegador.navigateTo("a");
				}
			});
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			ajustes.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Ajustes_usuario_perfil_heredar auv = new Ajustes_usuario_perfil_heredar();
					auv.setNavegador(navegador);
					auv.iniciar(idusuario);
					navegador.addView("a", auv);
					navegador.navigateTo("a");
				}
			});
			e.printStackTrace();
		}
		
			
		
		
			
		
		
		notificaciones.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Notificaciones_heredar nh = new Notificaciones_heredar();
				nh.setNavegador(navegador);
				nh.inicio(idusuario);
				navegador.addView("nh", nh);
				navegador.navigateTo("nh");
			}
		});
		
		try {
			foro.Administrador a = AdministradorDAO.getAdministradorByORMID(2);
			foro.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_foro_administrador_heredar vfarh = new Vista_foro_administrador_heredar();
					vfarh.setNavegador(navegador);
					vfarh.inicio(idusuario);
					navegador.addView("vfarh", vfarh);
					navegador.navigateTo("vfarh");
				}
			});
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			foro.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_foro_usuario_registrado_heredar vfurh = new Vista_foro_usuario_registrado_heredar();
					vfurh.setNavegador(navegador);
					vfurh.inicio(idusuario);
					navegador.addView("vfurh", vfurh);
					navegador.navigateTo("vfurh");
				}
			});
			
		}
	}

}
