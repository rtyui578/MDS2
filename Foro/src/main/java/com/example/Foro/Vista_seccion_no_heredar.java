package com.example.Foro;



import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;



public class Vista_seccion_no_heredar extends Vista_seccion_no_ventana implements View{
	Button iniciarsesion,foro,registrarse;
	VerticalLayout temas;
	Label tituloseccion;
	Navigator navegador;
	public  Vista_seccion_no_heredar() {		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
}
	public void iniciar(int id) {
		temas=this.tema_html;
		iniciarsesion=this.iniciarsesion_html;
		foro=this.foro_html;
		registrarse=this.registrarse_html;
		tituloseccion=this.tituloseccion_html;
		int i;
		BD_Seccion bdseccion = new BD_Seccion();
		foro.Seccion seccion = bdseccion.buscarSeccion(id);
		tituloseccion.setValue(seccion.getNombre());
		BD_Tema bdtema = new BD_Tema();
		foro.Tema[] lista2 = bdtema.temasDeSeccion(id);
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[lista2.length];
		for(i=0;i<lista2.length;i++) {
			navegador.getCurrentNavigationState();
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(navegador);
			itemListaTemas[i].iniciar(lista2[i],0,-1);
		}
		temas.addComponents(itemListaTemas);
		
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
}
