package objetos;

public class grupos {

	private String nombre;
	private int codigo_identificacion;
	private String descripcion;
	private boolean particularidad;

	public grupos(String nombre, int codigo_identificacion, String descripcion, boolean particularidad) {
		super();
		this.nombre = nombre;
		this.codigo_identificacion = codigo_identificacion;
		this.descripcion = descripcion;
		this.particularidad = particularidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo_identificacion() {
		return codigo_identificacion;
	}

	public void setCodigo_identificacion(int codigo_identificacion) {
		this.codigo_identificacion = codigo_identificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isParticularidad() {
		return particularidad;
	}

	public void setParticularidad(boolean particularidad) {
		this.particularidad = particularidad;
	}

	@Override
	public String toString() {
		return "grupos [nombre=" + nombre + ", codigo_identificacion=" + codigo_identificacion + ", descripcion="
				+ descripcion + ", particularidad=" + particularidad + "]";
	}

}
