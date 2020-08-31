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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Administrador")
@PrimaryKeyJoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario")
public class Administrador extends foro.Usuario implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foro.ORMConstants.KEY_ADMINISTRADOR_CREA) {
			return ORM_crea;
		}
		else if (key == foro.ORMConstants.KEY_ADMINISTRADOR_ELIMINA) {
			return ORM_elimina;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="es_creada_por", targetEntity=foro.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea = new java.util.HashSet();
	
	@OneToMany(mappedBy="eliminado_por", targetEntity=foro.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_elimina = new java.util.HashSet();
	
	private void setORM_Crea(java.util.Set value) {
		this.ORM_crea = value;
	}
	
	private java.util.Set getORM_Crea() {
		return ORM_crea;
	}
	
	@Transient	
	public final foro.SeccionSetCollection crea = new foro.SeccionSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_ADMINISTRADOR_CREA, foro.ORMConstants.KEY_SECCION_ES_CREADA_POR, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Elimina(java.util.Set value) {
		this.ORM_elimina = value;
	}
	
	private java.util.Set getORM_Elimina() {
		return ORM_elimina;
	}
	
	@Transient	
	public final foro.UsuarioSetCollection elimina = new foro.UsuarioSetCollection(this, _ormAdapter, foro.ORMConstants.KEY_ADMINISTRADOR_ELIMINA, foro.ORMConstants.KEY_USUARIO_ELIMINADO_POR, foro.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
