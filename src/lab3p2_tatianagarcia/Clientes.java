
package lab3p2_tatianagarcia;

import java.util.ArrayList;

public class Clientes {
    private int ID; 
    private String nombre;
    private ArrayList<Vehiculos>vehiculos = new ArrayList();///Vehiculos a propiedad del cliente 
    private double saldo; //Modificado cade q se compre o venda vehiculo

    public Clientes() {
    }

    public Clientes(int ID, String nombre, double saldo) {
        this.ID = ID;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String ve = "No hay vehiculos";
        if(!vehiculos.isEmpty()){
            ve= vehiculos.toString();
        }
        
        return "Clientes{" + "ID=" + ID + ", nombre=" + nombre + ", vehiculos=" + ve + ", saldo=" + saldo + '}';
    }
    
}
