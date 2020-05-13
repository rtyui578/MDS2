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
@Table(name="Foto")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Foto")
public class Foto extends foro.Video implements Serializable {
	public Foto() {
	}
	
	@Column(name="Attribute2", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FORO_FOTO_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FORO_FOTO_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@Column(name="ID2", nullable=true, length=10)	
	private int ID;
	
	@Column(name="Enlace2", nullable=true, length=255)	
	private String enlace;
	
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
	
	public void setEnlace(String value) {
		this.enlace = value;
	}
	
	public String getEnlace() {
		return enlace;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
