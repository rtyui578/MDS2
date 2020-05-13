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

public class AdministradorCriteria extends AbstractORMCriteria {
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
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this);
		ID = new IntegerExpression("ID", this);
		id_usuario = new IntegerExpression("id_usuario", this);
		email = new StringExpression("email", this);
		contraseña = new StringExpression("contraseña", this);
		nombre_usuario = new StringExpression("nombre_usuario", this);
		crea_un = new CollectionExpression("ORM_crea_un", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		reporta_a = new CollectionExpression("ORM_reporta_a", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		es_su_amigo = new CollectionExpression("ORM_es_su_amigo", this);
		eliminado_porId = new IntegerExpression("eliminado_por.attribute", this);
		eliminado_por = new AssociationExpression("eliminado_por", this);
		gusta = new CollectionExpression("ORM_gusta", this);
		es_reportado_por = new CollectionExpression("ORM_es_reportado_por", this);
		le_da_me_gusta = new CollectionExpression("ORM_le_da_me_gusta", this);
		borra = new CollectionExpression("ORM_borra", this);
		crea = new CollectionExpression("ORM_crea", this);
		elimina = new CollectionExpression("ORM_elimina", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public foro.SeccionesCriteria createCreaCriteria() {
		return new foro.SeccionesCriteria(createCriteria("ORM_crea"));
	}
	
	public foro.UsuarioCriteria createEliminaCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_elimina"));
	}
	
	public foro.MensajeCriteria createBorraCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_borra"));
	}
	
	public foro.UsuarioCriteria createEs_amigo_deCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public foro.TemasCriteria createCrea_unCriteria() {
		return new foro.TemasCriteria(createCriteria("ORM_crea_un"));
	}
	
	public foro.MensajeCriteria createEscribeCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_escribe"));
	}
	
	public foro.UsuarioCriteria createReporta_aCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_reporta_a"));
	}
	
	public foro.NotificacionesCriteria createTieneCriteria() {
		return new foro.NotificacionesCriteria(createCriteria("ORM_tiene"));
	}
	
	public foro.UsuarioCriteria createEs_su_amigoCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_su_amigo"));
	}
	
	public AdministradorCriteria createEliminado_porCriteria() {
		return new AdministradorCriteria(createCriteria("eliminado_por"));
	}
	
	public foro.MensajeCriteria createGustaCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_gusta"));
	}
	
	public foro.UsuarioCriteria createEs_reportado_porCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_reportado_por"));
	}
	
	public foro.TemasCriteria createLe_da_me_gustaCriteria() {
		return new foro.TemasCriteria(createCriteria("ORM_le_da_me_gusta"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

