
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		boolean fin = true;
		do {
			System.out.println("-----------------INTRODUCE------------------------");
			System.out.println("-- 1 AgegarSocio       2 Leer Archivo  3 Ver Empleados     0 salir  --");
			System.out.println("--------------------------------------------------");
			int opcion = sc.nextInt();
			

			switch (opcion) {

//Aqui agregamos un socio nuevo
			case 1:
				new Socio();
				break;

		

			case 2:

				break;

		

			case 3:

				break;

			

			case 4:

				break;

		

			case 5:

				break;

			

			case 6:

				break;

			

			case 7:

				break;

		

			case 8:

				break;

			/**
			 * Nos permite salir del programa
			 */

			case 0:

				fin = false;

				break;
			}
		} while (fin != false);
		System.out.println("Hasta luego");
	}
}
