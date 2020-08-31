package com.example.Foro;

import javax.servlet.annotation.WebServlet;

import org.orm.PersistentException;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import foro.SeccionDAO;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
      Navigator navegador = new Navigator(this,this);
      Vista_foro_no_registrado_heredar vistaforo = new Vista_foro_no_registrado_heredar();
      vistaforo.setNavegador(navegador);
      vistaforo.iniciar();
      navegador.addView("Foro_no_registrado", vistaforo);
      navegador.navigateTo("Foro_no_registrado");
      /*Registrase_herencia reg = new Registrase_herencia();
      reg.setNavegador(navegador);
      navegador.addView("Registrarse", reg);
      navegador.navigateTo("Registrarse");*/
      /*Iniciar_sesion_heredar is = new Iniciar_sesion_heredar();
      navegador.addView("IS", is);
      navegador.navigateTo("IS");*/
      /*Vista_foro_administrador_heredar vf = new Vista_foro_administrador_heredar();
      navegador.addView("VFA", vf);
      navegador.navigateTo("VFA");*/
      /*Vista_foro_usuario_registrado_heredar vifo = new Vista_foro_usuario_registrado_heredar();
      vifo.setNavegador(navegador);
      vifo.inicio(2);
      navegador.addView("NUR",vifo);
      navegador.navigateTo("NUR");*/
      /*Vista_seccion_administrador_heredar vsah = new Vista_seccion_administrador_heredar();
      vsah.setNavegador(navegador);
      vsah.inicio(1, 2);
      navegador.addView("vsah", vsah);
      navegador.navigateTo("vsah");*/
      /*Vista_seccion_no_heredar vsnh = new Vista_seccion_no_heredar(1);
      navegador.addView("vsnh", vsnh);
      navegador.navigateTo("vsnh");*/
      /*Vista_seccion_registrado_heredar vsrh = new Vista_seccion_registrado_heredar(1);
      navegador.addView("vsrh", vsrh);
      navegador.navigateTo("vsrh");*/
      /*Vista_tema_no_registrado_herencia vtnrh = new Vista_tema_no_registrado_herencia(1);
      navegador.addView("vtnrh", vtnrh);
      navegador.navigateTo("vtnrh");*/
      /*Vista_tema_registrado_herencia vtrh = new Vista_tema_registrado_herencia(1);
      navegador.addView("vtrh", vtrh);
      navegador.navigateTo("vtrh");*/
      /*Vista_tema_moderador_heredar vtmh = new Vista_tema_moderador_heredar(1);
      navegador.addView("vtmh", vtmh);
      navegador.navigateTo("vtmh");*/
      /*Vista_usuario_registrado_heredar vurh = new Vista_usuario_registrado_heredar(2);
      navegador.addView("vurh", vurh);
      navegador.navigateTo("vurh");*/
      /*Vista_usuario_registrado_mensajes_heredar vurmh = new Vista_usuario_registrado_mensajes_heredar(2);
      navegador.addView("vurmh", vurmh);
      navegador.navigateTo("vurmh");*/
      /*Vista_usuario_registrado_amigos_heredar vurah = new Vista_usuario_registrado_amigos_heredar(2);
      navegador.addView("vurah", vurah);
      navegador.navigateTo("vurah");*/
      /*Vista_usuario_registrado_perfil_heredar vurph = new Vista_usuario_registrado_perfil_heredar(2);
      navegador.addView("vurph", vurph);
      navegador.navigateTo("vurph");*/
      /*Vista_usuario_moderador_perfil_heredar vumph = new Vista_usuario_moderador_perfil_heredar(2);
      navegador.addView("vumph", vumph);
      navegador.navigateTo("vumph");*/
      /*Vista_usuario_moderador_amigos_heredar vumah = new Vista_usuario_moderador_amigos_heredar(2);
      navegador.addView("vumah", vumah);
      navegador.navigateTo("vumah");*/
      /*Ajustes_usuario_lista_heredar aulh = new Ajustes_usuario_lista_heredar(2);
      navegador.addView("aulh", aulh);
      navegador.navigateTo("aulh");*/
      /*Ajustes_usuario_amigos_heredar auah = new Ajustes_usuario_amigos_heredar();
      auah.setNavegador(navegador);
      auah.inicio(2);
      navegador.addView("auah", auah);
      navegador.navigateTo("auah");*/
      /*Ajustes_usuario_perfil_heredar auph = new Ajustes_usuario_perfil_heredar(2);
      navegador.addView("auph", auph);
      navegador.navigateTo("auph");*/
      /*Ajustes_moderador_perfil_heredar amph = new Ajustes_moderador_perfil_heredar(2);
      navegador.addView("amph", amph);
      navegador.navigateTo("amph");*/
      /*Ajustes_moderador_amigos_heredar amah = new Ajustes_moderador_amigos_heredar(2);
      navegador.addView("amah", amah);
      navegador.navigateTo("amah");*/
      /*Ajustes_moderador_lista_heredar amlh = new Ajustes_moderador_lista_heredar(2);
      navegador.addView("amlh", amlh);
      navegador.navigateTo("amlh");*/
      /*BD_Usuario bd = new BD_Usuario();
      bd.reportarUsuario(0, 3);
      Ajustes_moderador_reportados_heredar amrh = new Ajustes_moderador_reportados_heredar(2);
      navegador.addView("amrh", amrh);
      navegador.navigateTo("amrh");*/
      /*Ajustes_administrador_amigos_heredar aaah = new Ajustes_administrador_amigos_heredar(2);
      navegador.addView("aaah", aaah);
      navegador.navigateTo("aaah");*/
      /*Ajustes_administrador_lista_heredar aalh = new Ajustes_administrador_lista_heredar(2);
      navegador.addView("aalh", aalh);
      navegador.navigateTo("aalh");*/
      /*Ajustes_administrador_mensajes_heredar aamh = new Ajustes_administrador_mensajes_heredar(2);
      navegador.addView("aamh", aamh);
      navegador.navigateTo("aamh");*/
      /*Ajustes_administrador_perfil_heredar aaph = new Ajustes_administrador_perfil_heredar(2);
      navegador.addView("aaph", aaph);
      navegador.navigateTo("aaph");*/
      /*Ajustes_administrador_revision_heredar aarh = new Ajustes_administrador_revision_heredar(2);
      navegador.addView("aarh", aarh);
      navegador.navigateTo("aarh");*/
      /*Ajustes_administrador_suspendidos_heredar asrh = new Ajustes_administrador_suspendidos_heredar(2);
      navegador.addView("aash", asrh);
      navegador.navigateTo("aash");*/
      /*BD_Notificacion bd = new BD_Notificacion();
      bd.añadirNotificacion("BNueva notificacion", 2);
      Notificaciones_heredar nh = new Notificaciones_heredar(2);
      navegador.addView("nh", nh);
      navegador.navigateTo("nh");*/
      /*Modificar_contraseña_heredar mch = new Modificar_contraseña_heredar(2);
      navegador.addView("mch", mch);
      navegador.navigateTo("mch");*/
      /*Modificar_perfil_heredar mph = new Modificar_perfil_heredar(2);
      navegador.addView("mph", mph);
      navegador.navigateTo("mph");

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }*/
	
}
}
