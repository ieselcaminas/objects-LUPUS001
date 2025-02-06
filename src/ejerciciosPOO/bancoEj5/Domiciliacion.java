package ejerciciosPOO.bancoEj5;

public class Domiciliacion {
    private int num_d;
    private String concepto;
    private int cantidad;

    public Domiciliacion(int num_d, String concepto, int cantidad) {
        this.num_d = num_d;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return this.num_d + " - " + this.concepto + " - " + this.cantidad;
    }
}
