package ejerciciosPOO.maquinaExpendedora;

import java.util.List;

public class Cajon {

    private List<Tique> tiquets;


    public void addTiquet(Tique tiquet){
        this.tiquets.add(tiquet);
    }
}
