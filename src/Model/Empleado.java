//Representa un Empleado, hereda los datos de persona y añade cargo y sueldo

package Model;

public class Empleado extends Persona {
    private String cargo;
    private double sueldo;
    //Constructor
    public Empleado(String nombre, String apellido, Rut rut, Direccion direccion, String cargo, double sueldo) {
        super(nombre, apellido, rut, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    //  Getter
    public String getCargo() {
        return cargo;
    }
    public double getSueldo() {
        return sueldo;
    }
    //Setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //Tostring
    @Override
    public String toString() {
        return "[EMPLEADO] " + super.toString() + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}