package objetos;

public class evento {

	private String nombre;
	private String CIF;
	private String direccion;

	public evento(String nombre, String cIF, String direccion) {
		super();
		this.nombre = nombre;
		CIF = cIF;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "evento [nombre=" + nombre + ", CIF=" + CIF + ", direccion=" + direccion + "]";
	}

}
