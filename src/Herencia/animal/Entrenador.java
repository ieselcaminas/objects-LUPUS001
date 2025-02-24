package Herencia.animal;

public class Entrenador extends Mamifero{
    public Entrenador(String nombre) {
        super(nombre);
    }

    public void entrenar(Jugar animalQueJuega){
        animalQueJuega.saltarPorAro();
    }

    public void dejarEntrar(Animal animal){
        if (animal instanceof Jugar){
            System.out.println("Puedes pasar");
        }else {
            throw new IllegalArgumentException(animal.getClass().getName() + " no juegas no entras");
        }
    }

    @Override
    public void comunicarse(){
        System.out.println("Me comunico utilizando un idioma");
    }
}
