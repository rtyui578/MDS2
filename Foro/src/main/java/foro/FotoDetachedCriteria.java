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

public class FotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_media;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final StringExpression enlace;
	
	public FotoDetachedCriteria() {
		super(foro.Foto.class, foro.FotoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_mensaje", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public FotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.FotoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_mensaje", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createEs_deCriteria() {
		return new MensajeDetachedCriteria(createCriteria("es_de"));
	}
	
	public Foto uniqueFoto(PersistentSession session) {
		return (Foto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Foto[] listFoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

