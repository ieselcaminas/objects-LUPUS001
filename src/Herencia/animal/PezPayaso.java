package Herencia.animal;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre){
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("¿Donde esta mi hijo?");
    }
    public void buscarANemo(){
        System.out.println("¿Donde estás Nemo?");
    }
}
