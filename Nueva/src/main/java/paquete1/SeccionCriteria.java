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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression fecha_creacion;
	public final StringExpression Titulo;
	public final StringExpression Descripcion;
	public final CollectionExpression tema_hijo;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		id_seccion = new IntegerExpression("id_seccion", this);
		creada_porId = new IntegerExpression("creada_por.", this);
		creada_por = new AssociationExpression("creada_por", this);
		fecha_creacion = new StringExpression("fecha_creacion", this);
		Titulo = new StringExpression("Titulo", this);
		Descripcion = new StringExpression("Descripcion", this);
		tema_hijo = new CollectionExpression("ORM_tema_hijo", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createCreada_porCriteria() {
		return new AdministradorCriteria(createCriteria("creada_por"));
	}
	
	public TemaCriteria createTema_hijoCriteria() {
		return new TemaCriteria(createCriteria("ORM_tema_hijo"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

