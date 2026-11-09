package Util;

//Excepción personalizada para RUT invalidos

public class RutInvalidoException extends RuntimeException {
    public RutInvalidoException(String message) {
        super(message);
    }
}
