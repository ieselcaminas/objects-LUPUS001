package Herencia.animal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        System.out.println(perro.getNombre());
        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();

        Gato gato = new Gato("Pusa");
        System.out.println(gato.getNombre());
        gato.comunicarse();
        gato.jugarConOvillos();
        gato.mamar();
        //Animal no lo ponemos porque al ser el padre del resto de clases, no puede haber un animal
        // que sea directamente animal. Gato es un animal, pero no hay un animal que sea animma

        Tiburon tiburon = new Tiburon("Baby Shark");
        System.out.println(tiburon.getNombre());
        tiburon.comunicarse();
        tiburon.suenaMusicaTerror();

        PezPayaso pezClown = new PezPayaso("Marlin");
        pezClown.comunicarse();
        pezClown.buscarANemo();
    }
}
