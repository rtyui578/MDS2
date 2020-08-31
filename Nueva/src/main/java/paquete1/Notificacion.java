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
@Table(name="Notificacion")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Notificacion")
@PrimaryKeyJoinColumn(name="NotaId_nota", referencedColumnName="Id_nota")
public class Notificacion extends paquete1.Nota implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTIFICACION_NOTIFICACION_PROPIETARIO) {
			this.notificacion_propietario = (paquete1.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTIFICACION_REFERENCIA_A_MENSAJE) {
			this.referencia_a_mensaje = (paquete1.Mensaje) owner;
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
	@JoinColumns(value={ @JoinColumn(name="mensaje_referencia", referencedColumnName="Id_mensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci406426"))	
	private paquete1.Mensaje referencia_a_mensaje;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="usuario_propietario", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKNotificaci833069"))	
	private paquete1.Usuario notificacion_propietario;
	
	public void setNotificacion_propietario(paquete1.Usuario value) {
		if (notificacion_propietario != null) {
			notificacion_propietario.usuario_tiene_notificacion.remove(this);
		}
		if (value != null) {
			value.usuario_tiene_notificacion.add(this);
		}
	}
	
	public paquete1.Usuario getNotificacion_propietario() {
		return notificacion_propietario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Notificacion_propietario(paquete1.Usuario value) {
		this.notificacion_propietario = value;
	}
	
	private paquete1.Usuario getORM_Notificacion_propietario() {
		return notificacion_propietario;
	}
	
	public void setReferencia_a_mensaje(paquete1.Mensaje value) {
		if (referencia_a_mensaje != null) {
			referencia_a_mensaje.es_referenciado.remove(this);
		}
		if (value != null) {
			value.es_referenciado.add(this);
		}
	}
	
	public paquete1.Mensaje getReferencia_a_mensaje() {
		return referencia_a_mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Referencia_a_mensaje(paquete1.Mensaje value) {
		this.referencia_a_mensaje = value;
	}
	
	private paquete1.Mensaje getORM_Referencia_a_mensaje() {
		return referencia_a_mensaje;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
