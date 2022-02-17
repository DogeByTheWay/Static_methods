package comercial;

public class Comercial {

    private String nombre;
    private String zona;
    private String tipoProducto;
    private double cantidadVendida;
    private final String codigo;
    private static double cantidadTotalVendida;
    private static int numComerciales;

    public Comercial(String nombre, String zona, String tipoProducto, double cantidadVendida) {
        numComerciales++;
        this.codigo = zona + String.format("%02d", numComerciales);
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidadVendida = cantidadVendida;
    }

    public double setCantidadVendida(double cantidad) {
        return this.cantidadVendida += cantidad;
    }

    public double cantidadMensual(double cantidad) {
        return cantidadTotalVendida += cantidad;
    }

    public static int numeroComerciales() {
        return numComerciales;
    }

    public static double getCantidadTotalVendida() {
        return cantidadTotalVendida;
    }

    public double getCantidadVendida() {
        return cantidadVendida;
    }

    public String getCodigo() {
        return codigo;
    }

}
