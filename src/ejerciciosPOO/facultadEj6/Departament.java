package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    private int cod_dep;
    private String nombreDep;
    private AreaConeixement areaConeixement;
    private List<Professor> professors;

    public Departament(int cod_dep, String nombreDep, AreaConeixement areaConeixement) {
        this.cod_dep = cod_dep;
        this.nombreDep = nombreDep;
        this.areaConeixement = areaConeixement;
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

    public AreaConeixement getAreaConeixement() {
        return areaConeixement;
    }

    public void setAreaConeixement(AreaConeixement areaConeixement) {
        this.areaConeixement = areaConeixement;
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
