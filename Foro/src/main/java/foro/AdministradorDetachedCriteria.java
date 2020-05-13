/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package foro;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute;
	public final CollectionExpression es_amigo_de;
	public final IntegerExpression ID;
	public final IntegerExpression id_usuario;
	public final StringExpression email;
	public final StringExpression contraseña;
	public final StringExpression nombre_usuario;
	public final CollectionExpression crea_un;
	public final CollectionExpression escribe;
	public final CollectionExpression reporta_a;
	public final CollectionExpression tiene;
	public final CollectionExpression es_su_amigo;
	public final IntegerExpression eliminado_porId;
	public final AssociationExpression eliminado_por;
	public final CollectionExpression gusta;
	public final CollectionExpression es_reportado_por;
	public final CollectionExpression le_da_me_gusta;
	public final CollectionExpression borra;
	public final CollectionExpression crea;
	public final CollectionExpression elimina;
	
	public AdministradorDetachedCriteria() {
		super(foro.Administrador.class, foro.AdministradorCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea_un = new CollectionExpression("ORM_crea_un", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		reporta_a = new CollectionExpression("ORM_reporta_a", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this.getDetachedCriteria());
		eliminado_porId = new IntegerExpression("eliminado_por.attribute", this.getDetachedCriteria());
		eliminado_por = new AssociationExpression("eliminado_por", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this.getDetachedCriteria());
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this.getDetachedCriteria());
		borra = new CollectionExpression("ORM_borra", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.AdministradorCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea_un = new CollectionExpression("ORM_crea_un", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		reporta_a = new CollectionExpression("ORM_reporta_a", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this.getDetachedCriteria());
		eliminado_porId = new IntegerExpression("eliminado_por.attribute", this.getDetachedCriteria());
		eliminado_por = new AssociationExpression("eliminado_por", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this.getDetachedCriteria());
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this.getDetachedCriteria());
		borra = new CollectionExpression("ORM_borra", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
	}
	
	public foro.SeccionesDetachedCriteria createCreaCriteria() {
		return new foro.SeccionesDetachedCriteria(createCriteria("ORM_crea"));
	}
	
	public foro.UsuarioDetachedCriteria createEliminaCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_elimina"));
	}
	
	public foro.MensajeDetachedCriteria createBorraCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_borra"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_amigo_deCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public foro.TemasDetachedCriteria createCrea_unCriteria() {
		return new foro.TemasDetachedCriteria(createCriteria("ORM_crea_un"));
	}
	
	public foro.MensajeDetachedCriteria createEscribeCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_escribe"));
	}
	
	public foro.UsuarioDetachedCriteria createReporta_aCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_reporta_a"));
	}
	
	public foro.NotificacionesDetachedCriteria createTieneCriteria() {
		return new foro.NotificacionesDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_su_amigoCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_su_amigo"));
	}
	
	public AdministradorDetachedCriteria createEliminado_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("eliminado_por"));
	}
	
	public foro.MensajeDetachedCriteria createGustaCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_gusta"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_reportado_porCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_reportado_por"));
	}
	
	public foro.TemasDetachedCriteria createLe_da_me_gustaCriteria() {
		return new foro.TemasDetachedCriteria(createCriteria("ORM_le_da_me_gusta"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

