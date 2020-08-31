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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_notificacion;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final StringExpression contenido_notificacion;
	
	public NotificacionDetachedCriteria() {
		super(basededatos.Notificacion.class, basededatos.NotificacionCriteria.class);
		id_notificacion = new IntegerExpression("id_notificacion", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_usuario", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		contenido_notificacion = new StringExpression("contenido_notificacion", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.NotificacionCriteria.class);
		id_notificacion = new IntegerExpression("id_notificacion", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_usuario", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		contenido_notificacion = new StringExpression("contenido_notificacion", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createEs_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("es_de"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

