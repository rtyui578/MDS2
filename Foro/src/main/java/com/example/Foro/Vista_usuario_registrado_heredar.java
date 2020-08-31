package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import foro.UsuarioDAO;

public class Vista_usuario_registrado_heredar extends Vista_usuario_registrado_ventana implements View{
	Button foro,ajustes,notificaciones,cerrarsesion;
	Label nombreusuario;
	public Vista_usuario_registrado_heredar(int idusuario) {
		foro=this.foro_html;
		ajustes=this.ajustes_html;
		notificaciones=this.notificaciones_html;
		cerrarsesion=this.cerrarsesion_html;
		nombreusuario=this.nombreusuario_html;
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombreusuario.setValue("Visualizando al usuario : " + user.getNombre_usuario());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
