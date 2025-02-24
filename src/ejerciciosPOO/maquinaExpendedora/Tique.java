package ejerciciosPOO.maquinaExpendedora;

public class Tique {
    private int cod_tiq;
    private int precio;
    private Cajon cajon;
    private Maquina maquina;

    public Tique(int cod_tiq, int precio, Cajon cajon, Maquina maquina) {
        this.cod_tiq = cod_tiq;
        this.precio = precio;
        this.cajon = cajon;
        this.maquina = maquina;
    }

    public int getCod_tiq() {
        return cod_tiq;
    }

    public void setCod_tiq(int cod_tiq) {
        this.cod_tiq = cod_tiq;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString(){
        return this.cod_tiq + " - " + this.precio;
    }
}
