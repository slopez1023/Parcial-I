package AdminAnimales;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String especieTigre, Float tamanoGarras, int velocidad, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

     public String comer(){
        return "El tigre: " + " " + especieTigre + "cazan en los bosques tropicales de Asia " + habitat + " tienen una dieta a base de peces";
     }
     public String dormir(){
        return "El tigre: " + especieTigre + "duermen en árboles de los bosques asiáticos " + habitat;
     }
     public String correr(){
        return "El tigre " + especieTigre + "corre a una velocidad de " + velocidad + "km/h";
     }
     public String comunicarse(){
        return "El tigre " + especieTigre + "ruge para comunicarse";
     }
}
