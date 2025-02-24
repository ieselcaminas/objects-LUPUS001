package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private int cod_puj;
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

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}