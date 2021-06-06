/**
 * 
 * @author Roberto Abad
 *
 */

public class Socio extends Persona {

	private double cuota;

	/** El constructor de la clase*/
	public Socio(int id, String nombre, String apellido1, String apellido2, String dni, boolean alta, int edad, double cuota) {
		super(id, nombre, apellido1, apellido2, dni, alta, edad);
		this.cuota = cuota;
	}

	public Socio(){
		super();
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
/** con esto es lo que queremos que nos muestre en menu si quisieramos saber otros atributos los agregariamos aqui*/
	@Override
	public String toString() {
		return  "ID = "+getId()+ " Nombre = " + getNombre() + " Apellidos = " + getApellido1() + " "+ getApellido2()+" Alta = "+isAlta();
	}
}