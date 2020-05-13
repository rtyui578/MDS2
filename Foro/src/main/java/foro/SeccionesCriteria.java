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

public class SeccionesCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression es_creada_porId;
	public final AssociationExpression es_creada_por;
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression tiene;
	
	public SeccionesCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		es_creada_porId = new IntegerExpression("es_creada_por.attribute", this);
		es_creada_por = new AssociationExpression("es_creada_por", this);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public SeccionesCriteria(PersistentSession session) {
		this(session.createCriteria(Secciones.class));
	}
	
	public SeccionesCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createEs_creada_porCriteria() {
		return new AdministradorCriteria(createCriteria("es_creada_por"));
	}
	
	public foro.TemasCriteria createTieneCriteria() {
		return new foro.TemasCriteria(createCriteria("ORM_tiene"));
	}
	
	public Secciones uniqueSecciones() {
		return (Secciones) super.uniqueResult();
	}
	
	public Secciones[] listSecciones() {
		java.util.List list = super.list();
		return (Secciones[]) list.toArray(new Secciones[list.size()]);
	}
}

