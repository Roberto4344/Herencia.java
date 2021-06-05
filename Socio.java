import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Roberto Abad
 *
 */

public class Socio extends Persona {

	private static ArrayList<String> texto;
	private ArrayList<String> socios;
	private static String fecha = new SimpleDateFormat("dd-MM-yyyy - HHmm").format(new Date());;
	private static int NumSocio;
	private static double cuota = 30.00;

	public int getNumSocio() {
		return NumSocio;
	}

	public void setNumSocio() {
		NumSocio = socios.size() + 1;
	}

	/** Escribe el archivo '.txt' con los datos del ArrayList 'aEscribir' */
	public static void escribirFichero() {

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {

			fichero = new FileWriter(NumSocio + " " + Persona.getNombre() + ".txt");
			pw = new PrintWriter(fichero);

			for (int i = 0; i < texto.size(); i++) {
				pw.println("Linea " + (i + 1) + " - " + texto.get(i));
			}

		} catch (IOException e) {
			System.out.println("Se ha producido un error al ecribir el fichero");
		}

		try {
			if (fichero != null) {
				fichero.close();
				pw.close();
			}
		} catch (IOException e) {
			System.out.println("Se ha producido un error al cerrar el fichero");
		}
	}

	public static double getCuota() {
		return cuota;
	}

	public static double setCuota(double cuota) {
		Socio.cuota = cuota;
		return cuota;
	}
}
