package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import foro.TemaDAO;

import com.vaadin.ui.Button.ClickEvent;

public class Item_lista_tema_heredar extends Item_lista_tema implements View {

	Label nombre,mensajes,likes;
	Button borrar,like,nombreboton;
	Navigator navegador;
	public Item_lista_tema_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void iniciar(foro.Tema tema, int nivel,int id_usuario) {
		mensajes=this.numeromensajes_html;
		likes=this.numerolikes_html;
		borrar=this.borrar_html;
		like=this.like_html;
		nombreboton=this.nombretemaboton_html;
		likes.setValue("Numlikes:"+tema.getNum__likes());
		mensajes.setValue("Numero mensajes:"+tema.tiene.toArray().length);
		try {
		nombreboton.setCaption(tema.getNombre());
		} catch(NullPointerException e) {
			
		}
		if(nivel==-1) {
			borrar.setVisible(false);
			like.setVisible(false);
			nombreboton.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_tema_no_registrado_herencia vt = new Vista_tema_no_registrado_herencia();
					vt.setNavegador(navegador);
					vt.iniciar(tema.getId_tema());
					navegador.addView("vt", vt);
					navegador.navigateTo("vt");
				}
			});
		}
		if(nivel==1) {
			borrar.setVisible(false);
			nombreboton.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_tema_registrado_herencia vtr = new Vista_tema_registrado_herencia();
					vtr.setNavegador(navegador);
					vtr.iniciar(tema.getId_tema(),id_usuario);
					navegador.addView("vtr", vtr);
					navegador.navigateTo("vtr");
				}
			});
			like.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					tema.setNum__likes(tema.getNum__likes()+1);
					try {
						TemaDAO.save(tema);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
		
	}
}
