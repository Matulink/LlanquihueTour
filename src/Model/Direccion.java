package Model;

//Representa una dirección
public class Direccion {
    public String calle, ciudad, region;
    public int num;


//Constructor
    public Direccion(String calle, int num, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.num = num;
    }
//Getter
    public String getCalle() {
        return calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getRegion() {
        return region;
    }
    public int getNum() {
        return num;
    }

//Setter
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setNum(int num) {
        this.num = num;
    }

//Genera To String para la dirección
    @Override
    public String toString() {
        return calle + " " + num + "," + ciudad + ',' + region;
    }
}
