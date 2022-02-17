package comercial;

public class Principal {

    public static void main(String[] args) {
        Comercial c1 = new Comercial("Pepe", "Madrid", "Tecnologicos", 300);
        Comercial c2 = new Comercial("Luis", "Levante", "Juguetes", 123);
        Comercial c3 = new Comercial("PepeLuis", "Levante", "Papepeleria", 138);
        Comercial c4 = new Comercial("MarioLuis", "Madrid", "Comida", 72);


        c1.cantidadMensual(c1.getCantidadVendida());
        c2.cantidadMensual(c2.getCantidadVendida());
        c3.cantidadMensual(c3.getCantidadVendida());
        c4.cantidadMensual(c4.getCantidadVendida());
        
        System.out.println(c1.getCodigo());
        System.out.println(c2.getCodigo());
        System.out.println(c3.getCodigo());
        System.out.println(c4.getCodigo());

        
        System.out.println("Ventas de comercial 1: " + c1.getCantidadVendida());
        System.out.println("Ventas de comercial 4: " + c4.getCantidadVendida());

        System.out.println("Ventas totales: " + Comercial.getCantidadTotalVendida());
    }

}
