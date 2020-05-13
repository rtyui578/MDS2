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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_MENSAJE_TIENE) {
			return ORM_tiene;
		}
		else if (key == foro.ORMConstants.KEY_MENSAJE_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		else if (key == foro.ORMConstants.KEY_MENSAJE_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_MENSAJE_SON_DE) {
			this.son_de = (foro.Temas) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_MENSAJE_ELIMINADO_POR) {
			this.eliminado_por = (foro.Moderador) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_MENSAJE_PERTENECE_A) {
			this.pertenece_a = (foro.Usuario) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			this.respuesta_de = (foro.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Attribute", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FORO_MENSAJE_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_MENSAJE_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=foro.Moderador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute2", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje853697"))	
	private foro.Moderador eliminado_por;
	
	@ManyToOne(targetEntity=foro.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje93997"))	
	private foro.Mensaje respuesta_de;
	
	@ManyToOne(targetEntity=foro.Temas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemasAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje917310"))	
	private foro.Temas son_de;
	
	@ManyToMany(targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Mensaje", joinColumns={ @JoinColumn(name="MensajeAttribute") }, inverseJoinColumns={ @JoinColumn(name="UsuarioAttribute") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Id_mensaje", nullable=false, length=10)	
	private int id_mensaje;
	
	@Column(name="Num_likes", nullable=false, length=10)	
	private int num_likes;
	
	@Column(name="Contenido", nullable=true, length=255)	
	private String contenido;
	
	@OneToMany(mappedBy="respuesta_de", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToOne(targetEntity=foro.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje905233"))	
	private foro.Usuario pertenece_a;
	
	@OneToMany(mappedBy="es_de", targetEntity=foro.Media.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
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
	
	public void setId_mensaje(int value) {
		this.id_mensaje = value;
	}
	
	public int getId_mensaje() {
		return id_mensaje;
	}
	
	public void setNum_likes(int value) {
		this.num_likes = value;
	}
	
	public int getNum_likes() {
		return num_likes;
	}
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setSon_de(foro.Temas value) {
		if (son_de != null) {
			son_de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public foro.Temas getSon_de() {
		return son_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Son_de(foro.Temas value) {
		this.son_de = value;
	}
	
	private foro.Temas getORM_Son_de() {
		return son_de;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final foro.MensajeSetCollection tiene = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_MENSAJE_TIENE, foro.ORMConstants.KEY_MENSAJE_RESPUESTA_DE, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEliminado_por(foro.Moderador value) {
		if (eliminado_por != null) {
			eliminado_por.borra.remove(this);
		}
		if (value != null) {
			value.borra.add(this);
		}
	}
	
	public foro.Moderador getEliminado_por() {
		return eliminado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Eliminado_por(foro.Moderador value) {
		this.eliminado_por = value;
	}
	
	private foro.Moderador getORM_Eliminado_por() {
		return eliminado_por;
	}
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_gustado = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_MENSAJE_ES_GUSTADO, foro.ORMConstants.KEY_USUARIO_GUSTA, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece_a(foro.Usuario value) {
		if (pertenece_a != null) {
			pertenece_a.escribe.remove(this);
		}
		if (value != null) {
			value.escribe.add(this);
		}
	}
	
	public foro.Usuario getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(foro.Usuario value) {
		this.pertenece_a = value;
	}
	
	private foro.Usuario getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final foro.MediaSetCollection contiene = new foro.MediaSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_MENSAJE_CONTIENE, foro.ORMConstants.KEY_MEDIA_ES_DE, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setRespuesta_de(foro.Mensaje value) {
		if (respuesta_de != null) {
			respuesta_de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public foro.Mensaje getRespuesta_de() {
		return respuesta_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Respuesta_de(foro.Mensaje value) {
		this.respuesta_de = value;
	}
	
	private foro.Mensaje getORM_Respuesta_de() {
		return respuesta_de;
	}
	
	public void contenidoMensaje(String contenido) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void me_Gusta_Mensaje() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void borrarMensaje() {
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