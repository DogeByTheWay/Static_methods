package lampara;

public class Principal {

    public static void main(String[] args) {
        Lampara l1 = new Lampara(200);
        Lampara l2 = new Lampara(150);
        Lampara l3 = new Lampara(20);
        Lampara l4 = new Lampara(20);
        Lampara l5 = new Lampara(30);
        Lampara l6 = new Lampara(30);

        System.out.println("Consumo total de las lamparas " + Lampara.getConsumoTotal() + "W");

        l1.enciendeLuz();
        l2.enciendeLuz();
        l3.enciendeLuz();
        l4.enciendeLuz();
        l5.enciendeLuz();
        l6.enciendeLuz();
        System.out.println("Primer consumo: " + Lampara.getConsumoTotalActivos() + "W");

        l3.apagaLuz();
        l4.apagaLuz();
        l5.apagaLuz();
        l6.apagaLuz();
        System.out.println("Segundo consumo: " + Lampara.getConsumoTotalActivos() + "W");
    }

}
