package objetos;

public class sugerencias {

	private int identificador_sugerencia;
	private String nombre_persona;
	private String email;
	private String fecha_sugerencia;
	private String descripcion;

	public sugerencias(int identificador_sugerencia, String nombre_persona, String email, String fecha_sugerencia,
			String descripcion) {
		super();
		this.identificador_sugerencia = identificador_sugerencia;
		this.nombre_persona = nombre_persona;
		this.email = email;
		this.fecha_sugerencia = fecha_sugerencia;
		this.descripcion = descripcion;
	}

	public int getIdentificador_sugerencia() {
		return identificador_sugerencia;
	}

	public void setIdentificador_sugerencia(int identificador_sugerencia) {
		this.identificador_sugerencia = identificador_sugerencia;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_sugerencia() {
		return fecha_sugerencia;
	}

	public void setFecha_sugerencia(String fecha_sugerencia) {
		this.fecha_sugerencia = fecha_sugerencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "sugerencias [identificador_sugerencia=" + identificador_sugerencia + ", nombre_persona="
				+ nombre_persona + ", email=" + email + ", fecha_sugerencia=" + fecha_sugerencia + ", descripcion="
				+ descripcion + "]";
	}

}
