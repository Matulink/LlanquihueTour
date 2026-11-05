package Model;

//Representa una dirección
public class Direccion {
    public String calle, ciudad, region;
    public int num;

//Genera To String para la dirección
    @Override
    public String toString() {
        return "Direccion = " + calle + "," + num + "," + ciudad + ',' + region;
    }
}
