package Herencia.ProyectoNetwork;

public class Usuario {
    private String nickName;
    private String nombreReal;
    private int id;

    public Usuario(String nickName, String nombreReal, int id){
        this.nickName = nickName;
        this.nombreReal = nombreReal;
        this.id = id;
    }

    public String getNickName(){
        return nickName;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public String getNombreReal(){
        return nombreReal;
    }

    public void setNombreReal(String nombreReal){
        this.nombreReal = nombreReal;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return this.nickName;
    }
}
