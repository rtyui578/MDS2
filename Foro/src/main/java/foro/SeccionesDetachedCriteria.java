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

public class SeccionesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression es_creada_porId;
	public final AssociationExpression es_creada_por;
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression tiene;
	
	public SeccionesDetachedCriteria() {
		super(foro.Secciones.class, foro.SeccionesCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		es_creada_porId = new IntegerExpression("es_creada_por.attribute", this.getDetachedCriteria());
		es_creada_por = new AssociationExpression("es_creada_por", this.getDetachedCriteria());
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public SeccionesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.SeccionesCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		es_creada_porId = new IntegerExpression("es_creada_por.attribute", this.getDetachedCriteria());
		es_creada_por = new AssociationExpression("es_creada_por", this.getDetachedCriteria());
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_creada_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_creada_por"));
	}
	
	public foro.TemasDetachedCriteria createTieneCriteria() {
		return new foro.TemasDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public Secciones uniqueSecciones(PersistentSession session) {
		return (Secciones) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Secciones[] listSecciones(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Secciones[]) list.toArray(new Secciones[list.size()]);
	}
}

