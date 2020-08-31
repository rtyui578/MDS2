/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package paquete1;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_nota;
	public final StringExpression Titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	public final IntegerExpression referencia_a_mensajeId;
	public final AssociationExpression referencia_a_mensaje;
	public final IntegerExpression notificacion_propietarioId;
	public final AssociationExpression notificacion_propietario;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		id_nota = new IntegerExpression("id_nota", this);
		Titulo = new StringExpression("Titulo", this);
		cuerpo = new StringExpression("cuerpo", this);
		motivo = new StringExpression("motivo", this);
		referencia_a_mensajeId = new IntegerExpression("referencia_a_mensaje.id_mensaje", this);
		referencia_a_mensaje = new AssociationExpression("referencia_a_mensaje", this);
		notificacion_propietarioId = new IntegerExpression("notificacion_propietario.id_usuario", this);
		notificacion_propietario = new AssociationExpression("notificacion_propietario", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createReferencia_a_mensajeCriteria() {
		return new MensajeCriteria(createCriteria("referencia_a_mensaje"));
	}
	
	public UsuarioCriteria createNotificacion_propietarioCriteria() {
		return new UsuarioCriteria(createCriteria("notificacion_propietario"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

