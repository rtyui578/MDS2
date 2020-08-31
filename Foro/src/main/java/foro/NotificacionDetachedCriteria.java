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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_notificacion;
	public final IntegerExpression deId;
	public final AssociationExpression de;
	public final StringExpression fecha;
	public final StringExpression enlace;
	public final StringExpression titulo;
	
	public NotificacionDetachedCriteria() {
		super(foro.Notificacion.class, foro.NotificacionCriteria.class);
		id_notificacion = new IntegerExpression("id_notificacion", this.getDetachedCriteria());
		deId = new IntegerExpression("de.id_usuario", this.getDetachedCriteria());
		de = new AssociationExpression("de", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.NotificacionCriteria.class);
		id_notificacion = new IntegerExpression("id_notificacion", this.getDetachedCriteria());
		deId = new IntegerExpression("de.id_usuario", this.getDetachedCriteria());
		de = new AssociationExpression("de", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createDeCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("de"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

