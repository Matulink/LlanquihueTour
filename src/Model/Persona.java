package Model;
/*
Clase Base Persona donde se aplica el encapsulamiento(atributos privados).
Además aplica composición ya re rescata los objetos rut y direccion
*/
public class Persona {
    private String nombre;
    private String apellido;
    private Rut rut;            // Composición
    private Direccion direccion; // Composición

    //Constructor
    public Persona(String nombre, String apellido, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Rut getRut() {
        return rut;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setRut(Rut rut) {
        this.rut = rut;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
//ToString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                " | RUT: " + rut.getNumero() +
                " | Dirección: " + direccion.toString();
    }
}
