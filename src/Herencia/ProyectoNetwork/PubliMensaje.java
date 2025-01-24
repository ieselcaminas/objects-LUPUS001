package Herencia.ProyectoNetwork;

public class PubliMensaje extends Publicacion{
    private int id;
    private String mensaje;

    public PubliMensaje(Usuario usuario, int id, String mensaje){
        super(usuario);
        this.id = id;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "ID: " +  this.id + " - "  + this.getFecha() + " - " + this.getLikes() +
                " - Usuario: " +  this.getUsuario() + " - " + this.mensaje;
    }
}

