package EjerciciosPOO.Ejercicio3;

public class Cuenta {
    private String nombre;
    private double cantidad;
    
    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.cantidad = saldo;
    }

    public Cuenta(String nombre) {
        this.nombre = nombre;
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double ingreso){
        if (this.cantidad > 0){
            this.cantidad += ingreso;
        }
    }

    public void retirar(double retirar){
        if (this.cantidad - retirar > 0){
            this.cantidad -= retirar;
        }
    }
}