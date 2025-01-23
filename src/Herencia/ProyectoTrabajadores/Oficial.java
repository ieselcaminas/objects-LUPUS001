package Herencia.ProyectoTrabajadores;

public final class Oficial extends Operario {
    public Oficial(String nombre){
        super(nombre);
    }

    @Override
    public String toString(){
        return "Oficial: " + getNombre();
    }
}
