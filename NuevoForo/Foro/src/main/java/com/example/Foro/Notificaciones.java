package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import basededatos.BD_Principal;
import basededatos.UsuarioDAO;


public class Notificaciones extends Notificaciones_ventana implements View {
	
	Button foro,ajustes,notificaciones,cerrarsesion;
	VerticalLayout listanotificaciones;
	Navigator navegador;
	BD_Principal bd;
	MyUI m;
	int id;
	
	public Notificaciones() {
		
	}
	
	public Notificaciones(MyUI myui) {
		// TODO Auto-generated constructor stub
		m=myui;
	}

	public void inicio(int idusuario) {
		id=idusuario;
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		listanotificaciones=this.listanotificaciones_html;
		bd = new BD_Principal();
		basededatos.Notificacion[] lnotificaciones=bd.notificacionesUsuario(idusuario);
		Notificacion[] lista = new Notificacion[lnotificaciones.length];
		for(int i=0;i< lnotificaciones.length;i++) {
			lista[i] = new Notificacion(lnotificaciones[i].getId_notificacion());
		}
		listanotificaciones.addComponents(lista);
		listanotificaciones.setHeight(lnotificaciones.length*30 + "%");
		

		foro.addClickListener(e->{
			Visualizar v =  new Visualizar(m);
			v.inicio(idusuario);
			m.setContent(v);
		});
	
		notificaciones.addClickListener(e->{
			Notificaciones notificaciones =  new Notificaciones(m);
			notificaciones.inicio(idusuario);
			m.setContent(notificaciones);
		});
	
		cerrarsesion.addClickListener(e->{
			Visualizar v =  new Visualizar(m);
			v.inicio(-1);
			m.setContent(v);
		});
		
		if(bd.listaAdministradores().contains(idusuario)) {
			ajustes.addClickListener(e-> {
					Ajustes_administrador ajustes =  new Ajustes_administrador(m);
					ajustes.inicio(idusuario,1);
					m.setContent(ajustes);
				
			});
		}
		else if(!bd.listaAdministradores().contains(idusuario) && bd.listaModeradores().contains(idusuario)) {
			ajustes.addClickListener(e-> {
					Ajustes_moderador ajustes =  new Ajustes_moderador(m);
					ajustes.inicio(idusuario,1);
					m.setContent(ajustes);
			});
			
		}
		else {
			ajustes.addClickListener(e-> {
				Ajustes ajustes =  new Ajustes(m);
				ajustes.inicio(idusuario,1);
				m.setContent(ajustes);
			
		});
		}
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	
	public basededatos.Notificacion[] notificacionesUsuario() {
		try {
			return UsuarioDAO.getUsuarioByORMID(id).tiene.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}