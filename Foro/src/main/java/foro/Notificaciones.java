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
import java.util.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Notificaciones")
public class Notificaciones implements Serializable {
	public Notificaciones() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_NOTIFICACIONES_DE) {
			this.de = (foro.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Attribute", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FORO_NOTIFICACIONES_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_NOTIFICACIONES_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=foro.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci492688"))	
	private foro.Usuario de;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Fecha", nullable=true)	
	private Date fecha;
	
	@Column(name="Enlace", nullable=true, length=255)	
	private String enlace;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	private void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public int getORMID() {
		return getAttribute();
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setFecha(Date value) {
		this.fecha = value;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setEnlace(String value) {
		this.enlace = value;
	}
	
	public String getEnlace() {
		return enlace;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDe(foro.Usuario value) {
		if (de != null) {
			de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public foro.Usuario getDe() {
		return de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_De(foro.Usuario value) {
		this.de = value;
	}
	
	private foro.Usuario getORM_De() {
		return de;
	}
	
	public void borrarNotificacion() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void operation() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getAttribute());
	}
	
}
