package Herencia.animal;

public class Gato extends Mamifero implements Jugar{

    public Gato(String nombre) {
        super(nombre);
    }

    public void jugarConOvillos(){
        System.out.println("Me gusta jugar con ovillos");
    }

    @Override
    public void comunicarse(){
        System.out.println("Miau");
    }

    @Override
    public void perseguirObjeto(){
        System.out.println("Puedo perseguir un objeto");
    }

    @Override
    public void saltarPorAro(){
        System.out.println("Puedo saltar por un aro");
    }
}
