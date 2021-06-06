/**
 * 
 * @author Roberto Abad
 *
 */

public class Trabajador extends Persona {
    private TipoTrabajador tipoTrabajador;
    private double sueldo;

    
    /** el constructor */
    public Trabajador(int id, String nombre, String apellido1, String apellido2, String dni, boolean alta, int edad, TipoTrabajador tipoTrabajador, double sueldo) {
        super(id, nombre, apellido1, apellido2, dni, alta, edad);
        this.tipoTrabajador = tipoTrabajador;
        this.sueldo = sueldo;
    }

    public TipoTrabajador getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}