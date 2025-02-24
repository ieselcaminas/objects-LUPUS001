package Herencia.fotografo;

public class Main {
    public static void main(String[] args) {
        Movil samsung = new Movil("Samsung");
        Fotografo alberto = new Fotografo("Alberto", samsung);
        alberto.tomarFoto();

        Camara cam1 = new Camara("tc155");
        Fotografo pedro = new Fotografo("Pedro", cam1);
        pedro.tomarFoto();

        GoPro goPro = new GoPro("hero 12");
        Fotografo maria = new Fotografo("Maria Cristina", goPro);
        maria.tomarFoto();
    }
}