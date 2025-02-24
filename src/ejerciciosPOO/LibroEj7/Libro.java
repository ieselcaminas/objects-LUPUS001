package ejerciciosPOO.LibroEj7;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int isbn;
    private String nombre;
    private Editorial editorial;
    private List<Autor> autores = new ArrayList<>();;
    private List<Tema> temas = new ArrayList<>();;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(int isbn, String nombre, Editorial editorial) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void addTema(Tema tema){
        this.temas.add(tema);
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
