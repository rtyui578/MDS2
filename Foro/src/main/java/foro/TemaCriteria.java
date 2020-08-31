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

public class TemaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_tema;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression temaId;
	public final AssociationExpression tema;
	public final IntegerExpression privadosId;
	public final AssociationExpression privados;
	public final IntegerExpression publicoId;
	public final AssociationExpression publico;
	public final CollectionExpression es_gustado;
	public final StringExpression nombre;
	public final IntegerExpression num__likes;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final CollectionExpression tiene;
	public final IntegerExpression ocultosId;
	public final AssociationExpression ocultos;
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		id_tema = new IntegerExpression("id_tema", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id__seccion", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		temaId = new IntegerExpression("tema.id_tema", this);
		tema = new AssociationExpression("tema", this);
		privadosId = new IntegerExpression("privados.id_tema", this);
		privados = new AssociationExpression("privados", this);
		publicoId = new IntegerExpression("publico.id_tema", this);
		publico = new AssociationExpression("publico", this);
		es_gustado = new CollectionExpression("ORM_es_gustado", this);
		nombre = new StringExpression("nombre", this);
		num__likes = new IntegerExpression("num__likes", this);
		creado_porId = new IntegerExpression("creado_por.id_usuario", this);
		creado_por = new AssociationExpression("creado_por", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		ocultosId = new IntegerExpression("ocultos.id_tema", this);
		ocultos = new AssociationExpression("ocultos", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createPertenece_aCriteria() {
		return new SeccionCriteria(createCriteria("pertenece_a"));
	}
	
	public TemaCriteria createTemaCriteria() {
		return new TemaCriteria(createCriteria("tema"));
	}
	
	public TemaCriteria createPrivadosCriteria() {
		return new TemaCriteria(createCriteria("privados"));
	}
	
	public TemaCriteria createPublicoCriteria() {
		return new TemaCriteria(createCriteria("publico"));
	}
	
	public foro.UsuarioCriteria createEs_gustadoCriteria() {
		return new foro.UsuarioCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public UsuarioCriteria createCreado_porCriteria() {
		return new UsuarioCriteria(createCriteria("creado_por"));
	}
	
	public foro.MensajeCriteria createTieneCriteria() {
		return new foro.MensajeCriteria(createCriteria("ORM_tiene"));
	}
	
	public TemaCriteria createOcultosCriteria() {
		return new TemaCriteria(createCriteria("ocultos"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

