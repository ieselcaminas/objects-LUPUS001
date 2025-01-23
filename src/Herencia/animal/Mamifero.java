package Herencia.animal;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre){
        super(nombre);
    }

    public void respirar()
    {
        System.out.println("Respiro aire por los pulmones");
    }

    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }
}
