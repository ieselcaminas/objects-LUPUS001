package ejerciciosPOO.subastas;

public class Puja {
    private Pujador pujador;
    private Lote lote;
    public Puja(Lote lote, Pujador pujador) {
        this.lote = lote;
    }
    public Lote getLote() {
        return lote;
    }
    public void setLote(Lote lote) {
        this.lote = lote;
    }
    public Pujador getPujador() {
        return pujador;
    }
    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    /*@Override
    public String toString() {
        return this.
    }*/
}
