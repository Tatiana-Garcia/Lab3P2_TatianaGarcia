
package lab3p2_tatianagarcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_TatianaGarcia {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionario = new ArrayList();
    static ArrayList<Vehiculos>vehiculos = new ArrayList();

    public static void main(String[] args) {
        //ArrayList<Vehiculos>vehiculos = new ArrayList();
        
        
        
        int menu = 0;
        do {
            System.out.print("Menu de opciones:\n"
                    + "1-CRUD Concesionaria\n"
                    + "2-CRUD Clientes\n"
                    + "3-CRUD Vehiculos\n"
                    + "4-Salida\n\n"
                    + "Ingrese opcion: ");

            menu = leer.nextInt();
            
            switch (menu) {
                case 1:{
                    int op=0;
                    do{
                        System.out.println("Menu de opciones:\n"
                                + "1-Crear\n"
                                + "2-Eliminar\n"
                                + "3-Modificar\n\n"
                                + "Ingrese opcion: ");
                        op = leer.nextInt();
                    }while(op<1||op>3);
                    if(op ==1){
                        concesionario.add(con());
                    }
                    if(op ==2){
                        int pos ;
                        System.out.println("Ingresa la posicion del concesionario a borrar: ");
                        pos = leer.nextInt();
                        if(pos>=0 && pos<concesionario.size()){
                            concesionario.remove(pos);
                        } 
                    }
                    if(op ==3){
                        int pos ;
                        System.out.println("Ingresa la posicion del concesionario a modificar: ");
                        pos = leer.nextInt();
                        if(pos>=0 && pos<concesionario.size()){
                            System.out.println("Ingrese nueva direccion: ");
                            leer = new Scanner(System.in);
                            String direccion = leer.nextLine();
                            concesionario.get(pos).setDireccion(direccion);
                        }
                    }
                    if(op ==4 ){
                        String s=""; 
                        for (Object t : vehiculos) {
                           s += "\nPosicion: "+vehiculos.indexOf(t)+"\n"+t+"\n"; 
                        }

                        System.out.println(s);
                    }
                    break; 
                }
                case 2: {
                    break; 
                }
                case 3: {
                    int op=0;
                    do{
                        System.out.println("Menu de opciones:\n"
                                + "1-Crear\n"
                                + "2-Eliminar\n"
                                + "3-Modificar\n"
                                + "4-Listar\n\n"
                                + "Ingrese opcion: ");
                        op = leer.nextInt();
                    }while(op<1||op>4);
                    if(op ==1){
                        vehiculos.add(CrearVehiculo());
                    }
                    if(op ==2){
                        int pos ;
                        System.out.println("Ingresa la posicion del vehiculo a eliminar: ");
                        pos = leer.nextInt();
                        if(pos>=0 && pos<vehiculos.size()){
                            vehiculos.remove(pos);
                        } 
                    }
                    if(op ==3){
                        int pos ;
                        System.out.println("Ingresa la posicion del vehiculo a modificar: ");
                        pos = leer.nextInt();
                        if(pos>=0 && pos<vehiculos.size()){
                            
                        }
                    }
                    if(op ==4){
                        String s=""; 
                        for (Object t : vehiculos) {
                           s += "\nPosicion: "+vehiculos.indexOf(t)+"\n"+t+"\n"; 
                        }

                        System.out.println(s);
                    }
                    break; 
                }  
                case 4:{
                    System.out.println("Salida del sistema");
                    break; 
                }
                    
            }
            
        }while(menu != 4);
    }//fin del main
    static Concesionaria con(){
        Concesionaria retorno;
        String nombre; 
        String direccion; 
        ArrayList<Vehiculos>vehiculos = new ArrayList();//vehiculos para venta
        ArrayList<Clientes>clientes = new ArrayList();
        int saldo;
        
        System.out.println("Ingrese nombre de concesionaria: ");
        leer = new Scanner(System.in);
        nombre = leer.nextLine();
        
        System.out.println("Ingrese direccion: ");
        leer = new Scanner(System.in);
        direccion = leer.nextLine();
        
        System.out.println("Ingrese saldo ");
        leer = new Scanner(System.in);
        saldo = leer.nextInt();
        
        retorno = new Concesionaria(nombre, concesionario.size()+1, direccion, saldo);
        return retorno; 
    }
    static Vehiculos CrearVehiculo(){
        Vehiculos retorno = null;
        String color; 
        String marca; 
        String modelo; 
        int year; 
        int precio; 
        int cant_llantas;
        
        System.out.println("Ingrese color: ");
        leer = new Scanner(System.in);
        color = leer.nextLine();
        
        System.out.println("Ingrese marca: ");
        leer = new Scanner(System.in);
        marca = leer.nextLine();
        
        System.out.println("Ingrese modelo: ");
        leer = new Scanner(System.in);
        modelo = leer.nextLine();
        
        System.out.println("Ingrese año: ");
        year = leer.nextInt();
        
        System.out.println("Ingrese precio: ");
        precio = leer.nextInt();
        
        cant_llantas =0;
        do{
            System.out.println("Ingrese la cantidad llantas: ");
            cant_llantas = leer.nextInt();
        }while(cant_llantas!=2&&cant_llantas!= 4);
        
        
        if(cant_llantas ==2){
            int op = 0; 
            do {
            System.out.println("Opciones de Vehiculo: \n"
                    + "1. Motocicleta\n"
                    + "2. Bicicleta");
            op = leer.nextInt();
            }while(op<1||op>2);
            switch (op) {
                case 1: {
                    int desplazamiento;
                    boolean electrica;
                    
                    System.out.println("Ingrese desplazamiento de motocicleta");
                    desplazamiento = leer.nextInt();
                    
                    int op2 = 0; 
                    do {
                    System.out.println("Es electrica? \n"
                            + "1. Si\n"
                            + "2. No");
                    op2 = leer.nextInt();
                    }while(op2<1||op2>2);
                    if(op2 ==1 ){
                        electrica = true;
                    }
                    else{
                        electrica = false; 
                    }
                    retorno = new Motocicleta(desplazamiento, electrica, color, marca, modelo, year, precio, cant_llantas);
                    
                    break;}
                case 2: { 
                    String descripcion; 
                    int radio; 
                    String tipo;
                    
                    System.out.println("Ingrese descripcion del vehiculo: ");
                    leer = new Scanner(System.in);
                    descripcion = leer.nextLine();
                    
                    System.out.println("Ingrese radio: ");
                    radio = leer.nextInt();
                    
                    int op2 = 0; 
                    do {
                    System.out.println("Tipo de Bicicleta \n"
                            + "1. BMX\n"
                            + "2. de calle");
                    op2 = leer.nextInt();
                    }while(op2<1||op2>2);
                    if(op2 ==1 ){
                        tipo = "BMX";
                    }
                    else{
                        tipo = "de calle"; 
                    }
                    retorno = new Bicicleta(descripcion, radio, tipo, color, marca, modelo, year, precio, cant_llantas);
                    
                    break; }
            }//Fin del switch
            
        }//Fin del if llantas ==2
        if(cant_llantas ==4){
            int op = 0; 
            do {
            System.out.println("Opciones de Vehiculo: \n"
                    + "1. Carro\n"
                    + "2. Camion de Carga\n"
                    + "3. Bus");
            op = leer.nextInt();
            }while(op<1||op>3);
            switch (op) {
                case 1: {
                    int cant_puertas; 
                    String motor; 
                    int velocidad; 
                    
                    System.out.println("Ingrese cantidad de puertas: ");
                    cant_puertas = leer.nextInt();
                    
                    System.out.println("Ingrese descripcion del motor: ");
                    leer = new Scanner(System.in);
                    motor = leer.nextLine();
                    
                    System.out.println("Ingrese velocidad maxima: ");
                    velocidad = leer.nextInt();
                    
                    retorno = new Carro(cant_puertas, motor, velocidad, color, marca, modelo, year, precio, cant_llantas);
                    break;
                }
                case 2: { 
                    int volumen; 
                    int altura; 
                    boolean excavadora; 
                    
                    System.out.println("Ingrese volumen maximo de carga: ");
                    volumen = leer.nextInt();
                    
                    System.out.println("Ingrese altura del camion: ");
                    altura = leer.nextInt();
                    
                    int op2 = 0; 
                    do {
                    System.out.println("Tiene retroexcavadoras? \n"
                            + "1. Si\n"
                            + "2. No");
                    op2 = leer.nextInt();
                    }while(op2<1||op2>2);
                    if(op2 ==1 ){
                        excavadora = true;
                    }
                    else{
                        excavadora = false; 
                    }
                    
                    retorno = new CamiondeCarga(volumen, altura, excavadora, color, marca, modelo, year, precio, cant_llantas);
                    break; 
                }
                case 3: {
                    int pasajeros;  
                    
                    System.out.println("Ingrese pasajeros: ");
                    pasajeros = leer.nextInt();
                    
                    retorno = new Bus(pasajeros, color, marca, modelo, year, precio, cant_llantas);
                    
                    break; 
                }
            }//Fin del switch
        }//Fin if cant_llantas = 4
        
        return retorno; 
    }
    
}
