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
@Table(name="Media")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Media")
public class Media extends foro.Video implements Serializable {
	public Media() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_MEDIA_ES_DE) {
			this.es_de = (foro.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=foro.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeAttribute", referencedColumnName="Attribute") }, foreignKey=@ForeignKey(name="FKVideo564433"))	
	private foro.Mensaje es_de;
	
	@Column(name="`Column`", nullable=true, length=10)	
	private int ID;
	
	@Column(name="Id_media", nullable=true, length=10)	
	private int id_media;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setId_media(int value) {
		this.id_media = value;
	}
	
	public int getId_media() {
		return id_media;
	}
	
	public void setEs_de(foro.Mensaje value) {
		if (es_de != null) {
			es_de.contiene.remove(this);
		}
		if (value != null) {
			value.contiene.add(this);
		}
	}
	
	public foro.Mensaje getEs_de() {
		return es_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_de(foro.Mensaje value) {
		this.es_de = value;
	}
	
	private foro.Mensaje getORM_Es_de() {
		return es_de;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
