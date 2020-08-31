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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Foto")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Foto")
@PrimaryKeyJoinColumn(name="MediaId_media", referencedColumnName="Id_media")
public class Foto extends paquete1.Media implements Serializable {
	public Foto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOTO_FOTO_PERTENECE_A_MENSAJE) {
			this.foto_pertenece_a_mensaje = (paquete1.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=paquete1.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId_mensaje", referencedColumnName="Id_mensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKFoto874872"))	
	private paquete1.Mensaje foto_pertenece_a_mensaje;
	
	public void setFoto_pertenece_a_mensaje(paquete1.Mensaje value) {
		if (foto_pertenece_a_mensaje != null) {
			foto_pertenece_a_mensaje.mensaje_tiene_imagen.remove(this);
		}
		if (value != null) {
			value.mensaje_tiene_imagen.add(this);
		}
	}
	
	public paquete1.Mensaje getFoto_pertenece_a_mensaje() {
		return foto_pertenece_a_mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Foto_pertenece_a_mensaje(paquete1.Mensaje value) {
		this.foto_pertenece_a_mensaje = value;
	}
	
	private paquete1.Mensaje getORM_Foto_pertenece_a_mensaje() {
		return foto_pertenece_a_mensaje;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
