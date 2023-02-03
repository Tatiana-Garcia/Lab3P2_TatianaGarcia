
package lab3p2_tatianagarcia;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre; 
    private int ID; 
    private String direccion; 
    private ArrayList<Vehiculos>vehiculos = new ArrayList();//vehiculos para venta
    private ArrayList<Clientes>clientes = new ArrayList();
    private int saldo; //para transacciones de compra y venta

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int ID, String direccion, int saldo) {
        this.nombre = nombre;
        this.ID = ID;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", ID=" + ID + ", direccion=" + direccion + ", vehiculos=" + vehiculos + ", clientes=" + clientes + ", saldo=" + saldo + '}';
    }
    
    
}
