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
@Table(name="Secciones")
public class Secciones implements Serializable {
	public Secciones() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_SECCIONES_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_SECCIONES_ES_CREADA_POR) {
			this.es_creada_por = (foro.Administrador) owner;
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
	@GeneratedValue(generator="FORO_SECCIONES_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_SECCIONES_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=foro.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKSecciones515129"))	
	private foro.Administrador es_creada_por;
	
	@Column(name="Id", nullable=false, length=10)	
	private int id;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=foro.Temas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	private void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public int getORMID() {
		return getAttribute();
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final foro.TemasSetCollection tiene = new foro.TemasSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_SECCIONES_TIENE, foro.ORMConstants.KEY_TEMAS_PERTENECE_A, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEs_creada_por(foro.Administrador value) {
		if (es_creada_por != null) {
			es_creada_por.crea.remove(this);
		}
		if (value != null) {
			value.crea.add(this);
		}
	}
	
	public foro.Administrador getEs_creada_por() {
		return es_creada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_creada_por(foro.Administrador value) {
		this.es_creada_por = value;
	}
	
	private foro.Administrador getORM_Es_creada_por() {
		return es_creada_por;
	}
	
	public String toString() {
		return String.valueOf(getAttribute());
	}
	
}
