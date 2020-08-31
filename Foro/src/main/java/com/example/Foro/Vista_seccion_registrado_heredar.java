package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Vista_seccion_registrado_heredar extends Vista_seccion_registrado_ventana implements View{
	VerticalLayout temas;
	Label tituloseccion;
	Navigator navegador;
	Button foro,ajustes,cerrarsesion,notificaciones;
	public Vista_seccion_registrado_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int id,int idusuario) {
		temas=this.tema_html;
		tituloseccion=this.tituloseccion_html;
		int i;
		cerrarsesion=this.cerrarsesion_html;
		notificaciones=this.notificaciones_html;
		ajustes=this.ajustes_html;
		foro=this.foro_html;
		
		BD_Seccion bdseccion = new BD_Seccion();
		foro.Seccion seccion = bdseccion.buscarSeccion(id);
		tituloseccion.setValue(seccion.getNombre());
		BD_Tema bdtema = new BD_Tema();
		foro.Tema[] lista2 = bdtema.temasDeSeccion(id);
		System.out.println("Numero de temas en seccion" + lista2.length);
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[lista2.length];
		for(i=0;i<lista2.length;i++) {
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(navegador);
			itemListaTemas[i].iniciar(lista2[i],1,idusuario);
		}
		temas.addComponents(itemListaTemas);
		
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
				Ajustes_usuario_perfil_heredar auv = new Ajustes_usuario_perfil_heredar();
				auv.setNavegador(navegador);
				auv.iniciar(idusuario);
				navegador.addView("a", auv);
				navegador.navigateTo("a");
			}
		});
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
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_usuario_registrado_heredar vfrh = new Vista_foro_usuario_registrado_heredar ();
				vfrh.setNavegador(navegador);
				vfrh.inicio(idusuario);
				navegador.addView("vfrh", vfrh);
				navegador.navigateTo("vfrh");
			}
		});
	}
}
