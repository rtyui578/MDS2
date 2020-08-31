package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Vista_foro_administrador_heredar extends Vista_foro_administrador_ventana implements View{
	VerticalLayout listausuarios,listamensajes,listatemas,listasecciones;
	Button cerrarsesion,notificaciones,ajustes,foro;
	Navigator navegador;
	public Vista_foro_administrador_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario) {
		listausuarios=this.usuarios_html;
		listamensajes=this.listamensajes_html;
		listatemas=this.listatemas_html;
		listasecciones=this.listasecciones_html;
		cerrarsesion=this.cerrarsesion_html;
		notificaciones=this.notificaciones_html;
		ajustes=this.ajustes_html;
		foro=this.foro_html;
		int i;
		BD_Seccion bdsecciones = new BD_Seccion();
		foro.Seccion[] lista1 = bdsecciones.Secciones(0, "");
		Item_lista_secciones_heredar[] itemlistaSecciones = new Item_lista_secciones_heredar[lista1.length];
		for( i=0;i<lista1.length;i++) {
			itemlistaSecciones[i] = new Item_lista_secciones_heredar();
			itemlistaSecciones[i].setNavegador(navegador);
			itemlistaSecciones[i].iniciar(lista1[i],0,idusuario);
		}
		listasecciones.addComponents(itemlistaSecciones);
		System.out.println(lista1.length);
		BD_Tema bdtemas = new BD_Tema();
		foro.Tema[] lista2 = bdtemas.Temas(0, "");
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[lista2.length];
		for(i=0;i<lista2.length;i++) {
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(navegador);
			itemListaTemas[i].iniciar(lista2[i],0,idusuario);
		}
		listatemas.addComponents(itemListaTemas);
		BD_Mensaje bdmensaje = new BD_Mensaje();
		foro.Mensaje[] lista3 = bdmensaje.conseguirMensajes(0);
		Item_lista_mensaje_heredar[] itemListaMensajes = new Item_lista_mensaje_heredar[lista3.length];
		for(i=0;i<lista3.length;i++) {
			itemListaMensajes[i] = new Item_lista_mensaje_heredar();
			itemListaMensajes[i].setNavegador(navegador);
			itemListaMensajes[i].inicio(lista3[i],0,idusuario);
		}
		listamensajes.addComponents(itemListaMensajes);
		BD_Usuario bdusuario = new BD_Usuario();
		foro.Usuario[] lista4 = bdusuario.conseguirLista();
		Label[] itemListaUsuarios = new Label[lista4.length];
		for(i=0;i<lista4.length;i++) {
			itemListaUsuarios[i] = new Label();
			itemListaUsuarios[i].setValue(lista4[i].getNombre_usuario());
		}
		listausuarios.addComponents(itemListaUsuarios);
		
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_administrador_heredar vfah = new Vista_foro_administrador_heredar();
				vfah.setNavegador(navegador);
				vfah.inicio(idusuario);
				navegador.addView("vfah",vfah);
				navegador.navigateTo("vfah");
			}
		});
		notificaciones.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Notificaciones_heredar nh = new Notificaciones_heredar();
				nh.setNavegador(navegador);
				nh.inicio(idusuario);
				navegador.addView("nh",nh);
				navegador.navigateTo("nh");
			}
		});
		ajustes.addClickListener(new Button.ClickListener() {
	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_perfil_heredar aaph = new Ajustes_administrador_perfil_heredar();
				aaph.setNavegador(navegador);
				aaph.inicio(idusuario);
				navegador.addView("aaph",aaph);
				navegador.navigateTo("aaph");
	}
});
		cerrarsesion.addClickListener(new Button.ClickListener() {
	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_no_registrado_heredar vfnrh = new Vista_foro_no_registrado_heredar();
				vfnrh.setNavegador(navegador);
				navegador.addView("vfnrh",vfnrh);
				navegador.navigateTo("vfnrh");
	}
});
	}



}
