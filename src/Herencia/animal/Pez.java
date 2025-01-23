package Herencia.animal;

public abstract class Pez extends Animal {
    public Pez(String nombre){
        super(nombre);
    }

    public void respirar(){
        System.out.println("Respiro con branquias gluglu");
    }
}
