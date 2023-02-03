
package lab3p2_tatianagarcia;

public class Bicicleta extends Vehiculos{
    private String descripcion; 
    private int radio; 
    private String tipo; //BMX o de calle

    public Bicicleta() {
    }

    public Bicicleta(String descripcion, int radio, String tipo, String color, String marca, String modelo, int year, int precio, int cant_llantas) {
        super(color, marca, modelo, year, precio, cant_llantas);
        this.descripcion = descripcion;
        this.radio = radio;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", tipo=" + tipo + '}';
    }
    
    
}
