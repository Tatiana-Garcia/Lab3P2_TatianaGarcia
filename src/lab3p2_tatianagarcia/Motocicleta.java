
package lab3p2_tatianagarcia;

public class Motocicleta extends Vehiculos{
    private int desplazamiento; 
    private boolean electrica; 

    public Motocicleta() {
        super();
    }

    public Motocicleta(int desplazamiento, boolean electrica, String color, String marca, String modelo, int year, int precio, int cant_llantas) {
        super(color, marca, modelo, year, precio, cant_llantas);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }
    
}
