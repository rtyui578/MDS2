package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import foro.TemaDAO;
import foro.UsuarioDAO;

import com.vaadin.ui.Button.ClickEvent;

public class Vista_seccion_administrador_heredar extends Vista_seccion_administrador_ventana implements View {
	
	VerticalLayout temas;
	Button vermas,publicar,foro,ajustes,notificaciones,cerrarsesion;
	TextField titulo;
	Label tituloseccion;
	Navigator navegador;
	public Vista_seccion_administrador_heredar() {
		}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(int id,int idusuario) {
		foro=this.foro_html;
		notificaciones=this.notificaciones_html;
		ajustes=this.ajustes_html;
		cerrarsesion=this.cerrarsesion_html;
		temas=this.tema_html;
		titulo=this.titulo_html;
		
		publicar=this.creartema_html;
		tituloseccion=this.tituloseccion_html;
		BD_Principal bd= new BD_Principal();
		int i;
		BD_Seccion bdseccion = new BD_Seccion();
		foro.Seccion seccion = bdseccion.buscarSeccion(id);
		tituloseccion.setValue(seccion.getNombre());
		BD_Tema bdtema = new BD_Tema();
		foro.Tema[] lista2 = bdtema.temasDeSeccion(id);
		Item_lista_tema_heredar[] itemListaTemas = new Item_lista_tema_heredar[lista2.length];
		for(i=0;i<lista2.length;i++) {
			itemListaTemas[i] = new Item_lista_tema_heredar();
			itemListaTemas[i].setNavegador(null);
			itemListaTemas[i].iniciar(lista2[i],0,idusuario);
		}
		temas.addComponents(itemListaTemas);
		publicar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				foro.Tema tema = new foro.Tema();
				tema.setNombre(titulo.getValue());
				foro.Usuario user = null;
				try {
					user = UsuarioDAO.getUsuarioByORMID(2);
					tema.setNum__likes(0);
					tema.setCreado_por(user);
					tema.setORM_Pertenece_a(seccion);
					TemaDAO.save(tema);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
				Vista_foro_administrador_heredar vfah = new Vista_foro_administrador_heredar();
				vfah.setNavegador(navegador);
				vfah.inicio(idusuario);
				navegador.addView("vfah", vfah);
				navegador.navigateTo("vfah");
			}
		});
	}


}
