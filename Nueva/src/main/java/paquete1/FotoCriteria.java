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

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	public final IntegerExpression foto_pertenece_a_mensajeId;
	public final AssociationExpression foto_pertenece_a_mensaje;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		id_media = new IntegerExpression("id_media", this);
		nombre = new StringExpression("nombre", this);
		tamaño = new StringExpression("tamaño", this);
		formato = new StringExpression("formato", this);
		foto_pertenece_a_mensajeId = new IntegerExpression("foto_pertenece_a_mensaje.id_mensaje", this);
		foto_pertenece_a_mensaje = new AssociationExpression("foto_pertenece_a_mensaje", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createFoto_pertenece_a_mensajeCriteria() {
		return new MensajeCriteria(createCriteria("foto_pertenece_a_mensaje"));
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

