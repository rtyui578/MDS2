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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_mensaje;
	public final IntegerExpression responde_aId;
	public final AssociationExpression responde_a;
	public final CollectionExpression es_gustado_por;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final IntegerExpression num_likes_mensaje;
	public final StringExpression contenido_mensaje;
	public final CollectionExpression contiene;
	public final CollectionExpression tiene_respuestas;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id_mensaje = new IntegerExpression("id_mensaje", this);
		responde_aId = new IntegerExpression("responde_a.id_mensaje", this);
		responde_a = new AssociationExpression("responde_a", this);
		es_gustado_por = new CollectionExpression("ORM_es_gustado_por", this);
		es_deId = new IntegerExpression("es_de.id_tema", this);
		es_de = new AssociationExpression("es_de", this);
		num_likes_mensaje = new IntegerExpression("num_likes_mensaje", this);
		contenido_mensaje = new StringExpression("contenido_mensaje", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		tiene_respuestas = new CollectionExpression("ORM_tiene_respuestas", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(basededatos.OtraPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createResponde_aCriteria() {
		return new MensajeCriteria(createCriteria("responde_a"));
	}
	
	public basededatos.UsuarioCriteria createEs_gustado_porCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_es_gustado_por"));
	}
	
	public TemaCriteria createEs_deCriteria() {
		return new TemaCriteria(createCriteria("es_de"));
	}
	
	public basededatos.MediaCriteria createContieneCriteria() {
		return new basededatos.MediaCriteria(createCriteria("ORM_contiene"));
	}
	
	public basededatos.MensajeCriteria createTiene_respuestasCriteria() {
		return new basededatos.MensajeCriteria(createCriteria("ORM_tiene_respuestas"));
	}
	
	public UsuarioCriteria createPertenece_aCriteria() {
		return new UsuarioCriteria(createCriteria("pertenece_a"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

