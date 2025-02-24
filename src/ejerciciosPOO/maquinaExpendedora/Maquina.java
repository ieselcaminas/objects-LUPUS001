package ejerciciosPOO.maquinaExpendedora;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
    private int cod_maq;
    List<Tique> tiques;
    List<Cliente> clientes;

    public Maquina(int cod_maq, List<Tique> tiques) {
        this.cod_maq = cod_maq;
        this.tiques = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public int getCod_maq() {
        return cod_maq;
    }

    public void setCod_maq(int cod_maq) {
        this.cod_maq = cod_maq;
    }

    public List<Tique> getTiques() {
        return tiques;
    }

    public void addTique(Tique tique){
        this.tiques.add(tique);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    @Override
    public String toString(){
        return "" + this.cod_maq;
    }
}
