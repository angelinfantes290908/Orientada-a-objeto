

public class Enemigo {
    private String nombreMonstuo;
    private int vidaMonstruo;
    private int vidaAhoraMonstruo;
    private int dañoMonstruo;
    
   public Enemigo(String nombreMonstruo, int vidaMonstruo, int vidaAhoraMonstruo, int dañoMonstruo){
    this.nombreMonstuo=nombreMonstruo;
    this.vidaMonstruo=vidaMonstruo;
    this.vidaAhoraMonstruo= vidaAhoraMonstruo;
    this.dañoMonstruo= dañoMonstruo;
   }
   public void  recibirDano(int daño ){
        vidaAhoraMonstruo -= daño ;
   }
   public boolean estaDerrotado(){
        boolean derrotado=false;
    if(vidaAhoraMonstruo<=0){
        derrotado=true;
    }
    return derrotado;
   }

    public int getDañoMonstruo() {
        return dañoMonstruo;
    }

    public String getNombreMonstuo() {
        return nombreMonstuo;
    }

    public int getVidaAhoraMonstruo() {
        return vidaAhoraMonstruo;
    }

    public int getVidaMonstruo() {
        return vidaMonstruo;
    }
   
    
}
