
package lab3p2_tatianagarcia;

public class CamiondeCarga extends Vehiculos{
    private int volumen; 
    private int altura; 
    private boolean excavadora; 

    public CamiondeCarga() {
        super();
    }

    public CamiondeCarga(int volumen, int altura, boolean excavadora, String color, String marca, String modelo, int year, int precio, int cant_llantas) {
        super(color, marca, modelo, year, precio, cant_llantas);
        this.volumen = volumen;
        this.altura = altura;
        this.excavadora = excavadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isExcavadora() {
        return excavadora;
    }

    public void setExcavadora(boolean excavadora) {
        this.excavadora = excavadora;
    }

    @Override
    public String toString() {
        return "CamiondeCarga{" + "volumen=" + volumen + ", altura=" + altura + ", excavadora=" + excavadora + '}';
    }
    
    
    
}
