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
@Table(name="Imagen")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Imagen")
@PrimaryKeyJoinColumn(name="MediaId_media", referencedColumnName="Id_media")
public class Imagen extends basededatos.Media implements Serializable {
	public Imagen() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
