package AdminAnimales;

abstract public class Felino extends Mamifero {
    protected Float tamanoGarras;
    protected int velocidad;

    public Felino(Float tamanoGarras, int velocidad, String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        super (habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
