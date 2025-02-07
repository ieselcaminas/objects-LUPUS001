package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int cod_prof;
    private String nombre;
    private List<Catedra> catedras;
    private Departament departament;

    public Professor(int cod_prof, String nombre, Departament departament) {
        this.cod_prof = cod_prof;
        this.nombre = nombre;
        this.departament = departament;
        this.catedras = new ArrayList<>();
    }

    public int getCod_prof(){
        return cod_prof;
    }

    public void setCod_prof(int cod_prof){
        this.cod_prof = cod_prof;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<Catedra> getCatedras(){
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
