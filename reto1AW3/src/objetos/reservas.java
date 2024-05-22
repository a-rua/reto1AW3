package objetos;

public class reservas {

	private int identificador_reserva;
	private String DNI;
	private String nombre_evento;
	private int grupo;
	private int identificador_concierto;

	public reservas(int identificador_reserva, String DNI, String nombre_evento, int grupo,
			int identificador_concierto) {
		super();
		this.identificador_reserva = identificador_reserva;
		DNI = DNI;
		this.nombre_evento = nombre_evento;
		this.grupo = grupo;
		this.identificador_concierto = identificador_concierto;
	}

	public int getIdentificador_reserva() {
		return identificador_reserva;
	}

	public void setIdentificador_reserva(int identificador_reserva) {
		this.identificador_reserva = identificador_reserva;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		DNI = DNI;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public int getIdentificador_concierto() {
		return identificador_concierto;
	}

	public void setIdentificador_concierto(int identificador_concierto) {
		this.identificador_concierto = identificador_concierto;
	}

	@Override
	public String toString() {
		return "reservas [identificador_reserva=" + identificador_reserva + ", DNI=" + DNI + ", nombre_evento="
				+ nombre_evento + ", grupo=" + grupo + ", identificador_concierto=" + identificador_concierto + "]";
	}

}
