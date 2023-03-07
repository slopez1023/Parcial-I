package AdminAnimales;

public class Guepardo extends Felino{

    public Guepardo(Float tamanoGarras, int velocidad, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
    }
    public String comer(){
        return "El guepardo come mayormente gacelas";
    }
    public String dormir(){
        return "El guepardo se encuentra en los bosques secos de africa " + habitat;
    }
    public String correr(){
        return "El guepardo corre a una velocidad de " + velocidad + "km/h";
    }
    public String comunicarse(){
        return "El guepardo hace un gañido para comunicarse";
    }
}
