package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Vista_usuario_registrado_perfil_heredar extends Vista_usuario_registrado_perfil implements View{
	Button mensajes,amigos,listausuarios,perfil,foro,ajustes,notificaciones,cerrarsesion,reportar,agregar;
	Label nombreusuario;
	TextField nombre;
	Navigator navegador;
	public Vista_usuario_registrado_perfil_heredar() {
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
		nombre=this.nombreusuario_html1;
		reportar=this.reportar_html;
		agregar=this.agregar_html;
		BD_Usuario bd = new BD_Usuario();
		
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue("Visualizando al usuario : " + user.getNombre_usuario());
			nombre.setValue(user.getEmail());
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
		reportar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				bd.reportarUsuario(idusuarionavega, idusuario);
			}
		});
		agregar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				bd.agregarAmigo(idusuarionavega, idusuario);
			}
		});
	}

}
