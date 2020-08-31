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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIO_CREA) {
			return ORM_crea;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_AMIGO) {
			return ORM_amigo;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_GUSTA) {
			return ORM_gusta;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_ESCRIBE) {
			return ORM_escribe;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_GUSTA_A) {
			return ORM_gusta_a;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_ES_AMIGO_DE) {
			return ORM_es_amigo_de;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_TIENE) {
			return ORM_tiene;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_BANEADOS) {
			return ORM_baneados;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_REPORTADOS) {
			return ORM_reportados;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_usuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_USUARIO_ID_USUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIO_ID_USUARIO_GENERATOR", strategy="native")	
	private int id_usuario;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Nombre_usuario", nullable=true, length=255)	
	private String nombre_usuario;
	
	@OneToMany(mappedBy="creada_por", targetEntity=basededatos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario2", joinColumns={ @JoinColumn(name="UsuarioId_usuario2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioId_usuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Mensaje_Usuario", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="MensajeId_mensaje") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gusta = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=basededatos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escribe = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tema_Usuario", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="TemaId_tema") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gusta_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_amigo", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_amigo_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_de", targetEntity=basededatos.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario3", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioId_usuario2") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_baneados = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario4", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioId_usuario2") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportados = new java.util.HashSet();
	
	private void setId_usuario(int value) {
		this.id_usuario = value;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public int getORMID() {
		return getId_usuario();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setNombre_usuario(String value) {
		this.nombre_usuario = value;
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	private void setORM_Crea(java.util.Set value) {
		this.ORM_crea = value;
	}
	
	private java.util.Set getORM_Crea() {
		return ORM_crea;
	}
	
	@Transient	
	public final basededatos.SeccionSetCollection crea = new basededatos.SeccionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_CREA, basededatos.ORMConstants.KEY_SECCION_CREADA_POR, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Amigo(java.util.Set value) {
		this.ORM_amigo = value;
	}
	
	private java.util.Set getORM_Amigo() {
		return ORM_amigo;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection amigo = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_AMIGO, basededatos.ORMConstants.KEY_USUARIO_ES_AMIGO_DE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Gusta(java.util.Set value) {
		this.ORM_gusta = value;
	}
	
	private java.util.Set getORM_Gusta() {
		return ORM_gusta;
	}
	
	@Transient	
	public final basededatos.MensajeSetCollection gusta = new basededatos.MensajeSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_GUSTA, basededatos.ORMConstants.KEY_MENSAJE_ES_GUSTADO_POR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Escribe(java.util.Set value) {
		this.ORM_escribe = value;
	}
	
	private java.util.Set getORM_Escribe() {
		return ORM_escribe;
	}
	
	@Transient	
	public final basededatos.MensajeSetCollection escribe = new basededatos.MensajeSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_ESCRIBE, basededatos.ORMConstants.KEY_MENSAJE_PERTENECE_A, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Gusta_a(java.util.Set value) {
		this.ORM_gusta_a = value;
	}
	
	private java.util.Set getORM_Gusta_a() {
		return ORM_gusta_a;
	}
	
	@Transient	
	public final basededatos.TemaSetCollection gusta_a = new basededatos.TemaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_GUSTA_A, basededatos.ORMConstants.KEY_TEMA_ES_GUSTADO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_amigo_de(java.util.Set value) {
		this.ORM_es_amigo_de = value;
	}
	
	private java.util.Set getORM_Es_amigo_de() {
		return ORM_es_amigo_de;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection es_amigo_de = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_ES_AMIGO_DE, basededatos.ORMConstants.KEY_USUARIO_AMIGO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final basededatos.NotificacionSetCollection tiene = new basededatos.NotificacionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_TIENE, basededatos.ORMConstants.KEY_NOTIFICACION_ES_DE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Baneados(java.util.Set value) {
		this.ORM_baneados = value;
	}
	
	private java.util.Set getORM_Baneados() {
		return ORM_baneados;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection baneados = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_BANEADOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reportados(java.util.Set value) {
		this.ORM_reportados = value;
	}
	
	private java.util.Set getORM_Reportados() {
		return ORM_reportados;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection reportados = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_REPORTADOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_usuario());
	}
	
}
