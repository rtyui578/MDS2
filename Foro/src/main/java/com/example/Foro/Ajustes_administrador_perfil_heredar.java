package com.example.Foro;



import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.Usuario;
import foro.UsuarioDAO;

public class Ajustes_administrador_perfil_heredar extends Ajustes_administrador_perfil_ventana implements View{
	Button ajustes,notificacion,cerrarsesion,usuariosreportados,amigos,perfil,mensajes,foro,usuariosbaneados,modificarmensajes,mperfil,mcontraseña;
	Label nombreusuario,email,contraseña;
	Navigator navegador;
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
public Ajustes_administrador_perfil_heredar() {
		
	}
	public void inicio(int idusuario) {
		foro=this.foro_html;
		usuariosbaneados=this.baneados_html;
		usuariosreportados=this.reportados_html;
		modificarmensajes=this.mensajes_html;
		ajustes=this.ajustes_html;
		notificacion=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		usuariosreportados=this.reportados_html;
		amigos=this.amigos_html;
		perfil=this.perfil_html;
		nombreusuario=this.nombreusuario_html;
		email=this.emailusuario_htmlm;
		contraseña=this.contraseña_html;
		mperfil=this.mperfil_html;
		mcontraseña=this.mcontraseña_html;
		foro.Usuario user = new foro.Usuario();
		nombreusuario.setValue(user.getNombre_usuario());
		email.setValue(user.getEmail());
		contraseña.setValue(user.getContraseña());
		
		perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_perfil_heredar aaph = new Ajustes_administrador_perfil_heredar();
				aaph.setNavegador(navegador);
				aaph.inicio(idusuario);
				navegador.addView("aaph", aaph);
				navegador.navigateTo("aaph");
			}
		});
		foro.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_foro_administrador_heredar vfarh = new Vista_foro_administrador_heredar();
				vfarh.setNavegador(navegador);
				vfarh.inicio(idusuario);
				navegador.addView("vfarh", vfarh);
				navegador.navigateTo("vfarh");
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
				Ajustes_administrador_perfil_heredar aaph = new Ajustes_administrador_perfil_heredar();
				aaph.setNavegador(navegador);
				aaph.inicio(idusuario);
				navegador.addView("aaph", aaph);
				navegador.navigateTo("aaph");
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
				Ajustes_administrador_amigos_heredar aaah = new Ajustes_administrador_amigos_heredar();
				aaah.setNavegador(navegador);
				aaah.iniciar(idusuario);
				navegador.addView("aaah", aaah);
				navegador.navigateTo("aaah");
				
				}
		});
		usuariosreportados.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_revision_heredar aarh = new Ajustes_administrador_revision_heredar();
				aarh.setNavegador(navegador);
				aarh.iniciar(idusuario);
				navegador.addView("aarh", aarh);
				navegador.navigateTo("aarh");
			}
		});
		usuariosbaneados.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_suspendidos_heredar aash = new Ajustes_administrador_suspendidos_heredar();
				aash.setNavegador(navegador);
				aash.iniciar(idusuario);
				navegador.addView("aash", aash);
				navegador.navigateTo("aash");
			}
		});
		modificarmensajes.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_administrador_mensajes_heredar aamh = new Ajustes_administrador_mensajes_heredar();
				aamh.setNavegador(navegador);
				aamh.inicio(idusuario);
				navegador.addView("aamh", aamh);
				navegador.navigateTo("aamh");
			}
		});
		mperfil.addClickListener(new Button.ClickListener() {
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
		mcontraseña.addClickListener(new Button.ClickListener() {
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
