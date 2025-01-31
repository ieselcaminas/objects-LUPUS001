package ejerciciosPOO.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Josefina", 1200);
        Cuenta c2 = new Cuenta("Paca", 800);

        c.retirar(200);
        c2.retirar(1000);

        System.out.println(c.getCantidad());
        System.out.println(c2.getCantidad());
    }
}
