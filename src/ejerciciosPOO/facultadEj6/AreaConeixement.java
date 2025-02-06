package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class AreaConeixement {
    private int cod_area;
    private String nombre;
    private List<Departament> departaments;

    public AreaConeixement(int cod_area, String nombre) {
        this.cod_area = cod_area;
        this.nombre = nombre;
        this.departaments = new ArrayList<>();
    }

    public int getCod_area(){
        return cod_area;
    }

    public void setCod_area(int cod_area){
        this.cod_area = cod_area;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Departament> getDepartaments(){
        return departaments;
    }

    public void addDepartament(Departament departament){
        this.departaments.add(departament);
    }

    @Override
    public String toString(){
        return this.cod_area + " - " + this.nombre;
    }
}
