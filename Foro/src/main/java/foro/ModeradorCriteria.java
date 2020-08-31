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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ModeradorCriteria extends AbstractORMCriteria {
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
	public final CollectionExpression borra;
	
	public ModeradorCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		eliminado_porId = new IntegerExpression("eliminado_por.", this);
		eliminado_por = new AssociationExpression("eliminado_por", this);
		email = new StringExpression("email", this);
		contraseña = new StringExpression("contraseña", this);
		nombre_usuario = new StringExpression("nombre_usuario", this);
		crea_un = new CollectionExpression("ORM_crea_un", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this);
		reporta_a = new CollectionExpression("ORM_reporta_a", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this);
		gusta = new CollectionExpression("ORM_gusta", this);
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this);
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this);
		borra = new CollectionExpression("ORM_borra", this);
	}
	
	public ModeradorCriteria(PersistentSession session) {
		this(session.createCriteria(Moderador.class));
	}
	
	public ModeradorCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public foro.MensajeCriteria createBorraCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_borra"));
	}
	
	public AdministradorCriteria createEliminado_porCriteria() {
		return new AdministradorCriteria(createCriteria("eliminado_por"));
	}
	
	public foro.TemaCriteria createCrea_unCriteria() {
		return new foro.TemaCriteria(createCriteria("ORM_crea_un"));
	}
	
	public foro.MensajeCriteria createEscribeCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_escribe"));
	}
	
	public foro.UsuarioCriteria createEs_amigo_deCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public foro.UsuarioCriteria createReporta_aCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_reporta_a"));
	}
	
	public foro.NotificacionCriteria createTieneCriteria() {
		return new foro.NotificacionCriteria(createCriteria("ORM_tiene"));
	}
	
	public foro.UsuarioCriteria createEs_su_amigoCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_su_amigo"));
	}
	
	public foro.MensajeCriteria createGustaCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_gusta"));
	}
	
	public foro.UsuarioCriteria createEs_reportado_porCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_reportado_por"));
	}
	
	public foro.TemaCriteria createLe_da_me_gustaCriteria() {
		return new foro.TemaCriteria(createCriteria("ORM_le_da_me_gusta"));
	}
	
	public Moderador uniqueModerador() {
		return (Moderador) super.uniqueResult();
	}
	
	public Moderador[] listModerador() {
		java.util.List list = super.list();
		return (Moderador[]) list.toArray(new Moderador[list.size()]);
	}
}

