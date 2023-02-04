
package lab3p2_tatianagarcia;

public class Carro extends Vehiculos{
    private int cant_puertas; 
    private String motor; 
    private int velocidad; 

    public Carro() {
        super();
    }

    public Carro(int cant_puertas, String motor, int velocidad, String color, String marca, String modelo, int year, double precio, int cant_llantas) {
        super(color, marca, modelo, year, precio, cant_llantas);
        this.cant_puertas = cant_puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" + "cant_puertas=" + cant_puertas + ", motor=" + motor + ", velocidad=" + velocidad + '}';
    }
    
    
}
