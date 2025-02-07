package ejerciciosPOO.facultadEj6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Facultat> facultats = new ArrayList<>();
        Facultat universidad = new Facultat(1, "UJI");
            facultats.add(universidad);
        List<AreaConeixement> areaConeixements = new ArrayList<>();
        AreaConeixement ciencia = new AreaConeixement(1, "Ciencias");
            areaConeixements.add(ciencia);
            Departament depInf = new Departament(1, "Informática", ciencia);
            ciencia.addDepartament(depInf);
                Professor victor = new Professor(1, "Victor", depInf);
                   depInf.addProfessor(victor);
                //Catedra cat1 = new Catedra(1, "CAt");

            Departament depMat = new Departament(2, "Matemáticas", ciencia);
                Professor juan = new Professor(10, "Juan Profe", depMat);
                    depMat.addProfessor(juan);

        Catedra catedra = new Catedra(1, "Catedra Letras");
        AreaConeixement letras = new AreaConeixement(2, "Letras");
            areaConeixements.add(letras);
            Departament depLatin = new Departament(10, "Latín", letras);
                Professor pedro = new Professor(20, "Pedro", depLatin);
                    depLatin.addProfessor(pedro);
            Departament depGriego = new Departament(11, "Griego", letras);
                Professor ares = new Professor(12, "Ares", depGriego);
                    depGriego.addProfessor(ares);


        for (AreaConeixement area: areaConeixements){
            System.out.println(area.getNombre());
            for (Departament dep: area.getDepartaments()){
                System.out.println("\t" + dep.getNombreDep());
                for (Professor profe : dep.getProfessors()){
                    System.out.println("\t\t" + profe.getNombre());
                    for (Catedra cat: profe.getCatedras()){
                        System.out.println("\t\t\t" + cat.getNombre());
                    }
                }
            }
        }
    }
}
