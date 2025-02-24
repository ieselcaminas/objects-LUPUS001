package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numLote;
    private String nombre;
    private double precioSalida;
    private Subasta subasta;
    private List<Articulo> articulos = new ArrayList<>();
    private List<Puja> pujas = new ArrayList<>();

    public Lote(int numLote, String nombre, double precioSalida, Subasta subasta) {
        this.numLote = numLote;
        this.nombre = nombre;
        this.precioSalida = precioSalida;
        this.subasta = subasta;
    }

    public int getNumLote() {
        return numLote;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    /*public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }*/

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    @Override
    public String toString(){
        return this.numLote + " - " + this.nombre + this.precioSalida;
    }
}
