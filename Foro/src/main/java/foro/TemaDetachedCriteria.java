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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TemaDetachedCriteria() {
		super(foro.Tema.class, foro.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id__seccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		temaId = new IntegerExpression("tema.id_tema", this.getDetachedCriteria());
		tema = new AssociationExpression("tema", this.getDetachedCriteria());
		privadosId = new IntegerExpression("privados.id_tema", this.getDetachedCriteria());
		privados = new AssociationExpression("privados", this.getDetachedCriteria());
		publicoId = new IntegerExpression("publico.id_tema", this.getDetachedCriteria());
		publico = new AssociationExpression("publico", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		num__likes = new IntegerExpression("num__likes", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.id_usuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		ocultosId = new IntegerExpression("ocultos.id_tema", this.getDetachedCriteria());
		ocultos = new AssociationExpression("ocultos", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id__seccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		temaId = new IntegerExpression("tema.id_tema", this.getDetachedCriteria());
		tema = new AssociationExpression("tema", this.getDetachedCriteria());
		privadosId = new IntegerExpression("privados.id_tema", this.getDetachedCriteria());
		privados = new AssociationExpression("privados", this.getDetachedCriteria());
		publicoId = new IntegerExpression("publico.id_tema", this.getDetachedCriteria());
		publico = new AssociationExpression("publico", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		num__likes = new IntegerExpression("num__likes", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.id_usuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		ocultosId = new IntegerExpression("ocultos.id_tema", this.getDetachedCriteria());
		ocultos = new AssociationExpression("ocultos", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createPertenece_aCriteria() {
		return new SeccionDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public TemaDetachedCriteria createTemaCriteria() {
		return new TemaDetachedCriteria(createCriteria("tema"));
	}
	
	public TemaDetachedCriteria createPrivadosCriteria() {
		return new TemaDetachedCriteria(createCriteria("privados"));
	}
	
	public TemaDetachedCriteria createPublicoCriteria() {
		return new TemaDetachedCriteria(createCriteria("publico"));
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
	
	public TemaDetachedCriteria createOcultosCriteria() {
		return new TemaDetachedCriteria(createCriteria("ocultos"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

