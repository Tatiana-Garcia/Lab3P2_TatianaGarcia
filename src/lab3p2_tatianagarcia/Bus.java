
package lab3p2_tatianagarcia;

public class Bus extends Vehiculos{
    private int pasajeros; 
    private String tipo; 

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String color, String marca, String modelo, int year, int precio, int cant_llantas) {
        super(color, marca, modelo, year, precio, cant_llantas);
        if(pasajeros>50){
            this.tipo = "De Puerta";
        }else{
            this.tipo = "Rapidito";
        }
        //this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
}
