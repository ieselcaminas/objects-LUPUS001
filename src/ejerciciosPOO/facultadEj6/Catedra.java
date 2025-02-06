package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int cod_catedra;
    private String nombre;
    private List<Professor> professors;

    public Catedra(int cod_catedra, String nombre){
        this.cod_catedra = cod_catedra;
        this.nombre = nombre;
        this.professors = new ArrayList<>();
    }

    public int getCod_catedra(){
        return cod_catedra;
    }

    public void setCod_catedra(int cod_catedra){
        this.cod_catedra = cod_catedra;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Professor> getProfessors(){
        return professors;
    }

    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }

    @Override
    public String toString(){
        return this.cod_catedra + " - " + this.nombre;
    }
}
