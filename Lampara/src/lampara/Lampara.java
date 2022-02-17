package lampara;

public class Lampara {

    private String localizacion;
    private double consumo;
    private boolean encendida=false;
    private static double consumoTotal;
    private static double consumoTotalActivos;

    public Lampara(double consumo) {
        consumoTotal+=consumo;
        this.consumo = consumo;
    }

    public double enciendeLuz() {
        encendida=true;
        return consumoTotalActivos += consumo;
    }

    public double apagaLuz() {
        encendida=false;
        return consumoTotalActivos -= consumo;
    }

    public static double getConsumoTotalActivos() {
        return consumoTotalActivos;
    }
    public static double getConsumoTotal(){
        return consumoTotal;
    } 
}
