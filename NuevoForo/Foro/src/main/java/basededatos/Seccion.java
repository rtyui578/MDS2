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
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_SECCION_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_SECCION_CREADA_POR) {
			this.creada_por = (basededatos.Usuario) owner;
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
	
	@Column(name="Id_seccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_SECCION_ID_SECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_SECCION_ID_SECCION_GENERATOR", strategy="native")	
	private int id_seccion;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion330761"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario creada_por;
	
	@Column(name="Titulo_seccion", nullable=true, length=255)	
	private String titulo_seccion;
	
	@OneToMany(mappedBy="es_de", targetEntity=basededatos.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	private void setId_seccion(int value) {
		this.id_seccion = value;
	}
	
	public int getId_seccion() {
		return id_seccion;
	}
	
	public int getORMID() {
		return getId_seccion();
	}
	
	public void setTitulo_seccion(String value) {
		this.titulo_seccion = value;
	}
	
	public String getTitulo_seccion() {
		return titulo_seccion;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final basededatos.TemaSetCollection tiene = new basededatos.TemaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_SECCION_TIENE, basededatos.ORMConstants.KEY_TEMA_ES_DE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCreada_por(basededatos.Usuario value) {
		if (creada_por != null) {
			creada_por.crea.remove(this);
		}
		if (value != null) {
			value.crea.add(this);
		}
	}
	
	public basededatos.Usuario getCreada_por() {
		return creada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creada_por(basededatos.Usuario value) {
		this.creada_por = value;
	}
	
	private basededatos.Usuario getORM_Creada_por() {
		return creada_por;
	}
	
	public String toString() {
		return String.valueOf(getId_seccion());
	}
	
}
