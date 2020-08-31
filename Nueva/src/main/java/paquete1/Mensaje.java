/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package paquete1;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			return ORM_respuesta_de;
		}
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_TIENE_IMAGEN) {
			return ORM_mensaje_tiene_imagen;
		}
		else if (key == ORMConstants.KEY_MENSAJE_ES_REFERENCIADO) {
			return ORM_es_referenciado;
		}
		else if (key == ORMConstants.KEY_MENSAJE_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_MENSAJE_TIENE_VIDEO) {
			this.mensaje_tiene_video = (paquete1.Video) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_TEMA_PADRE) {
			this.tema_padre = (paquete1.Tema) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_PROPIETARIO) {
			this.mensaje_propietario = (paquete1.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_INICIAL) {
			this.mensaje_inicial = (paquete1.Mensaje) owner;
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
	@GeneratedValue(generator="PAQUETE1_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_mensaje;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="usuario_creador", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKMensaje430277"))	
	private paquete1.Usuario mensaje_propietario;
	
	@OneToOne(targetEntity=paquete1.Video.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VideoMediaId_media", referencedColumnName="MediaId_media") }, foreignKey=@ForeignKey(name="FKMensaje19308"))	
	private paquete1.Video mensaje_tiene_video;
	
	@ManyToOne(targetEntity=paquete1.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="respuesta_de", referencedColumnName="Id_mensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje900990"))	
	private paquete1.Mensaje mensaje_inicial;
	
	@ManyToOne(targetEntity=paquete1.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="tema_padre", referencedColumnName="Id_tema", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje442400"))	
	private paquete1.Tema tema_padre;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String cuerpo;
	
	@Column(name="Me_gusta", nullable=true, length=10)	
	private int me_gusta;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@OneToMany(mappedBy="mensaje_inicial", targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respuesta_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="foto_pertenece_a_mensaje", targetEntity=paquete1.Foto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mensaje_tiene_imagen = new java.util.HashSet();
	
	@OneToMany(mappedBy="referencia_a_mensaje", targetEntity=paquete1.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_referenciado = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	private void setId_mensaje(int value) {
		this.id_mensaje = value;
	}
	
	public int getId_mensaje() {
		return id_mensaje;
	}
	
	public int getORMID() {
		return getId_mensaje();
	}
	
	public void setCuerpo(String value) {
		this.cuerpo = value;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setMe_gusta(int value) {
		this.me_gusta = value;
	}
	
	public int getMe_gusta() {
		return me_gusta;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setMensaje_tiene_video(paquete1.Video value) {
		if (this.mensaje_tiene_video != value) {
			paquete1.Video lmensaje_tiene_video = this.mensaje_tiene_video;
			this.mensaje_tiene_video = value;
			if (value != null) {
				mensaje_tiene_video.setMensaje_contenedor_video(this);
			}
			if (lmensaje_tiene_video != null && lmensaje_tiene_video.getMensaje_contenedor_video() == this) {
				lmensaje_tiene_video.setMensaje_contenedor_video(null);
			}
		}
	}
	
	public paquete1.Video getMensaje_tiene_video() {
		return mensaje_tiene_video;
	}
	
	private void setORM_Respuesta_de(java.util.Set value) {
		this.ORM_respuesta_de = value;
	}
	
	private java.util.Set getORM_Respuesta_de() {
		return ORM_respuesta_de;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection respuesta_de = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPUESTA_DE, ORMConstants.KEY_MENSAJE_MENSAJE_INICIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTema_padre(paquete1.Tema value) {
		if (tema_padre != null) {
			tema_padre.tema_contiene.remove(this);
		}
		if (value != null) {
			value.tema_contiene.add(this);
		}
	}
	
	public paquete1.Tema getTema_padre() {
		return tema_padre;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tema_padre(paquete1.Tema value) {
		this.tema_padre = value;
	}
	
	private paquete1.Tema getORM_Tema_padre() {
		return tema_padre;
	}
	
	private void setORM_Mensaje_tiene_imagen(java.util.Set value) {
		this.ORM_mensaje_tiene_imagen = value;
	}
	
	private java.util.Set getORM_Mensaje_tiene_imagen() {
		return ORM_mensaje_tiene_imagen;
	}
	
	@Transient	
	public final paquete1.FotoSetCollection mensaje_tiene_imagen = new paquete1.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_MENSAJE_TIENE_IMAGEN, ORMConstants.KEY_FOTO_FOTO_PERTENECE_A_MENSAJE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_referenciado(java.util.Set value) {
		this.ORM_es_referenciado = value;
	}
	
	private java.util.Set getORM_Es_referenciado() {
		return ORM_es_referenciado;
	}
	
	@Transient	
	public final paquete1.NotificacionSetCollection es_referenciado = new paquete1.NotificacionSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_ES_REFERENCIADO, ORMConstants.KEY_NOTIFICACION_REFERENCIA_A_MENSAJE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMensaje_propietario(paquete1.Usuario value) {
		if (mensaje_propietario != null) {
			mensaje_propietario.usuario_a_escrito.remove(this);
		}
		if (value != null) {
			value.usuario_a_escrito.add(this);
		}
	}
	
	public paquete1.Usuario getMensaje_propietario() {
		return mensaje_propietario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_propietario(paquete1.Usuario value) {
		this.mensaje_propietario = value;
	}
	
	private paquete1.Usuario getORM_Mensaje_propietario() {
		return mensaje_propietario;
	}
	
	public void setMensaje_inicial(paquete1.Mensaje value) {
		if (mensaje_inicial != null) {
			mensaje_inicial.respuesta_de.remove(this);
		}
		if (value != null) {
			value.respuesta_de.add(this);
		}
	}
	
	public paquete1.Mensaje getMensaje_inicial() {
		return mensaje_inicial;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_inicial(paquete1.Mensaje value) {
		this.mensaje_inicial = value;
	}
	
	private paquete1.Mensaje getORM_Mensaje_inicial() {
		return mensaje_inicial;
	}
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection es_gustado = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_ES_GUSTADO, ORMConstants.KEY_USUARIO_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void subirMedia(int Media_asignar) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId_mensaje());
	}
	
}
