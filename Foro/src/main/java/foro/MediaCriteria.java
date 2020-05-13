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

public class MediaCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression enlace;
	public final IntegerExpression es_deId;
	public final AssociationExpression es_de;
	public final IntegerExpression id_media;
	
	public MediaCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		ID = new IntegerExpression("ID", this);
		enlace = new StringExpression("enlace", this);
		es_deId = new IntegerExpression("es_de.attribute", this);
		es_de = new AssociationExpression("es_de", this);
		id_media = new IntegerExpression("id_media", this);
	}
	
	public MediaCriteria(PersistentSession session) {
		this(session.createCriteria(Media.class));
	}
	
	public MediaCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createEs_deCriteria() {
		return new MensajeCriteria(createCriteria("es_de"));
	}
	
	public Media uniqueMedia() {
		return (Media) super.uniqueResult();
	}
	
	public Media[] listMedia() {
		java.util.List list = super.list();
		return (Media[]) list.toArray(new Media[list.size()]);
	}
}

