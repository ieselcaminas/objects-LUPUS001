package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    List<Lote> lotes = new ArrayList<>();

    public Pujador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote){
        this.lotes.add(lote);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
