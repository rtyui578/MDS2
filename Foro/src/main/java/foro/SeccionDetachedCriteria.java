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

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id__seccion;
	public final IntegerExpression es_creada_porId;
	public final AssociationExpression es_creada_por;
	public final StringExpression nombre;
	public final CollectionExpression tiene;
	
	public SeccionDetachedCriteria() {
		super(foro.Seccion.class, foro.SeccionCriteria.class);
		id__seccion = new IntegerExpression("id__seccion", this.getDetachedCriteria());
		es_creada_porId = new IntegerExpression("es_creada_por.", this.getDetachedCriteria());
		es_creada_por = new AssociationExpression("es_creada_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.SeccionCriteria.class);
		id__seccion = new IntegerExpression("id__seccion", this.getDetachedCriteria());
		es_creada_porId = new IntegerExpression("es_creada_por.", this.getDetachedCriteria());
		es_creada_por = new AssociationExpression("es_creada_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_creada_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_creada_por"));
	}
	
	public foro.TemaDetachedCriteria createTieneCriteria() {
		return new foro.TemaDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

