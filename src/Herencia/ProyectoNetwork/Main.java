package Herencia.ProyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> publicaciones = new ArrayList<>();
        List<Comentario> comentarios = new ArrayList<>();

        Usuario antonio = new Usuario("lupus", "Antonio Calvo", 23);
        PubliMensaje m = new PubliMensaje(antonio, 23, "Que bueno");
        publicaciones.add(m);
        //System.out.println(m);
        //System.out.println();
        antonio.addPublicacion(m);

        Usuario raquel = new Usuario("frieren", "Raquel Sanchez", 8);
        PubliFoto f = new PubliFoto(raquel, "convallis luporum", "C:/valle.jpg");
        publicaciones.add(f);
        raquel.addPublicacion(f);

        f.like();
        f.like();

        Comentario com = new Comentario(23, antonio, "Increible :O", m);
        comentarios.add(com);
        f.addComentario(com);

        //System.out.println(f);
        //System.out.println(f.getUsuario().getNickName());

        for (Publicacion publicacion: publicaciones){
            System.out.println(publicacion);
            for (Comentario comentario: publicacion.getComentarios()){
                System.out.println("\t" +comentario);
            }
        }
    }

    private static void publicacionesDe(String nombre, List<Publicacion> listaDePublicaciones){
        listaDePublicaciones.stream()
                .filter((p) -> p.getUsuario().getNombreReal().contains(nombre))
                .forEach(System.out::println);
    }
}
