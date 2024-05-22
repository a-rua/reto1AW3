package objetos;

public class concierto {

	private int id_concierto;
	private String nombre_evento;
	private int idgrupo;
	private String hora;
	private int dia;
	private int aforo;

	public concierto(int id_concierto, String nombre_evento, int idgrupo, String hora, int dia, int aforo) {
		super();
		this.id_concierto = id_concierto;
		this.nombre_evento = nombre_evento;
		this.idgrupo = idgrupo;
		this.hora = hora;
		this.dia = dia;
		this.aforo = aforo;
	}

	public int getId_concierto() {
		return id_concierto;
	}

	public void setId_concierto(int id_concierto) {
		this.id_concierto = id_concierto;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public int getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "concierto [id_concierto=" + id_concierto + ", nombre_evento=" + nombre_evento + ", idgrupo=" + idgrupo
				+ ", hora=" + hora + ", dia=" + dia + ", aforo=" + aforo + "]";
	}

}
