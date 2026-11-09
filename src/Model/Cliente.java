//Representa un cliente heredando los datos de persona añadiendo el tipo de turista

package Model;

public class Cliente extends Persona {
    private String tipoTurismo; // Ej: Nacional, Extranjero

    public Cliente(String nombre, String apellido, Rut rut, Direccion direccion, String tipoTurismo) {
        super(nombre, apellido, rut, direccion);
        this.tipoTurismo = tipoTurismo;
    }

    public String getTipoTurismo() { return tipoTurismo; }
    public void setTipoTurismo(String tipoTurismo) { this.tipoTurismo = tipoTurismo; }

    @Override
    public String toString() {
        return "[CLIENTE] " + super.toString() + " | Tipo de Turismo: " + tipoTurismo;
    }
}