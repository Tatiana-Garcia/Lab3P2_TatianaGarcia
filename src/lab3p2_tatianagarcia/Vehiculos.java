
package lab3p2_tatianagarcia;

public class Vehiculos {
    protected String color; 
    protected String marca; 
    protected String modelo; 
    protected int year; 
    protected double precio; 
    protected int cant_llantas;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int year, double precio, int cant_llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.cant_llantas = cant_llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant_llantas() {
        return cant_llantas;
    }

    public void setCant_llantas(int cant_llantas) {
        this.cant_llantas = cant_llantas;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", precio=" + precio + ", cant_llantas=" + cant_llantas + '}';
    }
    
    
}
