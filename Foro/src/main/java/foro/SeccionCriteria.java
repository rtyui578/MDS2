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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id__seccion;
	public final IntegerExpression es_creada_porId;
	public final AssociationExpression es_creada_por;
	public final StringExpression nombre;
	public final CollectionExpression tiene;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		id__seccion = new IntegerExpression("id__seccion", this);
		es_creada_porId = new IntegerExpression("es_creada_por.", this);
		es_creada_por = new AssociationExpression("es_creada_por", this);
		nombre = new StringExpression("nombre", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createEs_creada_porCriteria() {
		return new AdministradorCriteria(createCriteria("es_creada_por"));
	}
	
	public foro.TemaCriteria createTieneCriteria() {
		return new foro.TemaCriteria(createCriteria("ORM_tiene"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

