package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Ajustes_moderador_reportados_heredar extends Ajustes_moderador_reportados_ventana implements View{
	Button ajustes,notificacion,cerrarsesion,usuariosreportados,amigos,perfil,foro,listausuarios;
	VerticalLayout listaDeUsuariosReportados;
	Navigator navegador;
	public Ajustes_moderador_reportados_heredar() {
		
		}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int idusuario) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificacion=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		usuariosreportados=this.usuariosreportados_html;
		amigos=this.amigos_html;
		perfil=this.perfil_html;
		listaDeUsuariosReportados=this.listausuariosreportados_html;
		listausuarios=this.listausuarios_html;
		BD_Usuario bdusuario = new BD_Usuario();
		foro.Usuario[] usuarios=bdusuario.usuariosReportados();
		Item_lista_usuario_heredar[] listaItems = new Item_lista_usuario_heredar[usuarios.length];
		for(int i=0;i<usuarios.length;i++) {
			listaItems[i]=new Item_lista_usuario_heredar();
			listaItems[i].setNavegador(navegador);
			listaItems[i].inicio(usuarios[i],1,idusuario);
		}
			
		listaDeUsuariosReportados.addComponents(listaItems);
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
	}
}
