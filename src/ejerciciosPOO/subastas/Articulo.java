package ejerciciosPOO.subastas;

public class Articulo {
    private String nombre;
    private int cod_art;
    private double precio;
    private Lote lote;

    public Articulo(int cod_art, String nombre, double precio, Lote lote) {
        this.cod_art = cod_art;
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
    }

    public int getCod_art() {
        return cod_art;
    }
/*
    public void setCod_art(int cod_art) {
        this.cod_art = cod_art;
    }*/

    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return this.cod_art + " - " + this.nombre + " - " + this.precio;
    }
}
