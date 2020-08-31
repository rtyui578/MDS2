package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Ajustes_usuario_perfil_heredar extends Ajustes_usuario_ventana implements View{
	Button ajustes,notificacion,cerrarsesion,usuarios,amigos,perfil,foro,modificarcontraseña,modificarperfil;
	VerticalLayout listaDeUsuarios;
	Label nombreusuario,email,contraseña;
	Navigator navegador;
	public Ajustes_usuario_perfil_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void iniciar(int idusuario){
		modificarcontraseña=this.modificarcontraseña_html;
		modificarperfil=this.modificarperfil_html;
		ajustes=this.ajustes_html;
		notificacion=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		usuarios=this.usuarios_html;
		amigos=this.amigos_html;
		perfil=this.perfil_html;
		nombreusuario=this.nombreusuario_html;
		email=this.emailusuario_htmlm;
		contraseña=this.contraseña_html;
		foro=this.foro_html;
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue(user.getNombre_usuario());
			email.setValue(user.getEmail());
			contraseña.setValue(user.getContraseña());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		usuarios.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_usuario_lista_heredar aulh = new Ajustes_usuario_lista_heredar();
				aulh.setNavegador(navegador);
				aulh.inicio(idusuario);
				navegador.addView("aulh", aulh);
				navegador.navigateTo("aulh");
			}
		});
		perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_usuario_perfil_heredar auph = new Ajustes_usuario_perfil_heredar();
				auph.setNavegador(navegador);
				auph.iniciar(idusuario);
				navegador.addView("auph", auph);
				navegador.navigateTo("auph");
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
		notificacion.addClickListener(new Button.ClickListener() {
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
		amigos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_usuario_amigos_heredar auah = new Ajustes_usuario_amigos_heredar();
				auah.setNavegador(navegador);
				auah.inicio(idusuario);
				navegador.addView("auah", auah);
				navegador.navigateTo("auah");
				
				}
		});
		modificarperfil.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Modificar_perfil_heredar mph = new Modificar_perfil_heredar();
				mph.setNavegador(navegador);
				mph.inicio(idusuario);
				navegador.addView("mph", mph);
				navegador.navigateTo("mph");
				
				}
		});
		modificarcontraseña.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Modificar_contraseña_heredar mch = new Modificar_contraseña_heredar();
				mch.setNavegador(navegador);
				mch.inicio(idusuario);
				navegador.addView("mch", mch);
				navegador.navigateTo("mch");
				
				}
		});
	}
	
}