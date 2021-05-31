/**
 * 
 * @author Roberto Abad
 *
 */

public class Trabajador extends Persona {
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	
	Level Entrenador = Level.LOW;
	Level Masajista = Level.MEDIUM;
	Level Nutricionista = Level.HIGH;
}
