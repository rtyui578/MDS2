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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression titulo_seccion;
	public final CollectionExpression tiene;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		id_seccion = new IntegerExpression("id_seccion", this);
		creada_porId = new IntegerExpression("creada_por.id_usuario", this);
		creada_por = new AssociationExpression("creada_por", this);
		titulo_seccion = new StringExpression("titulo_seccion", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(basededatos.OtraPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createCreada_porCriteria() {
		return new UsuarioCriteria(createCriteria("creada_por"));
	}
	
	public basededatos.TemaCriteria createTieneCriteria() {
		return new basededatos.TemaCriteria(createCriteria("ORM_tiene"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

