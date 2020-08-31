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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_NOTIFICACION_DE) {
			this.de = (foro.Usuario) owner;
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
	@GeneratedValue(generator="FORO_NOTIFICACION_ID_NOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_NOTIFICACION_ID_NOTIFICACION_GENERATOR", strategy="native")	
	private int id_notificacion;
	
	@ManyToOne(targetEntity=foro.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci958234"))	
	private foro.Usuario de;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@Column(name="Enlace", nullable=true, length=255)	
	private String enlace;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	private void setId_notificacion(int value) {
		this.id_notificacion = value;
	}
	
	public int getId_notificacion() {
		return id_notificacion;
	}
	
	public int getORMID() {
		return getId_notificacion();
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
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
	
	public String toString() {
		return String.valueOf(getId_notificacion());
	}
	
}
