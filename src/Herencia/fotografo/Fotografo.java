package Herencia.fotografo;

public class Fotografo {
    private String nombre;
    private TomarFoto dispositivoUtilizado;

    public Fotografo(String nombre, TomarFoto dispositivoUtilizado) {
        this.nombre = nombre;
        this.dispositivoUtilizado = dispositivoUtilizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TomarFoto getDispositivoUtilizado() {
        return dispositivoUtilizado;
    }

    public void setDispositivoUtilizado(TomarFoto dispositivoUtilizado) {
        this.dispositivoUtilizado = dispositivoUtilizado;
    }

    public void tomarFoto(){
        this.dispositivoUtilizado.tomarFoto();
    }
}
