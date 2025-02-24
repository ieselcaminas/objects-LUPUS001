package ejerciciosPOO.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Autor ak = new Autor("Toriyama", "5/04/1955");

        Tema t = new Tema("Aventura");
        Tema t2 = new Tema("Peleas");

        Libro l = new Libro("Dragon Ball", ak);
        libros.add(l);

        l.addTemas(t);
        l.addTemas(t2);

        for (Libro libro : libros){
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            for (Tema temas : libro.getTemas()){
                System.out.println("\t" + temas.getNombre());
            }
        }
    }
}
