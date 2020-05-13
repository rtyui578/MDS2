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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TemasDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TemasDetachedCriteria() {
		super(foro.Temas.class, foro.TemasCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		temasId = new IntegerExpression("temas.attribute", this.getDetachedCriteria());
		temas = new AssociationExpression("temas", this.getDetachedCriteria());
		privadosId = new IntegerExpression("privados.attribute", this.getDetachedCriteria());
		privados = new AssociationExpression("privados", this.getDetachedCriteria());
		publicoId = new IntegerExpression("publico.attribute", this.getDetachedCriteria());
		publico = new AssociationExpression("publico", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.attribute", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		num__likes = new IntegerExpression("num__likes", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.attribute", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		ocultosId = new IntegerExpression("ocultos.attribute", this.getDetachedCriteria());
		ocultos = new AssociationExpression("ocultos", this.getDetachedCriteria());
	}
	
	public TemasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.TemasCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		temasId = new IntegerExpression("temas.attribute", this.getDetachedCriteria());
		temas = new AssociationExpression("temas", this.getDetachedCriteria());
		privadosId = new IntegerExpression("privados.attribute", this.getDetachedCriteria());
		privados = new AssociationExpression("privados", this.getDetachedCriteria());
		publicoId = new IntegerExpression("publico.attribute", this.getDetachedCriteria());
		publico = new AssociationExpression("publico", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.attribute", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		num__likes = new IntegerExpression("num__likes", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.attribute", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		ocultosId = new IntegerExpression("ocultos.attribute", this.getDetachedCriteria());
		ocultos = new AssociationExpression("ocultos", this.getDetachedCriteria());
	}
	
	public TemasDetachedCriteria createTemasCriteria() {
		return new TemasDetachedCriteria(createCriteria("temas"));
	}
	
	public TemasDetachedCriteria createPrivadosCriteria() {
		return new TemasDetachedCriteria(createCriteria("privados"));
	}
	
	public TemasDetachedCriteria createPublicoCriteria() {
		return new TemasDetachedCriteria(createCriteria("publico"));
	}
	
	public SeccionesDetachedCriteria createPertenece_aCriteria() {
		return new SeccionesDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public foro.UsuarioDetachedCriteria createEs_gustadoCriteria() {
		return new foro.UsuarioDetachedCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public UsuarioDetachedCriteria createCreado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("creado_por"));
	}
	
	public foro.MensajeDetachedCriteria createTieneCriteria() {
		return new foro.MensajeDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public TemasDetachedCriteria createOcultosCriteria() {
		return new TemasDetachedCriteria(createCriteria("ocultos"));
	}
	
	public Temas uniqueTemas(PersistentSession session) {
		return (Temas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Temas[] listTemas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Temas[]) list.toArray(new Temas[list.size()]);
	}
}

