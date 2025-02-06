package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    private int cod_dep;
    private String nombreDep;
    private List<Professor> professors;

    public Departament(int cod_dep, String nombreDep) {
        this.cod_dep = cod_dep;
        this.nombreDep = nombreDep;
        this.professors = new ArrayList<>();
    }

    public int getCod_dep() {
        return cod_dep;
    }

    public void setCod_dep(int cod_dep) {
        this.cod_dep = cod_dep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public List<Professor> getProfessors(){
        return professors;
    }

    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }

    @Override
    public String toString(){
        return this.cod_dep + " - " + this.nombreDep;
    }
}
