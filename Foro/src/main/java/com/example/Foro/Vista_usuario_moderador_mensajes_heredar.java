package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.UsuarioDAO;

public class Vista_usuario_moderador_mensajes_heredar extends Vista_usuario_moderador_mensajes_ventana implements View {
	Button mensajes,amigos,listausuarios,perfil,foro,ajustes,notificaciones,cerrarsesion;
	Label nombreusuario;
	VerticalLayout listacomentarios;
	Navigator navegador;
	public Vista_usuario_moderador_mensajes_heredar() {
		
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
		listausuarios=this.usuarios_html;
		perfil=this.perfil_html;
		mensajes=this.mensajes_html;
		listacomentarios=this.listamensajes_html;
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue("Visualizando al usuario : " + user.getNombre_usuario());
		    BD_Mensaje bdmensaje = new BD_Mensaje();
			foro.Mensaje[] listaMensajes = bdmensaje.conseguirMensajes(idusuario);
			System.out.println(listaMensajes.length);
			Item_lista_mensaje_heredar[] listaItems = new Item_lista_mensaje_heredar[listaMensajes.length];
			for(int i=0;i<listaMensajes.length;i++) {
				listaItems[i]=new Item_lista_mensaje_heredar();
				listaItems[i].setNavegador(navegador);
				listaItems[i].inicio(listaMensajes[i],10,idusuarionavega);
						
			}
			listacomentarios.addComponents(listaItems);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_moderador_perfil_heredar amph = new Vista_usuario_moderador_perfil_heredar();
				amph.setNavegador(navegador);
				amph.inicio(idusuario,idusuarionavega);
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
				Ajustes_moderador_perfil_heredar amph = new Ajustes_moderador_perfil_heredar();
				amph.setNavegador(navegador);
				amph.inicio(idusuarionavega);
				navegador.addView("amph", amph);
				navegador.navigateTo("amph");
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
				Vista_usuario_moderador_amigos_heredar vumah = new Vista_usuario_moderador_amigos_heredar();
				vumah.setNavegador(navegador);
				vumah.inicio(idusuario,idusuarionavega);
				navegador.addView("vumah", vumah);
				navegador.navigateTo("vumah");
				
				}
		});
		mensajes.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Vista_usuario_moderador_mensajes_heredar vummh = new Vista_usuario_moderador_mensajes_heredar();
				vummh.setNavegador(navegador);
				vummh.inicio(idusuario,idusuarionavega);
				navegador.addView("vummh", vummh);
				navegador.navigateTo("vummh");
			}
		});
	}

}
