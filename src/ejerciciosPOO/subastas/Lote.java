package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numLote;
    private double precioSalida;
    private Pujador pujador;
    private List<Articulo> articulos = new ArrayList<>();

    public Lote(int numLote, double precioSalida, Pujador pujador) {
        this.numLote = numLote;
        this.precioSalida = precioSalida;
        this.pujador = pujador;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    /*public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }*/

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    @Override
    public String toString(){
        return this.numLote + " - " + this.precioSalida;
    }
}
