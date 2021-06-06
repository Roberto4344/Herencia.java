/**
 * 
 * @author Roberto Abad
 *
 */

public abstract class Persona {

	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private boolean alta;
	private int Edad;

	public Persona(){
	}
/** Constructor de persona*/
	public Persona(int id, String nombre, String apellido1, String apellido2, String dni, boolean alta, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.alta = alta;
		Edad = edad;
	}
/** Los getter y sett de cada atributo*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
}


