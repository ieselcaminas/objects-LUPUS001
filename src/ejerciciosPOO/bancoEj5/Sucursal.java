package ejerciciosPOO.bancoEj5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banc banco;
    private List<Compte_Corrent> comptes;

    public Sucursal(int n_suc, String localizacion, Banc banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
        this.comptes = new ArrayList<>();
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

    public List<Compte_Corrent> getComptes() {
        return comptes;
    }

    public void addCompte(Compte_Corrent compte){
        this.comptes.add(compte);
    }

    @Override
    public String toString(){
        return this.localizacion;
    }
}
