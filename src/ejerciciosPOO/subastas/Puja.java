package ejerciciosPOO.subastas;

public class Puja {
    private int cod_puj;
    private double cuantia;
    private Pujador pujador;
    private Lote lote;

    public Puja(int cod_puj, double cuantia, Pujador pujador, Lote lote) {
        this.cod_puj = cod_puj;
        this.cuantia = cuantia;
        this.pujador = pujador;
        this.lote = lote;
    }

    public int getCod_puj() {
        return cod_puj;
    }

    public void setCod_puj(int cod_puj) {
        this.cod_puj = cod_puj;
    }

    public double getCuantia() {
        return cuantia;
    }

    public void setCuantia(double cuantia) {
        this.cuantia = cuantia;
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

    @Override
    public String toString() {
        return this.cod_puj + " - " + this.cuantia;
    }
}
