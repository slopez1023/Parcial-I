package AdminAnimales;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo (int numCamada, String especieLobo,String color, Float tamanoColmillos, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super(color,tamanoColmillos,habitat,altura,largo,peso,nombreCientifico);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }
    public String comer(){
        return "El lobo " + especieLobo + " come carne y en una camada de" + numCamada ;
    }
    public String dormir(){
        return "El lobo " + especieLobo + " se encuentra en los bosques" +habitat;
    }
    public String correr(){
        return  "El lobo " + especieLobo + "corre en los bosques";
    }
    public String comunicarse(){
        return  "El lobo " + especieLobo + " aulla para comunicarse";
    }
}
