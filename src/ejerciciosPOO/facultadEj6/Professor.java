package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int cod_prof;
    private String nombre;
    private List<Catedra> catedras;

    public Professor(int cod_prof, String nombre) {
        this.cod_prof = cod_prof;
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    private int getCod_prof(){
        return cod_prof;
    }

    private void setCod_prof(int cod_prof){
        this.cod_prof = cod_prof;
    }

    private String getNombre(){
        return nombre;
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    private List<Catedra> getCatedras(){
        return catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }


    @Override
    public String toString(){
        return this.cod_prof + " - " + this.nombre;
    }
}
