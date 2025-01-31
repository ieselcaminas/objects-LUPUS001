package ejerciciosPOO.bancoEj5;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banc banco;

    public Sucursal(int n_suc, String localizacion, Banc banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Banc getBanco() {
        return banco;
    }

    public void setBanco(Banc banco) {
        this.banco = banco;
    }

    @Override
    public String toString(){
        return this.localizacion;
    }
}

