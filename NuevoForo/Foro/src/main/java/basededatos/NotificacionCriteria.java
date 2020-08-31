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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_notificacion;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final StringExpression contenido_notificacion;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		id_notificacion = new IntegerExpression("id_notificacion", this);
		es_deId = new IntegerExpression("es_de.id_usuario", this);
		es_de = new AssociationExpression("es_de", this);
		contenido_notificacion = new StringExpression("contenido_notificacion", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(basededatos.OtraPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createEs_deCriteria() {
		return new UsuarioCriteria(createCriteria("es_de"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

