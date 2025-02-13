package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private int cod_puj;
    List<Lote> lotes = new ArrayList<>();
    List<Puja> pujas = new ArrayList<>();

    public Pujador(String nombre, int cod_puj) {
        this.nombre = nombre;
        this.cod_puj = cod_puj;
    }

    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public int getCod_puj() {
        return cod_puj;
    }

    public void setCod_puj(int cod_puj) {
        this.cod_puj = cod_puj;
    }

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