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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression titulo_seccion;
	public final CollectionExpression tiene;
	
	public SeccionDetachedCriteria() {
		super(basededatos.Seccion.class, basededatos.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.id_usuario", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.id_usuario", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createCreada_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("creada_por"));
	}
	
	public basededatos.TemaDetachedCriteria createTieneCriteria() {
		return new basededatos.TemaDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

