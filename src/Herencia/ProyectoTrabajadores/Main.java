package Herencia.ProyectoTrabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo("Jose");
        Oficial oficial = new Oficial("Manel");
        Tecnico tecnico = new Tecnico("Antonio");
        Operario operario = new Operario("Javier");

        System.out.println(directivo);
        System.out.println(oficial);
        System.out.println(tecnico);
        System.out.println(operario);
    }
}
