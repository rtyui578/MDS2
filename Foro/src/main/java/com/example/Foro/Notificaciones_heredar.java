package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Notificaciones_heredar extends Notificaciones_ventana implements View{
	Button foro,ajustes,notificaciones,cerrarsesion;
	VerticalLayout listanotificaciones;
	Navigator navegador;
	public Notificaciones_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}

	public void inicio(int idusuario) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		listanotificaciones=this.listanotificaciones_html;
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			BD_Notificacion bd = new BD_Notificacion();
			foro.Notificacion[] notificaciones=bd.Notificaciones(idusuario);
			Item_lista_notificacion_heredar[] lista = new Item_lista_notificacion_heredar[notificaciones.length];
			for(int i=0;i<notificaciones.length;i++) {
				lista[i] = new Item_lista_notificacion_heredar(notificaciones[i]);
			}
			listanotificaciones.addComponents(lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
				Vista_foro_usuario_registrado_heredar vfurh = new Vista_foro_usuario_registrado_heredar();
				vfurh.setNavegador(navegador);
				vfurh.inicio(idusuario);
				navegador.addView("vfurh", vfurh);
				navegador.navigateTo("vfurh");
			}
		});
		
	}
}
