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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final StringExpression nombre_usuario;
	public final CollectionExpression crea;
	public final CollectionExpression amigo;
	public final CollectionExpression gusta;
	public final CollectionExpression escribe;
	public final CollectionExpression gusta_a;
	public final CollectionExpression es_amigo_de;
	public final CollectionExpression tiene;
	public final CollectionExpression baneados;
	public final CollectionExpression reportados;
	
	public UsuarioDetachedCriteria() {
		super(basededatos.Usuario.class, basededatos.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		gusta_a = new CollectionExpression("ORM_gusta_a", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		baneados = new CollectionExpression("ORM_baneados", this.getDetachedCriteria());
		reportados = new CollectionExpression("ORM_reportados", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		gusta = new CollectionExpression("ORM_gusta", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		gusta_a = new CollectionExpression("ORM_gusta_a", this.getDetachedCriteria());
		es_amigo_de = new CollectionExpression("ORM_es_amigo_de", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		baneados = new CollectionExpression("ORM_baneados", this.getDetachedCriteria());
		reportados = new CollectionExpression("ORM_reportados", this.getDetachedCriteria());
	}
	
	public basededatos.SeccionDetachedCriteria createCreaCriteria() {
		return new basededatos.SeccionDetachedCriteria(createCriteria("ORM_crea"));
	}
	
	public basededatos.UsuarioDetachedCriteria createAmigoCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_amigo"));
	}
	
	public basededatos.MensajeDetachedCriteria createGustaCriteria() {
		return new basededatos.MensajeDetachedCriteria(createCriteria("ORM_gusta"));
	}
	
	public basededatos.MensajeDetachedCriteria createEscribeCriteria() {
		return new basededatos.MensajeDetachedCriteria(createCriteria("ORM_escribe"));
	}
	
	public basededatos.TemaDetachedCriteria createGusta_aCriteria() {
		return new basededatos.TemaDetachedCriteria(createCriteria("ORM_gusta_a"));
	}
	
	public basededatos.UsuarioDetachedCriteria createEs_amigo_deCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_es_amigo_de"));
	}
	
	public basededatos.NotificacionDetachedCriteria createTieneCriteria() {
		return new basededatos.NotificacionDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public basededatos.UsuarioDetachedCriteria createBaneadosCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_baneados"));
	}
	
	public basededatos.UsuarioDetachedCriteria createReportadosCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_reportados"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

