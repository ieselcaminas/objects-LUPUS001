package ejerciciosPOO.LibroEj7;

public class Tema {
    private int cod_aut;
    private String nombre;

    public Tema(int cod_aut, String nombre) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
    }

    public int getCod_aut() {
        return cod_aut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.cod_aut;
    }
}
