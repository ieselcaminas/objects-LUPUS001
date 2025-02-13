package ejerciciosPOO.subastas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pujador> pujadores = new ArrayList<>();
        Pujador ermenegildo = new Pujador("Ermenegildo Gómez");
            pujadores.add(ermenegildo);
        Pujador ramon = new Pujador("Ramón Cana");
            pujadores.add(ramon);

        List<Lote> lotes = new ArrayList<>();
        Lote lote1 = new Lote(1, 90.75, ermenegildo);
            lotes.add(lote1);
        Lote lote2 = new Lote(2, 100.75, ermenegildo);
            lotes.add(lote2);

        Articulo figuraGoku = new Articulo("Figura Goku SSJ5 tablos", 120.65, lote1);
        Articulo espadasCaos = new Articulo("Espadas del Caos de Kratos", 240.56, lote2);
        Articulo dragonSlayer = new Articulo("Dragon Slayer a tamaño real", 666.65, lote2);

    }
}
