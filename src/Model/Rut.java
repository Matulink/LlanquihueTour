package Model;

//Representa un Rut Chileno, realiza una validación simple
public class Rut {
    private String numero;

    //Constructor que recibe el número y valida el formato
    public Rut(String numeroRUT){
        if(!numeroRUT.matches("[0-9]+-[0-9kK]")){
            throw new IllegalArgumentException("Formato de rut No válido");
            }
        this.numero = numeroRUT;
    }

    //Retorna el número del RUT
    public String getNumero() {
        return numero;
    }

    //Genera To String para el RUT
    @Override
    public String toString() {
        return "Rut: " + numero;
    }
}
