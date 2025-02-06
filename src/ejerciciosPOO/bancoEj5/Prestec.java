package ejerciciosPOO.bancoEj5;

public class Prestec {
    private int numPrestamo;
    private int cantidad;
    private Cliente cliente;

    public Prestec(int numPrestamo, int cantidad, Cliente cliente) {
        this.numPrestamo = numPrestamo;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "" + this.numPrestamo + this.cantidad;
    }
}
