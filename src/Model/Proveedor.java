package Model;

public class Proveedor extends Persona {
    private String servicio; // Ej: Transporte, Alojamiento

    public Proveedor(String nombre, String apellido, Rut rut, Direccion direccion, String servicio) {
        super(nombre, apellido, rut, direccion);
        this.servicio = servicio;
    }

    public String getServicio() { return servicio; }
    public void setServicio(String servicio) { this.servicio = servicio; }

    @Override
    public String toString() {
        return "[PROVEEDOR] " + super.toString() + " | Servicio: " + servicio;
    }
}
