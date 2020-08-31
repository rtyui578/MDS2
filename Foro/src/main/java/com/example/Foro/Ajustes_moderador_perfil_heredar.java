package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Ajustes_moderador_perfil_heredar extends Ajustes_moderador_perfil_ventana implements View {
	Button ajustes,notificacion,cerrarsesion,usuariosreportados,amigos,perfil,mensajes,foro,listausuarios,mperfil,mcontraseña;
	VerticalLayout listaDeUsuarios;
	Label nombreusuario,email,contraseña;
	Navigator navegador;
	public Ajustes_moderador_perfil_heredar() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario) {
		foro=this.foro_html;
		listausuarios=this.listausuarios_html;
		ajustes=this.ajustes_html;
		notificacion=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		usuariosreportados=this.usuariosreportados_html;
		amigos=this.amigos_html;
		perfil=this.perfil_html;
		nombreusuario=this.nombreusuario_html;
		email=this.emailusuario_htmlm;
		contraseña=this.contraseña_html;
		mperfil=this.modificarperfil_html;
		mcontraseña=this.modificarcontraseña_html;
		
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue(user.getNombre_usuario());
			email.setValue(user.getEmail());
			contraseña.setValue(user.getContraseña());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_moderador_perfil_heredar amph = new Ajustes_moderador_perfil_heredar();
				amph.setNavegador(navegador);
				amph.inicio(idusuario);
				navegador.addView("amph", amph);
				navegador.navigateTo("amph");
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
				Ajustes_moderador_perfil_heredar amph = new Ajustes_moderador_perfil_heredar();
				amph.setNavegador(navegador);
				amph.inicio(idusuario);
				navegador.addView("amph", amph);
				navegador.navigateTo("amph");
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
				Ajustes_moderador_amigos_heredar amah = new Ajustes_moderador_amigos_heredar();
				amah.setNavegador(navegador);
				amah.iniciar(idusuario);
				navegador.addView("amah", amah);
				navegador.navigateTo("amah");
				
				}
		});
		usuariosreportados.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_moderador_reportados_heredar amrh = new Ajustes_moderador_reportados_heredar();
				amrh.setNavegador(navegador);
				amrh.inicio(idusuario);
				navegador.addView("amrh", amrh);
				navegador.navigateTo("amrh");
			}
		});
		listausuarios.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Ajustes_moderador_lista_heredar amlh = new Ajustes_moderador_lista_heredar();
				amlh.setNavegador(navegador);
				amlh.inicio(idusuario);
				navegador.addView("amlh", amlh);
				navegador.navigateTo("amlh");
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
