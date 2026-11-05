package Util;

//Excepción personalizada para RUT invalidos
public class RutIvalidoException extends RuntimeException {
    public RutIvalidoException(String message) {
        super(message);
    }
}
