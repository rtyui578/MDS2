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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_tema;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final StringExpression titulo_tema;
	public final IntegerExpression num_likes_tema;
	public final CollectionExpression tiene;
	public final CollectionExpression temas_ocultos;
	public final CollectionExpression temas_publicos;
	public final CollectionExpression temas_privados;
	public final CollectionExpression es_gustado;
	
	public TemaDetachedCriteria() {
		super(basededatos.Tema.class, basededatos.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_seccion", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		titulo_tema = new StringExpression("titulo_tema", this.getDetachedCriteria());
		num_likes_tema = new IntegerExpression("num_likes_tema", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		temas_ocultos = new CollectionExpression("ORM_temas_ocultos", this.getDetachedCriteria());
		temas_publicos = new CollectionExpression("ORM_temas_publicos", this.getDetachedCriteria());
		temas_privados = new CollectionExpression("ORM_temas_privados", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_seccion", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		titulo_tema = new StringExpression("titulo_tema", this.getDetachedCriteria());
		num_likes_tema = new IntegerExpression("num_likes_tema", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		temas_ocultos = new CollectionExpression("ORM_temas_ocultos", this.getDetachedCriteria());
		temas_publicos = new CollectionExpression("ORM_temas_publicos", this.getDetachedCriteria());
		temas_privados = new CollectionExpression("ORM_temas_privados", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createEs_deCriteria() {
		return new SeccionDetachedCriteria(createCriteria("es_de"));
	}
	
	public basededatos.MensajeDetachedCriteria createTieneCriteria() {
		return new basededatos.MensajeDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public basededatos.TemaDetachedCriteria createTemas_ocultosCriteria() {
		return new basededatos.TemaDetachedCriteria(createCriteria("ORM_temas_ocultos"));
	}
	
	public basededatos.TemaDetachedCriteria createTemas_publicosCriteria() {
		return new basededatos.TemaDetachedCriteria(createCriteria("ORM_temas_publicos"));
	}
	
	public basededatos.TemaDetachedCriteria createTemas_privadosCriteria() {
		return new basededatos.TemaDetachedCriteria(createCriteria("ORM_temas_privados"));
	}
	
	public basededatos.UsuarioDetachedCriteria createEs_gustadoCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

