package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.TemaDAO;

public class Vista_tema_no_registrado_herencia extends Vista_tema_no_registrado implements View {
	Button foro,registrarse,iniciarsesion,vermas;
	Label titulotema;
	VerticalLayout mensajes;
	Navigator navegador;
	public Vista_tema_no_registrado_herencia() {
		
		}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void iniciar(int idtema) {
		foro=this.foro_html;
		registrarse=this.registrarse_html;
		iniciarsesion=this.iniciarsesion_html;
		titulotema=this.titulotema_html;
		mensajes=this.comentarios_html;
		BD_Mensaje bdmensajes = new BD_Mensaje();
		foro.Mensaje[] listamensajes = bdmensajes.mensajesDeTema(idtema);
		Item_lista_mensaje_heredar[] itemLista = new Item_lista_mensaje_heredar[listamensajes.length];
		for(int i=0;i<listamensajes.length;i++) {
			itemLista[i] = new Item_lista_mensaje_heredar();
			itemLista[i].setNavegador(navegador);
			itemLista[i].inicio(listamensajes[i],-1,-1);
		}
		mensajes.addComponents(itemLista);
		try {
			foro.Tema tema=TemaDAO.getTemaByORMID(idtema);
			titulotema.setValue(tema.getNombre());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
