package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.AdministradorDAO;
import foro.TemaCriteria;
import foro.TemaDAO;
import foro.UsuarioDAO;

import com.vaadin.ui.*;

public class Vista_foro_no_registrado_heredar extends Vista_foro_no_registrado_ventana implements View {

	Button registrarse, iniciarsesion,botonseccion,botontema,botonmensajes,foro;
	VerticalLayout listasecciones,listatemas,listamensajes,listausuarios;
	Navigator navegador;
	
	public Vista_foro_no_registrado_heredar() {
		
}
	public void iniciar() {
		int i;
		int numeroSecciones=3;
		int numeroTemas=3;
		int numeroMensajes=3;
		int numeroUsuarios=3;
		registrarse = this.registrarse_html;
		iniciarsesion=this.iniciarsesion_html;
		listasecciones=this.listasecciones_html;
		listatemas=this.listatemas_html;
		listamensajes=this.listamensajes_html;
		listausuarios=this.listausuarios_html;
		botonseccion=this.boton_secciones_html;
		botontema=this.boton_temas_html;
		botonmensajes=this.boton_mensajes_html;
		foro=this.foro_html;
		BD_Seccion bdsecciones = new BD_Seccion();
		foro.Seccion[] lista1 = bdsecciones.Secciones(0, "");
		Item_lista_secciones_heredar[] itemlistaSecciones = new Item_lista_secciones_heredar[numeroSecciones];
		for( i=0;i<itemlistaSecciones.length;i++) {
			itemlistaSecciones[i] = new Item_lista_secciones_heredar();
			itemlistaSecciones[i].setNavegador(navegador);
			itemlistaSecciones[i].iniciar(lista1[i],-1,-1);
			
		}
		listasecciones.addComponents(itemlistaSecciones);
		
		
		
		BD_Tema bdtemas = new BD_Tema();
		foro.Tema[] lista2 = bdtemas.Temas(0, "");
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[numeroTemas];
		for(i=0;i<itemListaTemas.length;i++) {
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(navegador);
			itemListaTemas[i].iniciar(lista2[i],-1,-1);
		}
		listatemas.addComponents(itemListaTemas);
		
		
		BD_Mensaje bdmensaje = new BD_Mensaje();
		foro.Mensaje[] lista3 = bdmensaje.conseguirMensajes(0);
		Item_lista_mensaje_heredar[] itemListaMensajes = new Item_lista_mensaje_heredar[numeroMensajes];
		for(i=0;i<itemListaMensajes.length;i++) {
			itemListaMensajes[i] = new Item_lista_mensaje_heredar();
			itemListaMensajes[i].setNavegador(navegador);
			itemListaMensajes[i].inicio(lista3[i],-1,-1);
		}
		listamensajes.addComponents(itemListaMensajes);
		
		
		BD_Usuario bdusuario = new BD_Usuario();
		foro.Usuario[] lista4 = bdusuario.conseguirLista();
		Item_lista_usuario_heredar[] itemListaUsuarios = new Item_lista_usuario_heredar[numeroUsuarios];
		for(i=0;i<itemListaUsuarios.length;i++) {
			itemListaUsuarios[i] = new Item_lista_usuario_heredar();
			itemListaUsuarios[i].setNavegador(navegador);
			itemListaUsuarios[i].inicio(lista4[i],4,-1);
		}
		listausuarios.addComponents(itemListaUsuarios);
		
		iniciarsesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Iniciar_sesion_heredar ish = new Iniciar_sesion_heredar();
				ish.setNavegador(navegador);
				navegador.addView("Login", ish);
				navegador.navigateTo("Login");
			}
		});
		
		registrarse.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Registrase_herencia rh = new Registrase_herencia();
				rh.setNavegador(navegador);
				navegador.addView("rh", rh);
				navegador.navigateTo("rh");
			}
		});
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_no_registrado_heredar vfnh = new Vista_foro_no_registrado_heredar();
				vfnh.setNavegador(navegador);
				navegador.addView("w", vfnh);
				navegador.navigateTo("w");
			}
		});
		
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
}
