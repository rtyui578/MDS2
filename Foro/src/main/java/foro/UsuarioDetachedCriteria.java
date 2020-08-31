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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final IntegerExpression eliminado_porId;
	public final AssociationExpression eliminado_por;
	public final StringExpression email;
	public final StringExpression contraseña;
	public final StringExpression nombre_usuario;
	public final CollectionExpression crea_un;
	public final CollectionExpression escribe;
	public final CollectionExpression es_amigo_de;
	public final CollectionExpression reporta_a;
	public final CollectionExpression tiene;
	public final CollectionExpression es_su_amigo;
	public final CollectionExpression gusta;
	public final CollectionExpression es_reportado_por;
	public final CollectionExpression le_da_me_gusta;
	
	public UsuarioDetachedCriteria() {
		super(foro.Usuario.class, foro.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		eliminado_porId = new IntegerExpression("eliminado_por.", this.getDetachedCriteria());
		eliminado_por = new AssociationExpression("eliminado_por", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea_un = new CollectionExpression("ORM_crea_un", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		reporta_a = new CollectionExpression("ORM_reporta_a", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this.getDetachedCriteria());
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		eliminado_porId = new IntegerExpression("eliminado_por.", this.getDetachedCriteria());
		eliminado_por = new AssociationExpression("eliminado_por", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea_un = new CollectionExpression("ORM_crea_un", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		reporta_a = new CollectionExpression("ORM_reporta_a", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this.getDetachedCriteria());
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEliminado_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("eliminado_por"));
	}
	
	public foro.TemaDetachedCriteria createCrea_unCriteria() {
		return new foro.TemaDetachedCriteria(createCriteria("ORM_crea_un"));
	}
	
	public foro.MensajeDetachedCriteria createEscribeCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_escribe"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_amigo_deCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public foro.UsuarioDetachedCriteria createReporta_aCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_reporta_a"));
	}
	
	public foro.NotificacionDetachedCriteria createTieneCriteria() {
		return new foro.NotificacionDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_su_amigoCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_su_amigo"));
	}
	
	public foro.MensajeDetachedCriteria createGustaCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_gusta"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_reportado_porCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_reportado_por"));
	}
	
	public foro.TemaDetachedCriteria createLe_da_me_gustaCriteria() {
		return new foro.TemaDetachedCriteria(createCriteria("ORM_le_da_me_gusta"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

