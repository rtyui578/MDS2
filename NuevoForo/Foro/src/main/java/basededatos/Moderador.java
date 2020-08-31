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
@Table(name="Moderador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario")
public class Moderador extends basededatos.Usuario implements Serializable {
	public Moderador() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
