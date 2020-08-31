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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_MENSAJE_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == basededatos.ORMConstants.KEY_MENSAJE_TIENE_RESPUESTAS) {
			return ORM_tiene_respuestas;
		}
		else if (key == basededatos.ORMConstants.KEY_MENSAJE_ES_GUSTADO_POR) {
			return ORM_es_gustado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_MENSAJE_ES_DE) {
			this.es_de = (basededatos.Tema) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_MENSAJE_PERTENECE_A) {
			this.pertenece_a = (basededatos.Usuario) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_MENSAJE_RESPONDE_A) {
			this.responde_a = (basededatos.Mensaje) owner;
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
	
	@Column(name="Id_mensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_mensaje;
	
	@ManyToOne(targetEntity=basededatos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId_mensaje", referencedColumnName="Id_mensaje", nullable=true) }, foreignKey=@ForeignKey(name="FKMensaje78768"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Mensaje responde_a;
	
	@ManyToMany(mappedBy="ORM_gusta", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado_por = new java.util.HashSet();
	
	@ManyToOne(targetEntity=basededatos.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema", referencedColumnName="Id_tema", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje657495"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Tema es_de;
	
	@Column(name="Num_likes_mensaje", nullable=false, length=10)	
	private int num_likes_mensaje;
	
	@Column(name="Contenido_mensaje", nullable=true, length=255)	
	private String contenido_mensaje;
	
	@OneToMany(mappedBy="es_de", targetEntity=basededatos.Media.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToMany(mappedBy="responde_a", targetEntity=basededatos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene_respuestas = new java.util.HashSet();
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje97513"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario pertenece_a;
	
	private void setId_mensaje(int value) {
		this.id_mensaje = value;
	}
	
	public int getId_mensaje() {
		return id_mensaje;
	}
	
	public int getORMID() {
		return getId_mensaje();
	}
	
	public void setNum_likes_mensaje(int value) {
		this.num_likes_mensaje = value;
	}
	
	public int getNum_likes_mensaje() {
		return num_likes_mensaje;
	}
	
	public void setContenido_mensaje(String value) {
		this.contenido_mensaje = value;
	}
	
	public String getContenido_mensaje() {
		return contenido_mensaje;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final basededatos.MediaSetCollection contiene = new basededatos.MediaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_MENSAJE_CONTIENE, basededatos.ORMConstants.KEY_MEDIA_ES_DE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tiene_respuestas(java.util.Set value) {
		this.ORM_tiene_respuestas = value;
	}
	
	private java.util.Set getORM_Tiene_respuestas() {
		return ORM_tiene_respuestas;
	}
	
	@Transient	
	public final basededatos.MensajeSetCollection tiene_respuestas = new basededatos.MensajeSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_MENSAJE_TIENE_RESPUESTAS, basededatos.ORMConstants.KEY_MENSAJE_RESPONDE_A, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEs_de(basededatos.Tema value) {
		if (es_de != null) {
			es_de.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public basededatos.Tema getEs_de() {
		return es_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_de(basededatos.Tema value) {
		this.es_de = value;
	}
	
	private basededatos.Tema getORM_Es_de() {
		return es_de;
	}
	
	private void setORM_Es_gustado_por(java.util.Set value) {
		this.ORM_es_gustado_por = value;
	}
	
	private java.util.Set getORM_Es_gustado_por() {
		return ORM_es_gustado_por;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection es_gustado_por = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_MENSAJE_ES_GUSTADO_POR, basededatos.ORMConstants.KEY_USUARIO_GUSTA, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece_a(basededatos.Usuario value) {
		if (pertenece_a != null) {
			pertenece_a.escribe.remove(this);
		}
		if (value != null) {
			value.escribe.add(this);
		}
	}
	
	public basededatos.Usuario getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(basededatos.Usuario value) {
		this.pertenece_a = value;
	}
	
	private basededatos.Usuario getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	public void setResponde_a(basededatos.Mensaje value) {
		if (responde_a != null) {
			responde_a.tiene_respuestas.remove(this);
		}
		if (value != null) {
			value.tiene_respuestas.add(this);
		}
	}
	
	public basededatos.Mensaje getResponde_a() {
		return responde_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Responde_a(basededatos.Mensaje value) {
		this.responde_a = value;
	}
	
	private basededatos.Mensaje getORM_Responde_a() {
		return responde_a;
	}
	
	public String toString() {
		return String.valueOf(getId_mensaje());
	}
	
}
