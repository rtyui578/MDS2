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

public class VideoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression enlace;
	
	public VideoDetachedCriteria() {
		super(foro.Video.class, foro.VideoCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public VideoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foro.VideoCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public Video uniqueVideo(PersistentSession session) {
		return (Video) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Video[] listVideo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Video[]) list.toArray(new Video[list.size()]);
	}
}

