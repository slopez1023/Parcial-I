package AdminAnimales;

public class Leon extends Felino{
    private int numManada;
    private Float potenciaRugidoDecibel;

    public Leon(int numManada, Float potenciaRugidoDecibel, Float tamanoGarras, int velocidad, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public String comer(){
        return "El León cazan en manadas de " + numManada;
    }
    public String dormir(){
        return "El León duerme en la sabana africana " + habitat;
    }
    public String correr(){
        return "El León corre a una velocidad de " + velocidad + "km/h";
    }
    public String comunicarse(){
        return "El León ruge fuerte para comunicarse";
    }
}
