package objetos;

public class delete_historico {

	private int identificador_accion;
	private String tabla_afectada;
	private String fecha;

	public int getIdentificador_accion() {
		return identificador_accion;
	}

	public void setIdentificador_accion(int identificador_accion) {
		this.identificador_accion = identificador_accion;
	}

	public String getTabla_afectada() {
		return tabla_afectada;
	}

	public void setTabla_afectada(String tabla_afectada) {
		this.tabla_afectada = tabla_afectada;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getDatos_anteriores() {
		return datos_anteriores;
	}

	public void setDatos_anteriores(int datos_anteriores) {
		this.datos_anteriores = datos_anteriores;
	}

	private int datos_anteriores;

	public delete_historico(int identificador_accion, String tabla_afectada, String fecha, int datos_anteriores) {
		super();
		this.identificador_accion = identificador_accion;
		this.tabla_afectada = tabla_afectada;
		this.fecha = fecha;
		this.datos_anteriores = datos_anteriores;
	}

	@Override
	public String toString() {
		return "delete_historico [identificador_accion=" + identificador_accion + ", tabla_afectada=" + tabla_afectada
				+ ", fecha=" + fecha + ", datos_anteriores=" + datos_anteriores + "]";
	}

}
