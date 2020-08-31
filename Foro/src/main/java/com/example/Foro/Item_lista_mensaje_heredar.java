package com.example.Foro;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Item_lista_mensaje_heredar extends Item_lista_mensaje implements View {
	
	Label contenido,likes,respuestas;
	Button borrar,like,contestar,autor;
	Navigator navegador;
	public Item_lista_mensaje_heredar(){
	
}
	public void setNavegador(Navigator nav) {
		navegador=nav;
	}
	public void inicio(foro.Mensaje mensaje,int nivel,int idusuario) {
		contenido=this.contenido_html;
		likes=this.likes_html;
		respuestas=this.respuestas_html;
		autor=this.usuarioautor_html;
		borrar=this.borrar_html;
		like=this.like_html;
		contestar=this.contestar_html;
		contestar.setVisible(false);
		try {
		contenido.setValue(mensaje.getContenido());
		likes.setValue(mensaje.getNum_likes()+"");
		autor.setCaption(mensaje.getPertenece_a().getNombre_usuario());
		
		}catch(NullPointerException e){
			
		}
		
		
		//UsuarioNoRegistrado
		if(nivel==-1) {
		borrar.setVisible(false);
		like.setVisible(false);
		contestar.setVisible(false);
		}
		//UsuarioRegistrado
		if(nivel==1) {
			respuestas.setVisible(false);
			borrar.setVisible(false);
			like.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					BD_Mensaje bd = new BD_Mensaje();
					bd.me_Gusta_Mensaje(mensaje.getId_mensaje(), idusuario);
					mensaje.setNum_likes(mensaje.getNum_likes()+1);
					likes.setValue(mensaje.getNum_likes()+"");
				}
			});
			autor.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					Vista_usuario_registrado_perfil_heredar vurph = new Vista_usuario_registrado_perfil_heredar();
					vurph.setNavegador(navegador);
					vurph.inicio(mensaje.getPertenece_a().getId_usuario(), idusuario);
					navegador.addView("vurph", vurph);
					navegador.navigateTo("vurph");
				}
			});
			
		}
		//Moderador
		if(nivel==2) {
			respuestas.setVisible(false);
		}
		//Mensajes de un perfil
		if(nivel==10) {
			borrar.setVisible(false);
			like.setVisible(false);
			contestar.setVisible(false);
			respuestas.setValue("Numero de respuestas = ");
			likes.setValue("Numero de likes = " + mensaje.getNum_likes()+"");
			
		}
	}

}
