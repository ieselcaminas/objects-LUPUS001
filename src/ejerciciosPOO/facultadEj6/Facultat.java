package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Facultat {
    private int cod_fac;
    private String nombre;
    private List<Catedra> catedras;

    public Facultat(int cod_fac, String nombre){
        this.cod_fac = cod_fac;
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public int getCod_fac(){
        return cod_fac;
    }

    public void setCod_fac(int cod_fac){
        this.cod_fac = cod_fac;
    }

    public String nombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras(){
        return catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.cod_fac + " - " + this.nombre;
    }

}
