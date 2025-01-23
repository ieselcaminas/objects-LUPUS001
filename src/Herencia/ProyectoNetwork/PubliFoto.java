package Herencia.ProyectoNetwork;

import java.util.List;

public class PubliFoto extends Publicacion{
    private String nomUsu;
    private String mensaje;

    public PubliFoto(String ID, int numLikes, String marca, String nomUsu, String mensaje) {
        super(ID, numLikes, marca);
        this.nomUsu = nomUsu;
        this.mensaje = mensaje;
    }


    //private List<String, String> comentarios;

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

