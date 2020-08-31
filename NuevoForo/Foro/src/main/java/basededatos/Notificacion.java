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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_NOTIFICACION_ES_DE) {
			this.es_de = (basededatos.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_notificacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_NOTIFICACION_ID_NOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_NOTIFICACION_ID_NOTIFICACION_GENERATOR", strategy="native")	
	private int id_notificacion;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci958234"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario es_de;
	
	@Column(name="Contenido_notificacion", nullable=true, length=255)	
	private String contenido_notificacion;
	
	private void setId_notificacion(int value) {
		this.id_notificacion = value;
	}
	
	public int getId_notificacion() {
		return id_notificacion;
	}
	
	public int getORMID() {
		return getId_notificacion();
	}
	
	public void setContenido_notificacion(String value) {
		this.contenido_notificacion = value;
	}
	
	public String getContenido_notificacion() {
		return contenido_notificacion;
	}
	
	public void setEs_de(basededatos.Usuario value) {
		if (es_de != null) {
			es_de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public basededatos.Usuario getEs_de() {
		return es_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_de(basededatos.Usuario value) {
		this.es_de = value;
	}
	
	private basededatos.Usuario getORM_Es_de() {
		return es_de;
	}
	
	public String toString() {
		return String.valueOf(getId_notificacion());
	}
	
}
