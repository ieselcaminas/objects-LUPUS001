package Herencia.Avatar;

public abstract class Elementos {
    private String nombre;

    public Elementos(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
