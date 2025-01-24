package Herencia.ProyectoNetwork;

import java.util.Date;


public class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private int likes;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    //Nunca vamos a cambiar el usuario
    /*public void setUsuario(String usuario) {
        this.usuario = usuario;
    }*/

    public Date getFecha() {
        return fecha;
    }

    //Ya que nos piden que la fecha sea del instante de la publicación, tampoco vamos a cambiar la fecha
    /*public void setFecha(Date fecha) {
        this.fecha = fecha;
    }*/

    public int getLikes() {
        return likes;
    }

    //Este metodo SETTER vamos a utilizarlo para aumentar la cantidad de likes (por eso la sintaxis es diferente a la de un setter comvencional)
    public void like() {
        this.likes++;
    }

    public void disLike(){
        this.likes--;
    }
}
