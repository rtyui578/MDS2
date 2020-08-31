package com.example.Foro;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;

public class Item_lista_notificacion_heredar extends Item_lista_notificacion implements View{
	Label n;
	public Item_lista_notificacion_heredar(foro.Notificacion noti){
		n=this.valor_html;
		n.setValue(noti.getTitulo());
	}
}
