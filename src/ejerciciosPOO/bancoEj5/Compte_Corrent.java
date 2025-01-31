package ejerciciosPOO.bancoEj5;

public class Compte_Corrent {

    //RECUERDA LUEGO CAMBIARLO QUE ES N:N CON CLIENTE así que el Cliente cliente,
    // puede que haya que quitarlo
    private int n_cc;
    private Cliente cliente;

    public Compte_Corrent(int n_cc, Cliente cliente) {
        this.n_cc = n_cc;
        this.cliente = cliente;
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //El toString no puede devolver un int a secas, por eso hay que poner:
    //return "" + this.n_cc y no | return this.n_cc a secas porque ya que toString es un String no va a devolver un int(un número)

    @Override
    public String toString(){
        return "" + this.n_cc;
    }
}
