//Representa un proveedor heredando datos de la clase persona, añadiendo el tipo de servicio que presta
package Model;

public class Proveedor extends Persona {
    private String servicio; // Ej: Transporte, Alojamiento

//Constructor
    public Proveedor(String nombre, String apellido, Rut rut, Direccion direccion, String servicio) {
        super(nombre, apellido, rut, direccion);
        this.servicio = servicio;
    }

//Getter y Setter
    public String getServicio() { return servicio; }
    public void setServicio(String servicio) { this.servicio = servicio; }

//ToString
    @Override
    public String toString() {
        return "[PROVEEDOR] " + super.toString() + " | Servicio: " + servicio;
    }
}
