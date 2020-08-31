package com.example.Foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import basededatos.NotificacionDAO;

public class Notificacion extends Notificacion_ventana implements View {
	
	Label n;
	
	public Notificacion(int idnotificacion){
		basededatos.Notificacion notificacion = null;
		try {
			notificacion = NotificacionDAO.getNotificacionByORMID(idnotificacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		n=this.valor_html;
		n.setValue(notificacion.getContenido_notificacion());
	}

	public void Eliminar_notificacion() {
		throw new UnsupportedOperationException();
	}
	
	public void crearNotificacion() {
		
	}
}
