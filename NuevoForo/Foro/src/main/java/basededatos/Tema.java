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
@Table(name="Tema")
public class Tema implements Serializable {
	public Tema() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_TEMA_TIENE) {
			return ORM_tiene;
		}
		else if (key == basededatos.ORMConstants.KEY_TEMA_TEMAS_OCULTOS) {
			return ORM_temas_ocultos;
		}
		else if (key == basededatos.ORMConstants.KEY_TEMA_TEMAS_PUBLICOS) {
			return ORM_temas_publicos;
		}
		else if (key == basededatos.ORMConstants.KEY_TEMA_TEMAS_PRIVADOS) {
			return ORM_temas_privados;
		}
		else if (key == basededatos.ORMConstants.KEY_TEMA_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_TEMA_ES_DE) {
			this.es_de = (basededatos.Seccion) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_TEMA_ID_TEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_TEMA_ID_TEMA_GENERATOR", strategy="native")	
	private int id_tema;
	
	@ManyToOne(targetEntity=basededatos.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionId_seccion", referencedColumnName="Id_seccion", nullable=false) }, foreignKey=@ForeignKey(name="FKTema38890"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Seccion es_de;
	
	@Column(name="Titulo_tema", nullable=true, length=255)	
	private String titulo_tema;
	
	@Column(name="Num_likes_tema", nullable=false, length=10)	
	private int num_likes_tema;
	
	@OneToMany(mappedBy="es_de", targetEntity=basededatos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tema_Tema", joinColumns={ @JoinColumn(name="TemaId_tema") }, inverseJoinColumns={ @JoinColumn(name="TemaId_tema2") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_temas_ocultos = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tema_Tema2", joinColumns={ @JoinColumn(name="TemaId_tema") }, inverseJoinColumns={ @JoinColumn(name="TemaId_tema2") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_temas_publicos = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tema_Tema3", joinColumns={ @JoinColumn(name="TemaId_tema") }, inverseJoinColumns={ @JoinColumn(name="TemaId_tema2") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_temas_privados = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gusta_a", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	private void setId_tema(int value) {
		this.id_tema = value;
	}
	
	public int getId_tema() {
		return id_tema;
	}
	
	public int getORMID() {
		return getId_tema();
	}
	
	public void setTitulo_tema(String value) {
		this.titulo_tema = value;
	}
	
	public String getTitulo_tema() {
		return titulo_tema;
	}
	
	public void setNum_likes_tema(int value) {
		this.num_likes_tema = value;
	}
	
	public int getNum_likes_tema() {
		return num_likes_tema;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final basededatos.MensajeSetCollection tiene = new basededatos.MensajeSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_TEMA_TIENE, basededatos.ORMConstants.KEY_MENSAJE_ES_DE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEs_de(basededatos.Seccion value) {
		if (es_de != null) {
			es_de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public basededatos.Seccion getEs_de() {
		return es_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_de(basededatos.Seccion value) {
		this.es_de = value;
	}
	
	private basededatos.Seccion getORM_Es_de() {
		return es_de;
	}
	
	private void setORM_Temas_ocultos(java.util.Set value) {
		this.ORM_temas_ocultos = value;
	}
	
	private java.util.Set getORM_Temas_ocultos() {
		return ORM_temas_ocultos;
	}
	
	@Transient	
	public final basededatos.TemaSetCollection temas_ocultos = new basededatos.TemaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_TEMA_TEMAS_OCULTOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Temas_publicos(java.util.Set value) {
		this.ORM_temas_publicos = value;
	}
	
	private java.util.Set getORM_Temas_publicos() {
		return ORM_temas_publicos;
	}
	
	@Transient	
	public final basededatos.TemaSetCollection temas_publicos = new basededatos.TemaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_TEMA_TEMAS_PUBLICOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Temas_privados(java.util.Set value) {
		this.ORM_temas_privados = value;
	}
	
	private java.util.Set getORM_Temas_privados() {
		return ORM_temas_privados;
	}
	
	@Transient	
	public final basededatos.TemaSetCollection temas_privados = new basededatos.TemaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_TEMA_TEMAS_PRIVADOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection es_gustado = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_TEMA_ES_GUSTADO, basededatos.ORMConstants.KEY_USUARIO_GUSTA_A, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_tema());
	}
	
}
