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

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression enlace;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		ID = new IntegerExpression("ID", this);
		enlace = new StringExpression("enlace", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(foro.CUPersistentManager.instance().getSession());
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

