package Herencia.ProyectoNetwork;

public class PubliMensaje extends Publicacion{
    private String mensaje;

    public PubliMensaje(String ID, int numLikes, String marca, String mensaje){
        super(ID, numLikes, marca);
        this.mensaje = mensaje;
    }


}
