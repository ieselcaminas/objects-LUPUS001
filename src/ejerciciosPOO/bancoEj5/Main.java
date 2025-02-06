package ejerciciosPOO.bancoEj5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banc> bancos = new ArrayList<>();

        Banc calvoSL = new Banc("CalvoBank S.L.", 16);
        bancos.add(calvoSL);
            Sucursal santCalvoSL = new Sucursal(1, "Burriana", calvoSL);
            calvoSL.addSucursal(santCalvoSL);
                Cliente antonio = new Cliente("Antonio", "54437654S");
                Prestec prestC1 = new Prestec(1, 100, antonio);
                    //antonio.addCompte();


        Banc santander = new Banc("Santander", 5);
        bancos.add(santander);
            Sucursal santSantander = new Sucursal(2, "Castellón de la Plana", santander);
            santander.addSucursal(santSantander);
                Cliente morales = new Cliente("Morales", "464567F");
                Cliente victor = new Cliente("Victor", "251223C");
                Cliente cliS1 = new Cliente("Eustaquio", "171623Q");

    }
}
