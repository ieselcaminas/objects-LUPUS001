package ejerciciosPOO.bancoEj5;

import java.util.ArrayList;
import java.util.List;

public class BancoMain {
    public static void main(String[] args) {
        List<Banc> bancos = new ArrayList<>();
        Banc calvoSL = new Banc("CalvoBank S.L.", 16);
        bancos.add(calvoSL);
            Sucursal santCalvoSL = new Sucursal(1, "Burriana", calvoSL);


        Banc santander = new Banc("Santander", 5);
        bancos.add(santander);
            Sucursal santSantander = new Sucursal(2, "Castellón de la Plana", santander);
                Cliente cli1 = new Cliente("Morales", "464567F");
                Cliente cli2 = new Cliente("Victor", "151223C");

    }
}
