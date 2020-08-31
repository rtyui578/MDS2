package com.example.Foro;

import org.orm.PersistentException;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import basededatos.BD_Principal;
import basededatos.UsuarioDAO;

public class Vista_usuario_heredar extends Vista_usuario_ventana implements View {
	
	Button reportar,banear,agregar,nombreboton;
	Navigator navegador;
	BD_Principal bd;
	basededatos.Usuario user;
	MyUI m;
	
	public Vista_usuario_heredar() {
		
	}
	
	public Vista_usuario_heredar(MyUI myui) {
		// TODO Auto-generated constructor stub
		m=myui;
	}

	public void inicio(int idusuariove, int idusuariovisto, int tipo) {
		reportar=this.reportar_html;
		banear=this.banear_html;
		agregar=this.agregar_html;
		nombreboton=this.nombreusuario_html;
		bd = new BD_Principal();
		System.out.println(idusuariovisto);
		user = null;
		try {
			user = UsuarioDAO.getUsuarioByORMID(idusuariovisto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nombreboton.setCaption(user.getNombre_usuario());
		agregar.setVisible(false);
		banear.setVisible(false);
		reportar.setVisible(false);
		nombreboton.addClickListener(e-> {
				Usuario usuario = new Usuario(m);
				usuario.inicio(idusuariove,idusuariovisto,1);
				m.setContent(usuario);
				
		});
		//Lista reportados
		if(tipo==1) {
			if(bd.listaAdministradores().contains(idusuariove)) {
				reportar.setVisible(true);
				reportar.setCaption("Desreportar");
				reportar.addClickListener(e-> {
						System.out.println(idusuariovisto);
						bd.quitarReportado(idusuariovisto);
						Ajustes_administrador aa = new Ajustes_administrador(m);
						aa.inicio(idusuariove,4);
						m.setContent(aa);
				});
				banear.setVisible(true);
				banear.addClickListener(e-> {
						bd.banearUsuario(idusuariovisto);
						Ajustes_administrador aa = new Ajustes_administrador(m);
						aa.inicio(idusuariove,5);
						m.setContent(aa);
						});
			}
			else {
				reportar.setVisible(true);
				reportar.setCaption("Desreportar");
				reportar.addClickListener(e->{
						bd.quitarReportado(idusuariovisto);
						Ajustes_moderador aa = new Ajustes_moderador(m);
						aa.inicio(idusuariove,4);
						m.setContent(aa);
				});
				banear.setVisible(true);
				banear.addClickListener(e->{
						bd.banearUsuario(idusuariovisto);
						Ajustes_moderador aa = new Ajustes_moderador(m);
						aa.inicio(idusuariove,4);
						m.setContent(aa);
				});
			}
		}
		//Lista baneados
		else if(tipo==2) {
			reportar.setVisible(true);
			reportar.setCaption("Eliminar");
			reportar.addClickListener(e-> {
					bd.eliminarUsuario(idusuariovisto);
					Ajustes_administrador aa = new Ajustes_administrador(m);
					aa.inicio(idusuariove,5);
					m.setContent(aa);
			});
			banear.setVisible(true);
			banear.setCaption("Desbanear");
			banear.addClickListener(e->{
					bd.desbanearUsuario(idusuariovisto);
					Ajustes_administrador aa = new Ajustes_administrador(m);	
					aa.inicio(idusuariove,5);
					m.setContent(aa);
			});
		}
		
		else {
			
		}
	}
	
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}

}
