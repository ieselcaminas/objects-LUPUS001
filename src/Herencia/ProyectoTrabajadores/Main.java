package Herencia.ProyectoTrabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo("Jose");
        Oficial oficial = new Oficial("Manel");
        Tecnico tecnico = new Tecnico("Antonio");

        System.out.println(directivo);
        System.out.println(oficial);
        System.out.println(tecnico);
    }
}
