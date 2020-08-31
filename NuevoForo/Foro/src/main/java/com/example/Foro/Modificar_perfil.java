package com.example.Foro;

import org.orm.PersistentException;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import basededatos.BD_Principal;
import basededatos.UsuarioDAO;

public class Modificar_perfil extends Modificar_perfil_ventana implements View {
	
	Button cambiar;
	TextField nombre,email;
	Navigator navegador;
	BD_Principal bd;
	MyUI m;

	public Modificar_perfil() {
		
	}

	public Modificar_perfil(MyUI myui) {
		// TODO Auto-generated constructor stub
		m=myui;
	}

	public void inicio(int idusuario) {
		cambiar=this.cambiar_html;
		nombre=this.nombre_html;
		email=this.emial_html;
		basededatos.Usuario user=null;
		bd = new BD_Principal();
		try {
			user = UsuarioDAO.getUsuarioByORMID(idusuario);
			nombre.setValue(user.getNombre_usuario());
			email.setValue(user.getEmail());
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		cambiar.addClickListener(e-> {
				try {
					basededatos.Usuario usuario = UsuarioDAO.getUsuarioByORMID(idusuario);
					if(usuario.getEmail().equals(email.getValue())==false)
						usuario.setEmail(email.getValue());
					if(usuario.getNombre_usuario().equals(nombre.getValue())==false)
						usuario.setEmail(nombre.getValue());
					UsuarioDAO.save(usuario);
					
					if(bd.listaAdministradores().contains(idusuario)) {
						Ajustes_administrador ajustes =  new Ajustes_administrador(m);
						ajustes.inicio(idusuario,1);
						m.setContent(ajustes);
					}
					else if(!bd.listaAdministradores().contains(idusuario) && bd.listaModeradores().contains(idusuario)) {
						Ajustes_moderador ajustes =  new Ajustes_moderador(m);
						ajustes.inicio(idusuario,1);
						m.setContent(ajustes);
					}
					else {
						Ajustes ajustes =  new Ajustes();
						ajustes.inicio(idusuario,1);
						m.setContent(ajustes);
					}
			} catch (PersistentException i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
				}
		});
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	
	
}