package Model;

import Util.RutInvalidoException;

//Representa un Rut Chileno, realiza una validación simple
public class Rut {
    private String numero;

    //Constructor que recibe el número y valida el formato
    public Rut(String numeroRUT){
        if(!numeroRUT.matches("[0-9]+-[0-9kK]")){
            throw new RutInvalidoException("Formato de rut No válido");
            }
        this.numero = numeroRUT;
    }

    //Retorna el número del RUT
    public String getNumero() {
        return numero;
    }
    // Setter para cumplir con encapsulamiento
    public void setNumero(String numero) {
        if(!numero.matches("[0-9]+-[0-9kK]")){
            throw new RutInvalidoException("Formato de rut No válido: " + numero);
        }
        this.numero = numero;
    }
    //Genera To String para el RUT
    @Override
    public String toString() {
        return "Rut: " + numero;
    }
}
