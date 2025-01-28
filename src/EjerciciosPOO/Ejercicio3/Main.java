package EjerciciosPOO.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Josefina", 1200);

        c.retirar(200);

        System.out.println(c.getCantidad());
    }
}
