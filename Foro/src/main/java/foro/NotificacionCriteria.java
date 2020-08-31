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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_notificacion;
	public final IntegerExpression deId;
	public final AssociationExpression de;
	public final StringExpression fecha;
	public final StringExpression enlace;
	public final StringExpression titulo;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		id_notificacion = new IntegerExpression("id_notificacion", this);
		deId = new IntegerExpression("de.id_usuario", this);
		de = new AssociationExpression("de", this);
		fecha = new StringExpression("fecha", this);
		enlace = new StringExpression("enlace", this);
		titulo = new StringExpression("titulo", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createDeCriteria() {
		return new UsuarioCriteria(createCriteria("de"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

