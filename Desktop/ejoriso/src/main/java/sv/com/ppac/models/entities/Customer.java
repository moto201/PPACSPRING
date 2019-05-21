package sv.com.ppac.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="customers")
public class Customer {
	@Id @GeneratedValue @Column private long id;
	
	@Column private String nombre;
	
	@Column private String nit;
	
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCant_cont() {
		return cant_cont;
	}

	public void setCant_cont(String cant_cont) {
		this.cant_cont = cant_cont;
	}

	@Column private String cant_cont;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
