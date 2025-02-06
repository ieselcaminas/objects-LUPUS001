package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Adscrit {
    private List<Professor> professors;
    private List<Catedra> catedras;
    private String data;

    public Adscrit(String data) {
        this.data = data;
        this.professors = new ArrayList<>();
        this.catedras = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.data;
    }

}
