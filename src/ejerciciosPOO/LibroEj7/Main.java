package ejerciciosPOO.LibroEj7;

public class Main {
    public static void main(String[] args) {
        Autor sanderson = new Autor(1, "Brandon");
        Tema fant = new Tema(1, "Fantasia");
        Editorial edit = new Editorial(1, "Omega");

        Libro imperioFinal = new Libro(1, "Imperio Final", edit);

        edit.addLibro(imperioFinal);
        sanderson.addLibro(imperioFinal);

        imperioFinal.addAutor(sanderson);
        imperioFinal.addTema(fant);

        Ejemplar ejemImper1 = new Ejemplar(1, imperioFinal);
            imperioFinal.addEjemplar(ejemImper1);
        Ejemplar ejemImper2 = new Ejemplar(2, imperioFinal);
            imperioFinal.addEjemplar(ejemImper2);

        Lector aaron = new Lector(1, "Aarón");
        aaron.addEjemplar(ejemImper1);

        Historico historico = new Historico(1, aaron, ejemImper1, "19/03/2025", "25/03/2025");
    }
}
