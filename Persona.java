import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Roberto Abad
 *
 */

public class Persona {

	private static String Nombre;
	private String Apellido1;
	private String Apellido2;
	private int Edad;

	private boolean Alta;
	Scanner sc = new Scanner(System.in);
	
//Metodos para Nombre y Apellidos
	
	public static String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
// Metodo para Edad
	
	public int getEdad() {
		return Edad;
	}

	public void setEdad() {
		try {
			System.out.println("Introduce la Edad");
			Edad = sc.nextInt();
			
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("tiene que ser numero entero");
		}
	}
//Metodo para dar de baja o alta
	
	public boolean alta() {
		Alta=true;
		return Alta;
	}
	
	public boolean baja() {
		Alta=false;
		return Alta;
	}
	
}


