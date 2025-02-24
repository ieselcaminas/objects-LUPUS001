package Herencia.animal;

public class Ornitorrinco extends Mamifero implements PonerHuevos{

    public Ornitorrinco(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse(){
        System.out.println("Me comunico con burbujas");
    }

    @Override
    public void ponerHuevos(){
        System.out.println("Uy, he puesto un huevo");
    }
}
