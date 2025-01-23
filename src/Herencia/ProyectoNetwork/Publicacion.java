package Herencia.ProyectoNetwork;

public class Publicacion {
    private String ID;
    private int numLikes;
    private String marca;

    public Publicacion(String ID, int numLikes, String marca) {
        this.ID = ID;
        this.numLikes = numLikes;
        this.marca = marca;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
