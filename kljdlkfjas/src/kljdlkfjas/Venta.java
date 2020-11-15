package kljdlkfjas;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name="venta")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false)
	private int materia;

	@Column(nullable=false)
	private int producto;

	public Venta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMateria() {
		return this.materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public int getProducto() {
		return this.producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

}