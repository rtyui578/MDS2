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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_mensaje;
	public final IntegerExpression responde_aId;
	public final AssociationExpression responde_a;
	public final CollectionExpression es_gustado_por;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final IntegerExpression num_likes_mensaje;
	public final StringExpression contenido_mensaje;
	public final CollectionExpression contiene;
	public final CollectionExpression tiene_respuestas;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	
	public MensajeDetachedCriteria() {
		super(basededatos.Mensaje.class, basededatos.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		responde_aId = new IntegerExpression("responde_a.id_mensaje", this.getDetachedCriteria());
		responde_a = new AssociationExpression("responde_a", this.getDetachedCriteria());
		es_gustado_por = new CollectionExpression("ORM_es_gustado_por", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_tema", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		num_likes_mensaje = new IntegerExpression("num_likes_mensaje", this.getDetachedCriteria());
		contenido_mensaje = new StringExpression("contenido_mensaje", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		tiene_respuestas = new CollectionExpression("ORM_tiene_respuestas", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		responde_aId = new IntegerExpression("responde_a.id_mensaje", this.getDetachedCriteria());
		responde_a = new AssociationExpression("responde_a", this.getDetachedCriteria());
		es_gustado_por = new CollectionExpression("ORM_es_gustado_por", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_tema", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		num_likes_mensaje = new IntegerExpression("num_likes_mensaje", this.getDetachedCriteria());
		contenido_mensaje = new StringExpression("contenido_mensaje", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		tiene_respuestas = new CollectionExpression("ORM_tiene_respuestas", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createResponde_aCriteria() {
		return new MensajeDetachedCriteria(createCriteria("responde_a"));
	}
	
	public basededatos.UsuarioDetachedCriteria createEs_gustado_porCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_es_gustado_por"));
	}
	
	public TemaDetachedCriteria createEs_deCriteria() {
		return new TemaDetachedCriteria(createCriteria("es_de"));
	}
	
	public basededatos.MediaDetachedCriteria createContieneCriteria() {
		return new basededatos.MediaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public basededatos.MensajeDetachedCriteria createTiene_respuestasCriteria() {
		return new basededatos.MensajeDetachedCriteria(createCriteria("ORM_tiene_respuestas"));
	}
	
	public UsuarioDetachedCriteria createPertenece_aCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

