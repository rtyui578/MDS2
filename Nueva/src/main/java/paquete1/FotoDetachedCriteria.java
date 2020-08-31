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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	public final IntegerExpression foto_pertenece_a_mensajeId;
	public final AssociationExpression foto_pertenece_a_mensaje;
	
	public FotoDetachedCriteria() {
		super(paquete1.Foto.class, paquete1.FotoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
		foto_pertenece_a_mensajeId = new IntegerExpression("foto_pertenece_a_mensaje.id_mensaje", this.getDetachedCriteria());
		foto_pertenece_a_mensaje = new AssociationExpression("foto_pertenece_a_mensaje", this.getDetachedCriteria());
	}
	
	public FotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.FotoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
		foto_pertenece_a_mensajeId = new IntegerExpression("foto_pertenece_a_mensaje.id_mensaje", this.getDetachedCriteria());
		foto_pertenece_a_mensaje = new AssociationExpression("foto_pertenece_a_mensaje", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createFoto_pertenece_a_mensajeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("foto_pertenece_a_mensaje"));
	}
	
	public Foto uniqueFoto(PersistentSession session) {
		return (Foto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Foto[] listFoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

