
/**
 * 
 * @author Roberto Abad
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private List<Persona> listaPersonas; // Una lista donde agregamos a todas las personas

	 public Scanner sc = new Scanner(System.in);

	public void menu() {
		cargarTrabajadores(); // Invoca el metodo que crea los 3 trabajadores que tenemos
		cargarSocios(); // Esto sirve para leer el .txt y cargar todos los socios
		boolean fin = true;
		do {
			System.out.println("-----------------INTRODUCE------------------------");
			System.out.println("-- 1 AgegarSocio                 2 Leer Socios  --");
			System.out.println("-- 3 Dar de Baja                 0 Salir        --");
			System.out.println("--------------------------------------------------");
			int opcion = sc.nextInt();

			switch (opcion) {

			/** Aqui agregamos un socio nuevo */
			case 1:
				int edad = 0;
				System.out.println("Introduce el nombre");
				sc.next();
				String nombre = sc.nextLine();
 
				System.out.println("Introduce el apellido1");
				String apellido1 = sc.nextLine();

				System.out.println("Introduce el apellido2");
				String apellido2 = sc.nextLine();

				System.out.println("Introduce el dni");
				String dni = sc.nextLine();

				try {
					System.out.println("Introduce la Edad");
					edad = sc.nextInt();

				} catch (InputMismatchException e) {
					sc.next();
					System.out.println("tiene que ser numero entero");

				}

				crearSocio(nombre, apellido1, apellido2, dni, edad);

				break;

			/** Aqui nos muestra los socios con los datos que queremos de el */
			case 2:

				for (Persona persona : listaPersonas) {
					if (persona instanceof Socio) {
						System.out.println(persona.toString());
					}
				}

				break;
			/** Aqui damos de baja a un socio */
			case 3:

				System.out.println("Introduce el ID del socio");
				int id = sc.nextInt();
				editarSocio(id-1);

				break;

			/**
			 * Nos permite salir del programa
			 */

			case 0:
				guardarSociosFichero();
				fin = false;

				break;
			}
		} while (fin);
		System.out.println("Hasta luego");
	}

	/** El metodo de cargar trabajadores e sdecir aqui los creamos */
	private void cargarTrabajadores() {
		listaPersonas = new ArrayList<>();

		Trabajador trabajador1 = new Trabajador(1, "Ramon", "Perez", "Garcia", "65884525-G", true, 27,
				TipoTrabajador.ENTRENADOR, 1200.0);
		listaPersonas.add(trabajador1);

		Trabajador trabajador2 = new Trabajador(2, "David", "Ruiz", "Fernandez", "35884725-F", true, 25,
				TipoTrabajador.NUTRICIONISTA, 1100.0);
		listaPersonas.add(trabajador2);

		Trabajador trabajador3 = new Trabajador(3, "Pedro", "Diez", "Sanchez", "76984525-T", true, 29,
				TipoTrabajador.MASAJISTA, 1300.0);
		listaPersonas.add(trabajador3);
	}

	/** Este metodo es el encargado de leer el txt */

	private void cargarSocios() {
		String linea;
		// MUY IMPORTANTE CAMBIAR LA RUTA DE CONSTANTES SI USAS UN PC DISTINTO
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(Constantes.rutaAbsolutaFichero + Constantes.nombreFichero));

			while ((linea = bufferedReader.readLine()) != null) {
				String[] split = linea.split(";", 0);

				Socio socio = new Socio();

				for (int i = 0; i < 8; i++) {
					switch (i) {
					case 0:
						socio.setId(Integer.parseInt(split[0]));
						break;

					case 1:
						socio.setNombre(split[1]);
						break;

					case 2:
						socio.setApellido1(split[2]);
						break;

					case 3:
						socio.setApellido2(split[3]);
						break;

					case 4:
						socio.setDni(split[4]);
						break;

					case 5:
						socio.setAlta(split[5].equals("1"));
						break;

					case 6:
						socio.setEdad(Integer.parseInt(split[6]));
						break;

					case 7:
						socio.setCuota(Double.parseDouble(split[7]));
						break;
					}
				}

				listaPersonas.add(socio);
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se ha podido encontrar");

		} catch (IOException e) {
			System.out.println("No se ha podido leer el fichero");

		}
	}

	private void guardarSociosFichero() {
		try {
			FileWriter fileWriter = new FileWriter(Constantes.rutaAbsolutaFichero + Constantes.nombreFichero);

			// Aqui recorremos el fichero que tenemos y guarda los socios que tenemos
			for (Persona persona : listaPersonas) {
				if (persona instanceof Socio) {
					String lineaFichero = persona.getId() + ";" + persona.getNombre() + ";" + persona.getApellido1()
							+ ";" + persona.getApellido2() + ";" + persona.getDni() + ";" + (persona.isAlta() ? 1 : 0)
							+ ";" + persona.getEdad() + ";" + ((Socio) persona).getCuota() + ";";
					fileWriter.write(lineaFichero);
				}
			}

			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void crearSocio(String nombre, String apellido1, String apellido2, String dni, int edad) {
		Socio socio = new Socio(listaPersonas.size() + 1, nombre, apellido1, apellido2, dni, true, edad, 30.00);
		listaPersonas.add(socio);
	}

	/** Este metodo permite editar el socio en este caso el alta */
	private void editarSocio(int id) {
		Persona persona = listaPersonas.get(id);

		persona.setAlta(false);

		listaPersonas.set(id, persona);
	}
}
