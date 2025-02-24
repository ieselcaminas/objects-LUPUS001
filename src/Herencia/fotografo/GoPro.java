package Herencia.fotografo;

public class GoPro implements TomarFoto{
    private String serie;

    public GoPro(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public void tomarFoto(){
        System.out.println("Foto hecha con GoPro");
    }
}
