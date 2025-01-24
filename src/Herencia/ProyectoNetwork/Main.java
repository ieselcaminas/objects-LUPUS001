package Herencia.ProyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> publicaciones = new ArrayList<>();

        Usuario antonio = new Usuario("lupus", "Antonio Calvo", 23);
        PubliMensaje m = new PubliMensaje(antonio, 23, "Que bueno");
        publicaciones.add(m);
        System.out.println(m);

        System.out.println();

        Usuario raquel = new Usuario("frier", "Raquel Sanchez", 8);
        PubliFoto f = new PubliFoto(raquel, "convallis luporum", "C:/valle.jpg");
        publicaciones.add(f);

        f.like();
        f.like();

        System.out.println(f);
        System.out.println(f.getUsuario().getNickName());
    }

    public static void publicacionesDe(String nombre, List<Publicacion> listaDePublicaciones){
        listaDePublicaciones.stream()
                .filter((p) -> p.getUsuario().getNombreReal().contains(nombre))
                .forEach(System.out::println);
    }
}
