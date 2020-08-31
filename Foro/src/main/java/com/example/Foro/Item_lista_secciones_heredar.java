package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Item_lista_secciones_heredar extends Item_lista_seccion implements com.vaadin.navigator.View {

	Label nombre,numeromensajes,numerotemas;
	Button borrar,nombreseccion;
	Navigator navegador;
	public Item_lista_secciones_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void iniciar(foro.Seccion seccion,int nivel,int idusuario) {
		nombre = this.nombre_html;
		nombre.setValue(seccion.getNombre());
		borrar=this.borrar_html;
		nombreseccion=this.botonnombreseccion_html;
		nombreseccion.setCaption(seccion.getNombre());
		borrar.setVisible(false);
		nombre.setVisible(false);
		numerotemas=this.numerotemas_html;
		numerotemas.setValue("Numero temas: "+seccion.tiene.toArray().length);
		if(nivel==-1) {
			nombreseccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_seccion_no_heredar vsnh = new Vista_seccion_no_heredar();
				vsnh.setNavegador(navegador);
				vsnh.iniciar(seccion.getId__seccion());
				navegador.addView("vsnh", vsnh);
				navegador.navigateTo("vsnh");
			}
		});
		}
		
		if(nivel==1) {
			nombreseccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_seccion_registrado_heredar vsrh = new Vista_seccion_registrado_heredar();
				vsrh.setNavegador(navegador);
				vsrh.inicio(seccion.getId__seccion(),idusuario);
				navegador.addView("vsrh", vsrh);
				navegador.navigateTo("vsrh");
			}
		});
		}
		
		
		
	}

}
