package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import basededatos.BD_Principal;
import basededatos.MensajeDAO;

public class Mensaje extends Mensaje_ventana implements View {
	
	Label contenido,likes,respuestas;
	Button borrar,like,contestar,autor;
	Navigator navegador;
	BD_Principal bd;
	int id;
	
	public Mensaje() {
		
	}
	public void inicio(int idmensaje) {
		id=idmensaje;
		System.out.println(idmensaje);
		likes=this.likes_html;
		respuestas=this.respuestas_html;
		autor=this.usuarioautor_html;
		borrar=this.borrar_html;
		like=this.like_html;
		contestar=this.contestar_html;
		contenido=this.contenido_html;
		bd= new BD_Principal();
		basededatos.Mensaje mensaje=conseguirMensaje();
		
		contenido.setValue(mensaje.getContenido_mensaje());
		autor.setCaption(mensaje.getPertenece_a().getNombre_usuario());
		respuestas.setValue("Respuestas : " + bd.respuestas(idmensaje).size());
		likes.setValue("Likes :" + mensaje.getNum_likes_mensaje());
		
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	
	
	
	public void borrarMensaje() {
		bd.borrarMensaje_(id);
		borrar.setCaption("Borrado");
	}
	
	public basededatos.Mensaje conseguirMensaje() {
		try {
			return MensajeDAO.getMensajeByORMID(id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void gustarMensaje() {
		bd.gustarMensaje(1, id);
	}
}