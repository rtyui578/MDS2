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
@Table(name="Temas")
public class Temas implements Serializable {
	public Temas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_TEMAS_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		else if (key == foro.ORMConstants.KEY_TEMAS_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_TEMAS_PERTENECE_A) {
			this.pertenece_a = (foro.Secciones) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMAS_TEMAS) {
			this.temas = (foro.Temas) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMAS_CREADO_POR) {
			this.creado_por = (foro.Usuario) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMAS_PUBLICO) {
			this.publico = (foro.Temas) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMAS_PRIVADOS) {
			this.privados = (foro.Temas) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMAS_OCULTOS) {
			this.ocultos = (foro.Temas) owner;
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
	@GeneratedValue(generator="FORO_TEMAS_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_TEMAS_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@OneToOne(targetEntity=foro.Temas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemasAttribute3", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKTemas57475"))	
	private foro.Temas temas;
	
	@ManyToOne(targetEntity=foro.Temas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemasAttribute2", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKTemas57474"))	
	private foro.Temas privados;
	
	@ManyToOne(targetEntity=foro.Temas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemasAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKTemas353528"))	
	private foro.Temas publico;
	
	@ManyToOne(targetEntity=foro.Secciones.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionesAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKTemas954595"))	
	private foro.Secciones pertenece_a;
	
	@ManyToMany(targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Temas", joinColumns={ @JoinColumn(name="TemasAttribute") }, inverseJoinColumns={ @JoinColumn(name="UsuarioAttribute") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Id_tema", nullable=false, length=10)	
	private int id_tema;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="`Num_ likes`", nullable=false, length=10)	
	private int num__likes;
	
	@ManyToOne(targetEntity=foro.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKTemas365605"))	
	private foro.Usuario creado_por;
	
	@OneToMany(mappedBy="son_de", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@OneToOne(mappedBy="temas", targetEntity=foro.Temas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private foro.Temas ocultos;
	
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
	
	public void setId_tema(int value) {
		this.id_tema = value;
	}
	
	public int getId_tema() {
		return id_tema;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNum__likes(int value) {
		this.num__likes = value;
	}
	
	public int getNum__likes() {
		return num__likes;
	}
	
	public void setPertenece_a(foro.Secciones value) {
		if (pertenece_a != null) {
			pertenece_a.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public foro.Secciones getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(foro.Secciones value) {
		this.pertenece_a = value;
	}
	
	private foro.Secciones getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_gustado = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_TEMAS_ES_GUSTADO, foro.ORMConstants.KEY_USUARIO_LE_DA_ME_GUSTA, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTemas(foro.Temas value) {
		if (this.temas != value) {
			foro.Temas ltemas = this.temas;
			this.temas = value;
			if (value != null) {
				temas.setOcultos(this);
			}
			if (ltemas != null && ltemas.getOcultos() == this) {
				ltemas.setOcultos(null);
			}
		}
	}
	
	public foro.Temas getTemas() {
		return temas;
	}
	
	public void setCreado_por(foro.Usuario value) {
		if (creado_por != null) {
			creado_por.crea_un.remove(this);
		}
		if (value != null) {
			value.crea_un.add(this);
		}
	}
	
	public foro.Usuario getCreado_por() {
		return creado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creado_por(foro.Usuario value) {
		this.creado_por = value;
	}
	
	private foro.Usuario getORM_Creado_por() {
		return creado_por;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final foro.MensajeSetCollection tiene = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_TEMAS_TIENE, foro.ORMConstants.KEY_MENSAJE_SON_DE, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setPublico(foro.Temas value) {
		this.publico = value;
	}
	
	public foro.Temas getPublico() {
		return publico;
	}
	
	public void setPrivados(foro.Temas value) {
		this.privados = value;
	}
	
	public foro.Temas getPrivados() {
		return privados;
	}
	
	public void setOcultos(foro.Temas value) {
		if (this.ocultos != value) {
			foro.Temas locultos = this.ocultos;
			this.ocultos = value;
			if (value != null) {
				ocultos.setTemas(this);
			}
			if (locultos != null && locultos.getTemas() == this) {
				locultos.setTemas(null);
			}
		}
	}
	
	public foro.Temas getOcultos() {
		return ocultos;
	}
	
	public void crearTema(String titulo, String subtitulo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void meGustaTema() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void borrarTema() {
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
