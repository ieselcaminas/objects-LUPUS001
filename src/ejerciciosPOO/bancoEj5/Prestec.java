package ejerciciosPOO.bancoEj5;

public class Prestec {
    private int numPrestamo;
    private Cliente cliente;

    public Prestec(int numPrestamo, Cliente cliente) {
        this.numPrestamo = numPrestamo;
        this.cliente = cliente;
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "" + this.numPrestamo;
    }
}
