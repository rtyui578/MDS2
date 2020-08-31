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
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final StringExpression nombre_usuario;
	public final CollectionExpression crea;
	public final CollectionExpression amigo;
	public final CollectionExpression gusta;
	public final CollectionExpression escribe;
	public final CollectionExpression gusta_a;
	public final CollectionExpression es_amigo_de;
	public final CollectionExpression tiene;
	public final CollectionExpression baneados;
	public final CollectionExpression reportados;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		email = new StringExpression("email", this);
		contrasena = new StringExpression("contrasena", this);
		nombre_usuario = new StringExpression("nombre_usuario", this);
		crea = new CollectionExpression("ORM_crea", this);
		amigo = new CollectionExpression("ORM_amigo", this);
		gusta = new CollectionExpression("ORM_gusta", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		gusta_a = new CollectionExpression("ORM_gusta_a", this);
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		baneados = new CollectionExpression("ORM_baneados", this);
		reportados = new CollectionExpression("ORM_reportados", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(basededatos.OtraPersistentManager.instance().getSession());
	}
	
	public basededatos.SeccionCriteria createCreaCriteria() {
		return new basededatos.SeccionCriteria(createCriteria("ORM_crea"));
	}
	
	public basededatos.UsuarioCriteria createAmigoCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_amigo"));
	}
	
	public basededatos.MensajeCriteria createGustaCriteria() {
		return new basededatos.MensajeCriteria(createCriteria("ORM_gusta"));
	}
	
	public basededatos.MensajeCriteria createEscribeCriteria() {
		return new basededatos.MensajeCriteria(createCriteria("ORM_escribe"));
	}
	
	public basededatos.TemaCriteria createGusta_aCriteria() {
		return new basededatos.TemaCriteria(createCriteria("ORM_gusta_a"));
	}
	
	public basededatos.UsuarioCriteria createEs_amigo_deCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public basededatos.NotificacionCriteria createTieneCriteria() {
		return new basededatos.NotificacionCriteria(createCriteria("ORM_tiene"));
	}
	
	public basededatos.UsuarioCriteria createBaneadosCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_baneados"));
	}
	
	public basededatos.UsuarioCriteria createReportadosCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_reportados"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

