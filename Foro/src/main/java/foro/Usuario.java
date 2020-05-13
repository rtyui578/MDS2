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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_USUARIO_CREA_UN) {
			return ORM_crea_un;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_ESCRIBE) {
			return ORM_escribe;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_ES_AMIGO_DE) {
			return ORM_es_amigo_de;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_REPORTA_A) {
			return ORM_reporta_a;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_TIENE) {
			return ORM_tiene;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_ES_SU_AMIGO) {
			return ORM_es_su_amigo;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_GUSTA) {
			return ORM_gusta;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_ES_REPORTADO_POR) {
			return ORM_es_reportado_por;
		}
		else if (key == foro.ORMConstants.KEY_USUARIO_LE_DA_ME_GUSTA) {
			return ORM_le_da_me_gusta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foro.ORMConstants.KEY_USUARIO_ELIMINADO_POR) {
			this.eliminado_por = (foro.Administrador) owner;
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
	@GeneratedValue(generator="FORO_USUARIO_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_USUARIO_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToMany(targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario", joinColumns={ @JoinColumn(name="UsuarioAttribute2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioAttribute") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_amigo_de = new java.util.HashSet();
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Id_usuario", nullable=false, length=10)	
	private int id_usuario;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
	@Column(name="Nombre_usuario", nullable=true, length=255)	
	private String nombre_usuario;
	
	@OneToMany(mappedBy="creado_por", targetEntity=foro.Temas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_un = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escribe = new java.util.HashSet();
	
	@ManyToMany(targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario2", joinColumns={ @JoinColumn(name="UsuarioAttribute2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioAttribute") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reporta_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="de", targetEntity=foro.Notificaciones.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_amigo_de", targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_su_amigo = new java.util.HashSet();
	
	@ManyToOne(targetEntity=foro.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAttribute", referencedColumnName="Attribute", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario248154"))	
	private foro.Administrador eliminado_por;
	
	@ManyToMany(mappedBy="ORM_es_gustado", targetEntity=foro.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gusta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_reporta_a", targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_reportado_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_gustado", targetEntity=foro.Temas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_da_me_gusta = new java.util.HashSet();
	
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
	
	public void setId_usuario(int value) {
		this.id_usuario = value;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setNombre_usuario(String value) {
		this.nombre_usuario = value;
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	private void setORM_Crea_un(java.util.Set value) {
		this.ORM_crea_un = value;
	}
	
	private java.util.Set getORM_Crea_un() {
		return ORM_crea_un;
	}
	
	@Transient	
	public final foro.TemasSetCollection crea_un = new foro.TemasSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_CREA_UN, foro.ORMConstants.KEY_TEMAS_CREADO_POR, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Escribe(java.util.Set value) {
		this.ORM_escribe = value;
	}
	
	private java.util.Set getORM_Escribe() {
		return ORM_escribe;
	}
	
	@Transient	
	public final foro.MensajeSetCollection escribe = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_ESCRIBE, foro.ORMConstants.KEY_MENSAJE_PERTENECE_A, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_amigo_de(java.util.Set value) {
		this.ORM_es_amigo_de = value;
	}
	
	private java.util.Set getORM_Es_amigo_de() {
		return ORM_es_amigo_de;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_amigo_de = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_ES_AMIGO_DE, foro.ORMConstants.KEY_USUARIO_ES_SU_AMIGO, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reporta_a(java.util.Set value) {
		this.ORM_reporta_a = value;
	}
	
	private java.util.Set getORM_Reporta_a() {
		return ORM_reporta_a;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection reporta_a = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_REPORTA_A, foro.ORMConstants.KEY_USUARIO_ES_REPORTADO_POR, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final foro.NotificacionesSetCollection tiene = new foro.NotificacionesSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_TIENE, foro.ORMConstants.KEY_NOTIFICACIONES_DE, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_su_amigo(java.util.Set value) {
		this.ORM_es_su_amigo = value;
	}
	
	private java.util.Set getORM_Es_su_amigo() {
		return ORM_es_su_amigo;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_su_amigo = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_ES_SU_AMIGO, foro.ORMConstants.KEY_USUARIO_ES_AMIGO_DE, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEliminado_por(foro.Administrador value) {
		if (eliminado_por != null) {
			eliminado_por.elimina.remove(this);
		}
		if (value != null) {
			value.elimina.add(this);
		}
	}
	
	public foro.Administrador getEliminado_por() {
		return eliminado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Eliminado_por(foro.Administrador value) {
		this.eliminado_por = value;
	}
	
	private foro.Administrador getORM_Eliminado_por() {
		return eliminado_por;
	}
	
	private void setORM_Gusta(java.util.Set value) {
		this.ORM_gusta = value;
	}
	
	private java.util.Set getORM_Gusta() {
		return ORM_gusta;
	}
	
	@Transient	
	public final foro.MensajeSetCollection gusta = new foro.MensajeSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_GUSTA, foro.ORMConstants.KEY_MENSAJE_ES_GUSTADO, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_reportado_por(java.util.Set value) {
		this.ORM_es_reportado_por = value;
	}
	
	private java.util.Set getORM_Es_reportado_por() {
		return ORM_es_reportado_por;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection es_reportado_por = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_ES_REPORTADO_POR, foro.ORMConstants.KEY_USUARIO_REPORTA_A, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Le_da_me_gusta(java.util.Set value) {
		this.ORM_le_da_me_gusta = value;
	}
	
	private java.util.Set getORM_Le_da_me_gusta() {
		return ORM_le_da_me_gusta;
	}
	
	@Transient	
	public final foro.TemasSetCollection le_da_me_gusta = new foro.TemasSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_USUARIO_LE_DA_ME_GUSTA, foro.ORMConstants.KEY_TEMAS_ES_GUSTADO, foro.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public boolean iniciarSesion(String usuario, String contraseña) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void registrarse(String usuario, String contraseña) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void banearUsuario() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void desbanearUsuario() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void modificarInformacion() {
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
