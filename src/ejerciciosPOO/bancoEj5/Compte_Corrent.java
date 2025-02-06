package ejerciciosPOO.bancoEj5;

import java.util.ArrayList;
import java.util.List;

public class Compte_Corrent {
    //Como cuenta corriente ES N:N CON CLIENTE el Cliente cliente pasa a List<Cliente>
    private int n_cc;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public Compte_Corrent(int n_cc) {
        this.n_cc = n_cc;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }

    //El toString no puede devolver un int a secas, por eso hay que poner:
    //return "" + this.n_cc y no | return this.n_cc a secas porque ya que toString es un String no va a devolver un int(un número)
    @Override
    public String toString(){
        return "" + this.n_cc;
    }
}
