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

public class ImagenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_media;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final StringExpression enlace;
	
	public ImagenDetachedCriteria() {
		super(basededatos.Imagen.class, basededatos.ImagenCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_mensaje", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ImagenCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		es_deId = new IntegerExpression("es_de.id_mensaje", this.getDetachedCriteria());
		es_de = new AssociationExpression("es_de", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createEs_deCriteria() {
		return new MensajeDetachedCriteria(createCriteria("es_de"));
	}
	
	public Imagen uniqueImagen(PersistentSession session) {
		return (Imagen) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Imagen[] listImagen(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

