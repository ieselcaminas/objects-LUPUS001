package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subasta> casaSubastas = new ArrayList<>();
        Subasta s1 = new Subasta(1, "Subasta lunes 3");
            casaSubastas.add(s1);
        Subasta s2 = new Subasta(2, "Subasta martes 11");
            casaSubastas.add(s2);

            Lote lote1 = new Lote(1, "", 90.75, s1);
                s1.addLote(lote1);
            Lote lote2 = new Lote(2, "", 100.75, s2);
                s2.addLote(lote2);

                Articulo figuraGoku = new Articulo(1, "Figura Goku SSJ5 tablos", 120.65, lote1);
                    lote1.addArticulo(figuraGoku);
                Articulo espadasCaos = new Articulo(2,"Espadas del Caos de Kratos", 240.56, lote2);
                    lote2.addArticulo(espadasCaos);
                Articulo dragonSlayer = new Articulo(3, "Dragon Slayer a tamaño real", 666.65, lote2);
                    lote2.addArticulo(dragonSlayer);

                    Pujador ermenegildo = new Pujador("Ermenegildo Gómez", 1);
                        Puja puja = new Puja(1, 90, ermenegildo, lote1);
                        ermenegildo.addPuja(puja);
                        lote1.addPuja(puja);
                    Pujador ramon = new Pujador("Ramón Cana", 2);
                        Puja puja2 = new Puja(2, 100, ramon, lote2);
                        ramon.addPuja(puja2);
                        lote2.addPuja(puja2);

        for (Subasta subasta:casaSubastas){
            System.out.println(subasta.getNombre());
            for (Lote lote : subasta.getLotes()){
                System.out.println("\t" +lote.getNombre());
                for (Articulo articulo: lote.getArticulos()){
                    System.out.println("\t\t" +articulo.getNombre());
                    System.out.println("\t\t" +articulo.getPrecio());
                }
                for (Puja pujaLote: lote.getPujas()){
                    System.out.println("\t\t" +pujaLote.getPujador().getNombre());
                }
            }
        }
    }
}
