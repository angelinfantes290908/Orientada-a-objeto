public class Aventurero {
    private String nombreAventurero;
    private int vidaAventurero;
    private int vidaAhoraAventurero;
    private  int danoAventurero;
    private int cantidadPosiciones;
    private final int  CURACION=20;

    public    Aventurero(String nombreAventurero, int vidaAventurero, int vidaAhoraAventurero,int danoAventurero,int cantidadPosiciones ){
        this.nombreAventurero= nombreAventurero;
        this.vidaAventurero= vidaAventurero;
        this.vidaAhoraAventurero= vidaAhoraAventurero;
        this.danoAventurero=danoAventurero;
        this.cantidadPosiciones=cantidadPosiciones;
    }
    public void recibirDano(Enemigo enemigo){
        vidaAhoraAventurero -= enemigo.getDañoMonstruo();
   }
    public void beberPocion(){
        if (cantidadPosiciones>0){
            cantidadPosiciones--;
            vidaAhoraAventurero = vidaAhoraAventurero+20;
        }
    }
    public boolean estaCaido(){
        boolean derrotado=false;
    if(vidaAhoraAventurero<=0){
        derrotado=true;
    }
    return derrotado;
   }
   public void atacar(Enemigo enemigo){
    enemigo.recibirDano(danoAventurero);

   }


    public int getCantidadPosiciones() {
        return cantidadPosiciones;
    }

    public int getCURACION() {
        return CURACION;
    }

    public int getDanoAventurero() {
        return danoAventurero;
    }

    public String getNombreAventurero() {
        return nombreAventurero;
    }

    public int getVidaAhoraAventurero() {
        return vidaAhoraAventurero;
    }

    public int getVidaAventurero() {
        return vidaAventurero;
    }
    
   
    

}
