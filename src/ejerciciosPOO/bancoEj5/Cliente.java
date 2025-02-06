package ejerciciosPOO.bancoEj5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Como cliente ES N:N CON COMPTE_CORRENT se hace una lista
    // que haya que cambiar cosas
    private String nombre;
    private String dni;
    private List<Prestec> prestamos;
    private List<Compte_Corrent> comptes;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
        this.comptes = new ArrayList<>();
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

    public List<Prestec> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestec prestamo){
        this.prestamos.add(prestamo);
    }

    public List<Compte_Corrent> getComptes() {
        return comptes;
    }

    public void addCompte(Compte_Corrent compte){
        this.comptes.add(compte);
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.dni;
    }
}
