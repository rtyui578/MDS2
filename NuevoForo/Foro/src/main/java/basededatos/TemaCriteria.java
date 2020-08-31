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

public class TemaCriteria extends AbstractORMCriteria {
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
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		id_tema = new IntegerExpression("id_tema", this);
		es_deId = new IntegerExpression("es_de.id_seccion", this);
		es_de = new AssociationExpression("es_de", this);
		titulo_tema = new StringExpression("titulo_tema", this);
		num_likes_tema = new IntegerExpression("num_likes_tema", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		temas_ocultos = new CollectionExpression("ORM_temas_ocultos", this);
		temas_publicos = new CollectionExpression("ORM_temas_publicos", this);
		temas_privados = new CollectionExpression("ORM_temas_privados", this);
		es_gustado = new CollectionExpression("ORM_es_gustado", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(basededatos.OtraPersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createEs_deCriteria() {
		return new SeccionCriteria(createCriteria("es_de"));
	}
	
	public basededatos.MensajeCriteria createTieneCriteria() {
		return new basededatos.MensajeCriteria(createCriteria("ORM_tiene"));
	}
	
	public basededatos.TemaCriteria createTemas_ocultosCriteria() {
		return new basededatos.TemaCriteria(createCriteria("ORM_temas_ocultos"));
	}
	
	public basededatos.TemaCriteria createTemas_publicosCriteria() {
		return new basededatos.TemaCriteria(createCriteria("ORM_temas_publicos"));
	}
	
	public basededatos.TemaCriteria createTemas_privadosCriteria() {
		return new basededatos.TemaCriteria(createCriteria("ORM_temas_privados"));
	}
	
	public basededatos.UsuarioCriteria createEs_gustadoCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

