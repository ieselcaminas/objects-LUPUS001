package ejerciciosPOO.bancoEj5;

public class Cliente {
    //RECUERDA LUEGO CAMBIARLO QUE ES N:N CON COMPTE_CORRENT así que puede
    // que haya que cambiar cosas
    private String nombre;
    private String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.dni;
    }
}
