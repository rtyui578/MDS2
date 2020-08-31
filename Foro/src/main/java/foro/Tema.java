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
@Table(name="Tema")
public class Tema implements Serializable {
	public Tema() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_TEMA_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		else if (key == foro.ORMConstants.KEY_TEMA_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_TEMA_PERTENECE_A) {
			this.pertenece_a = (foro.Seccion) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMA_TEMA) {
			this.tema = (foro.Tema) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMA_CREADO_POR) {
			this.creado_por = (foro.Usuario) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMA_PUBLICO) {
			this.publico = (foro.Tema) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMA_PRIVADOS) {
			this.privados = (foro.Tema) owner;
		}
		
		else if (key == foro.ORMConstants.KEY_TEMA_OCULTOS) {
			this.ocultos = (foro.Tema) owner;
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
	
	@Column(name="Id_tema", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FORO_TEMA_ID_TEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_TEMA_ID_TEMA_GENERATOR", strategy="native")	
	private int id_tema;
	
	@ManyToOne(targetEntity=foro.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`SeccionId _seccion`", referencedColumnName="`Id _seccion`", nullable=false) }, foreignKey=@ForeignKey(name="FKTema500398"))	
	private foro.Seccion pertenece_a;
	
	@OneToOne(targetEntity=foro.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema3", referencedColumnName="Id_tema", nullable=true) }, foreignKey=@ForeignKey(name="FKTema903166"))	
	private foro.Tema tema;
	
	@ManyToOne(targetEntity=foro.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema2", referencedColumnName="Id_tema", nullable=true) }, foreignKey=@ForeignKey(name="FKTema903165"))	
	private foro.Tema privados;
	
	@ManyToOne(targetEntity=foro.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema", referencedColumnName="Id_tema", nullable=true) }, foreignKey=@ForeignKey(name="FKTema953632"))	
	private foro.Tema publico;
	
	@ManyToMany(targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Tema", joinColumns={ @JoinColumn(name="TemaId_tema") }, inverseJoinColumns={ @JoinColumn(name="UsuarioId_usuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="`Num_ likes`", nullable=false, length=10)	
	private int num__likes;
	
	@ManyToOne(targetEntity=foro.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKTema513615"))	
	private foro.Usuario creado_por;
	
	@OneToMany(mappedBy="son_de", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@OneToOne(mappedBy="tema", targetEntity=foro.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private foro.Tema ocultos;
	
	private void setId_tema(int value) {
		this.id_tema = value;
	}
	
	public int getId_tema() {
		return id_tema;
	}
	
	public int getORMID() {
		return getId_tema();
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
	
	public void setPertenece_a(foro.Seccion value) {
		if (pertenece_a != null) {
			pertenece_a.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public foro.Seccion getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(foro.Seccion value) {
		this.pertenece_a = value;
	}
	
	private foro.Seccion getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_gustado = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_TEMA_ES_GUSTADO, foro.ORMConstants.KEY_USUARIO_LE_DA_ME_GUSTA, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTema(foro.Tema value) {
		if (this.tema != value) {
			foro.Tema ltema = this.tema;
			this.tema = value;
			if (value != null) {
				tema.setOcultos(this);
			}
			if (ltema != null && ltema.getOcultos() == this) {
				ltema.setOcultos(null);
			}
		}
	}
	
	public foro.Tema getTema() {
		return tema;
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
	public final foro.MensajeSetCollection tiene = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_TEMA_TIENE, foro.ORMConstants.KEY_MENSAJE_SON_DE, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setPublico(foro.Tema value) {
		this.publico = value;
	}
	
	public foro.Tema getPublico() {
		return publico;
	}
	
	public void setPrivados(foro.Tema value) {
		this.privados = value;
	}
	
	public foro.Tema getPrivados() {
		return privados;
	}
	
	public void setOcultos(foro.Tema value) {
		if (this.ocultos != value) {
			foro.Tema locultos = this.ocultos;
			this.ocultos = value;
			if (value != null) {
				ocultos.setTema(this);
			}
			if (locultos != null && locultos.getTema() == this) {
				locultos.setTema(null);
			}
		}
	}
	
	public foro.Tema getOcultos() {
		return ocultos;
	}
	
	public String toString() {
		return String.valueOf(getId_tema());
	}
	
}
