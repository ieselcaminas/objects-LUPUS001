package Herencia.ProyectoNetwork;
import java.util.List;

public class PubliFoto extends Publicacion{
    private String titulo;
    private String archivo;

    public PubliFoto(Usuario usuario, String titulo, String archivo) {
        super(usuario);
        this.titulo = titulo;
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString(){
        return this.getFecha() + " Usuario: " +  this.getUsuario() +
                "\n - Título: " +this.titulo + "\n - Archivo: " + this.archivo +
                "\n - Likes: " + this.getLikes();
    }
}

