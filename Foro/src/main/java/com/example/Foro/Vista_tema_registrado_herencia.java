package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import foro.MensajeDAO;
import foro.TemaDAO;
import foro.UsuarioDAO;

public class Vista_tema_registrado_herencia extends Vista_tema_registrado_ventana implements View {
	Button foro,ajustes,notificaciones,cerrarsesion,vermas,publicar;
	Label titulotema;
	VerticalLayout mensajes;
	TextField contenido;
	Navigator navegador;
	public Vista_tema_registrado_herencia() {
		
	}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void iniciar(int idtema,int idusuario) {
		publicar=this.publicar_html;
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		titulotema=this.titulotema_html;
		mensajes=this.comentarios_html;
		contenido=this.contenidocomentario_html;
		foro.Tema tema=null;
		BD_Mensaje bdmensajes = new BD_Mensaje();
		foro.Mensaje[] listamensajes = bdmensajes.mensajesDeTema(idtema);
		Item_lista_mensaje_heredar[] itemLista = new Item_lista_mensaje_heredar[listamensajes.length];
		for(int i=0;i<listamensajes.length;i++) {
			itemLista[i] = new Item_lista_mensaje_heredar();
			itemLista[i].setNavegador(navegador);
			itemLista[i].inicio(listamensajes[i],1,idusuario);
		}
		mensajes.addComponents(itemLista);
		try {
			tema=TemaDAO.getTemaByORMID(idtema);
			titulotema.setValue(tema.getNombre());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publicar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
			foro.Mensaje mensaje = new foro.Mensaje();
			mensaje.setContenido(contenido.getValue());
			mensaje.setNum_likes(0);
			foro.Usuario user;
			BD_Mensaje bd = new BD_Mensaje();
			try {
				mensaje.setSon_de(TemaDAO.getTemaByORMID(idtema));
				foro.Tema tema=TemaDAO.getTemaByORMID(idtema);
				user = UsuarioDAO.getUsuarioByORMID(2);
				mensaje.setPertenece_a(user);
				MensajeDAO.save(mensaje);
				tema.tiene.add(mensaje);
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
		
	}

}
