package Herencia.animal;

public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre){
        super(nombre);
    }

    public void suenaMusicaTerror(){
        System.out.println("babambabambabambambam");
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
