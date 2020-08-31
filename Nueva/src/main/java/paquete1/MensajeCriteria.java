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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_mensaje;
	public final IntegerExpression mensaje_propietarioId;
	public final AssociationExpression mensaje_propietario;
	public final IntegerExpression mensaje_tiene_videoId;
	public final AssociationExpression mensaje_tiene_video;
	public final IntegerExpression mensaje_inicialId;
	public final AssociationExpression mensaje_inicial;
	public final IntegerExpression tema_padreId;
	public final AssociationExpression tema_padre;
	public final StringExpression cuerpo;
	public final IntegerExpression me_gusta;
	public final StringExpression titulo;
	public final CollectionExpression Respuesta_de;
	public final CollectionExpression mensaje_tiene_imagen;
	public final CollectionExpression es_referenciado;
	public final CollectionExpression es_gustado;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id_mensaje = new IntegerExpression("id_mensaje", this);
		mensaje_propietarioId = new IntegerExpression("mensaje_propietario.id_usuario", this);
		mensaje_propietario = new AssociationExpression("mensaje_propietario", this);
		mensaje_tiene_videoId = new IntegerExpression("mensaje_tiene_video.", this);
		mensaje_tiene_video = new AssociationExpression("mensaje_tiene_video", this);
		mensaje_inicialId = new IntegerExpression("mensaje_inicial.id_mensaje", this);
		mensaje_inicial = new AssociationExpression("mensaje_inicial", this);
		tema_padreId = new IntegerExpression("tema_padre.id_tema", this);
		tema_padre = new AssociationExpression("tema_padre", this);
		cuerpo = new StringExpression("cuerpo", this);
		me_gusta = new IntegerExpression("me_gusta", this);
		titulo = new StringExpression("titulo", this);
		Respuesta_de = new CollectionExpression("ORM_respuesta_de", this);
		mensaje_tiene_imagen = new CollectionExpression("ORM_mensaje_tiene_imagen", this);
		es_referenciado = new CollectionExpression("ORM_es_referenciado", this);
		es_gustado = new CollectionExpression("ORM_es_gustado", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createMensaje_propietarioCriteria() {
		return new UsuarioCriteria(createCriteria("mensaje_propietario"));
	}
	
	public VideoCriteria createMensaje_tiene_videoCriteria() {
		return new VideoCriteria(createCriteria("mensaje_tiene_video"));
	}
	
	public MensajeCriteria createMensaje_inicialCriteria() {
		return new MensajeCriteria(createCriteria("mensaje_inicial"));
	}
	
	public TemaCriteria createTema_padreCriteria() {
		return new TemaCriteria(createCriteria("tema_padre"));
	}
	
	public MensajeCriteria createRespuesta_deCriteria() {
		return new MensajeCriteria(createCriteria("ORM_respuesta_de"));
	}
	
	public FotoCriteria createMensaje_tiene_imagenCriteria() {
		return new FotoCriteria(createCriteria("ORM_mensaje_tiene_imagen"));
	}
	
	public NotificacionCriteria createEs_referenciadoCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_es_referenciado"));
	}
	
	public UsuarioCriteria createEs_gustadoCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

