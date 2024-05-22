package objetos;

public class persona {
	
	private String DNI;
	private String nombre;
	private String apellido;
	private String rol;
	private String mail;
	private int telefono;
	private String contraseina;
	public persona(String dNI, String nombre, String apellido, String rol, String mail, int telefono,
			String contraseina) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rol = rol;
		this.mail = mail;
		this.telefono = telefono;
		this.contraseina = contraseina;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getContraseina() {
		return contraseina;
	}
	public void setContraseina(String contraseina) {
		this.contraseina = contraseina;
	}
	@Override
	public String toString() {
		return "persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", mail="
				+ mail + ", telefono=" + telefono + ", contraseina=" + contraseina + "]";
	}
	
	
}