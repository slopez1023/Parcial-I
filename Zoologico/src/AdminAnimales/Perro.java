package AdminAnimales;

public class Perro extends Canino{
    private int mordida;

    public Perro (int mordida, String color, Float tamanoColmillos, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super(color, tamanoColmillos, habitat, altura, largo, peso, nombreCientifico);
        this.mordida = mordida;
    }

    public int getMordida() {
        return mordida;
    }
    public String comer(){
        return "El perro come carne y tiene una mordida de " + mordida ;
    }
    public String dormir(){
        return "El perro duerme en la sabana " + habitat;
    }
    public String correr(){
        return "El perro corre a lo largo de la sabana";
    }
    public String comunicarse(){
        return "El perro ladra para comunicarse";
    }
}
