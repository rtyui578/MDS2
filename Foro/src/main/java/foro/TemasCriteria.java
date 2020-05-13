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

public class TemasCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression temasId;
	public final AssociationExpression temas;
	public final IntegerExpression privadosId;
	public final AssociationExpression privados;
	public final IntegerExpression publicoId;
	public final AssociationExpression publico;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final CollectionExpression es_gustado;
	public final IntegerExpression ID;
	public final IntegerExpression id_tema;
	public final StringExpression nombre;
	public final IntegerExpression num__likes;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final CollectionExpression tiene;
	public final IntegerExpression ocultosId;
	public final AssociationExpression ocultos;
	
	public TemasCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		temasId = new IntegerExpression("temas.attribute", this);
		temas = new AssociationExpression("temas", this);
		privadosId = new IntegerExpression("privados.attribute", this);
		privados = new AssociationExpression("privados", this);
		publicoId = new IntegerExpression("publico.attribute", this);
		publico = new AssociationExpression("publico", this);
		pertenece_aId = new IntegerExpression("pertenece_a.attribute", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		es_gustado = new CollectionExpression("ORM_es_gustado", this);
		ID = new IntegerExpression("ID", this);
		id_tema = new IntegerExpression("id_tema", this);
		nombre = new StringExpression("nombre", this);
		num__likes = new IntegerExpression("num__likes", this);
		creado_porId = new IntegerExpression("creado_por.attribute", this);
		creado_por = new AssociationExpression("creado_por", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		ocultosId = new IntegerExpression("ocultos.attribute", this);
		ocultos = new AssociationExpression("ocultos", this);
	}
	
	public TemasCriteria(PersistentSession session) {
		this(session.createCriteria(Temas.class));
	}
	
	public TemasCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public TemasCriteria createTemasCriteria() {
		return new TemasCriteria(createCriteria("temas"));
	}
	
	public TemasCriteria createPrivadosCriteria() {
		return new TemasCriteria(createCriteria("privados"));
	}
	
	public TemasCriteria createPublicoCriteria() {
		return new TemasCriteria(createCriteria("publico"));
	}
	
	public SeccionesCriteria createPertenece_aCriteria() {
		return new SeccionesCriteria(createCriteria("pertenece_a"));
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
	
	public TemasCriteria createOcultosCriteria() {
		return new TemasCriteria(createCriteria("ocultos"));
	}
	
	public Temas uniqueTemas() {
		return (Temas) super.uniqueResult();
	}
	
	public Temas[] listTemas() {
		java.util.List list = super.list();
		return (Temas[]) list.toArray(new Temas[list.size()]);
	}
}

