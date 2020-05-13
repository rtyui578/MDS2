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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Moderador")
public class Moderador extends foro.Usuario implements Serializable {
	public Moderador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_MODERADOR_BORRA) {
			return ORM_borra;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="eliminado_por", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_borra = new java.util.HashSet();
	
	private void setORM_Borra(java.util.Set value) {
		this.ORM_borra = value;
	}
	
	private java.util.Set getORM_Borra() {
		return ORM_borra;
	}
	
	@Transient	
	public final foro.MensajeSetCollection borra = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_MODERADOR_BORRA, foro.ORMConstants.KEY_MENSAJE_ELIMINADO_POR, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
