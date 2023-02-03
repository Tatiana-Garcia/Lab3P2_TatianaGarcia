
package lab3p2_tatianagarcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_TatianaGarcia {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionario = new ArrayList();
    static ArrayList<Vehiculos>vehiculos = new ArrayList();
    static ArrayList<Clientes>clientes = new ArrayList();

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
                    break; 
                }
                case 2: {
                    int op=0;
                    do{
                        System.out.println("Menu de opciones:\n"
                                + "1-Crear\n"
                                + "2-Eliminar\n"
                                + "3-Listar\n\n"
                                + "Ingrese opcion: ");
                        op = leer.nextInt();
                    }while(op<1||op>3);
                    if(op ==1){
                        clientes.add(clientes());
                    }
                    if(op ==2){
                        int pos ;
                        System.out.println("Ingresa la posicion del cliente a borrar: ");
                        pos = leer.nextInt();
                        if(pos>=0 && pos<clientes.size()){
                            clientes.remove(pos);
                        } 
                    }
                    if(op ==3){
                        
                        String s=""; 
                        for (Object t : clientes) {
                           s += "\nPosicion: "+clientes.indexOf(t)+"\n"+t+"\n"; 
                        }

                        System.out.println(s);
                    }
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
                        Vehiculos t = CrearVehiculo();
                        vehiculos.add(t);
                        System.out.println("A que concecionario quiere que vaya el vehiculo? Ingrese posicion: ");
                        int pos = leer.nextInt();
                        
                        if(pos>=0 && pos<concesionario.size()){
                            concesionario.get(pos).getVehiculos().add(t);
                        }
                        
                        
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
                        do{
                        System.out.println("Ingresa la posicion del vehiculo a modificar: ");
                        pos = leer.nextInt();
                        }while(pos<0|| pos>vehiculos.size());
                        Object posicion = vehiculos.get(pos);
                        
                        int op2 = 0;
                        if(vehiculos.get(pos) instanceof Motocicleta){
                            System.out.println("Que desea modificar?\n"
                                    + "1-color\n"
                                    + "2-marca\n"
                                    + "3-modelo\n"
                                    + "4-año\n"
                                    + "5-precio\n"
                                    + "6-Desplazamiento\n"
                                    + "7-Es electrica?\n"
                                    + "Elija opcion:");
                            op2 = leer.nextInt();
                            if (op2 == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Motocicleta) posicion).setColor(newVal);
                            }else if (op2 == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Motocicleta) posicion).setMarca(newVal);
                            }else if (op2 == 3) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Motocicleta) posicion).setModelo(newVal);
                            }else if (op2 == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Motocicleta) posicion).setYear(newVal);
                            }else if (op2 == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Motocicleta) posicion).setPrecio(newVal);
                            }else if (op2 == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Motocicleta) posicion).setDesplazamiento(newVal);
                            }if (op2 == 7) {
                                    
                                    String tipo;
                                    
                                    int op3 = 0; 
                                    
                                    do {
                                    System.out.println("Tipo de Bicicleta \n"
                                            + "1. BMX\n"
                                            + "2. de calle");
                                    op3 = leer.nextInt();
                                    }while(op3<1||op3>2);
                                    if(op2 ==1 ){
                                        tipo = "BMX";
                                    }
                                    else{
                                        tipo = "de calle"; 
                                    }
                                    
                                    ((Bicicleta) posicion).setTipo(tipo);  
                            }
                                    
                        }else if (vehiculos.get(pos) instanceof Bicicleta){
                            System.out.println("Que desea modificar?\n"
                                    + "1-color\n"
                                    + "2-marca\n"
                                    + "3-modelo\n"
                                    + "4-año\n"
                                    + "5-precio\n"
                                    + "6-Descripcion de motor\n"
                                    + "7-Radio\n"
                                    + "8-Tipo\n"
                                    + "Elija opcion:");
                            op2 = leer.nextInt();
                            if (op2 == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bicicleta) posicion).setColor(newVal);
                            }else if (op2 == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bicicleta) posicion).setMarca(newVal);
                            }else if (op2 == 3) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bicicleta) posicion).setModelo(newVal);
                            }else if (op2 == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bicicleta) posicion).setYear(newVal);
                            }else if (op2 == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bicicleta) posicion).setPrecio(newVal);
                            }else if (op2 == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bicicleta) posicion).setDescripcion(newVal);
                            }else if (op2 == 7) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bicicleta) posicion).setRadio(newVal);
                            }if (op2 == 8) {
                                    
                                    boolean newVal;
                                    
                                    int op3 = 0; 
                                    do {
                                    System.out.println("Es electrica? \n"
                                            + "1. Si\n"
                                            + "2. No");
                                    op3 = leer.nextInt();
                                    }while(op3<1||op3>2);
                                    if(op3 ==1 ){
                                        newVal = true;
                                    }
                                    else{
                                        newVal = false; 
                                    }
                                    ((Motocicleta) posicion).setElectrica(newVal);
                                    
                            }
                            
                        }else if (vehiculos.get(pos) instanceof Carro){
                            System.out.println("Que desea modificar?\n"
                                    + "1-color\n"
                                    + "2-marca\n"
                                    + "3-modelo\n"
                                    + "4-año\n"
                                    + "5-precio\n"
                                    + "6-Cantidad de puertas\n"
                                    + "7-Motor\n"
                                    + "8-Velocidad\n"
                                    + "Elija opcion:");
                            op2 = leer.nextInt();
                            if (op2 == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Carro) posicion).setColor(newVal);
                            }else if (op2 == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Carro) posicion).setMarca(newVal);
                            }else if (op2 == 3) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Carro) posicion).setModelo(newVal);
                            }else if (op2 == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Carro) posicion).setYear(newVal);
                            }else if (op2 == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Carro) posicion).setPrecio(newVal);
                            }else if (op2 == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Carro) posicion).setCant_puertas(newVal);
                            }else if (op2 == 7) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Carro) posicion).setMotor(newVal);
                            }if (op2 == 8) {
                                   System.out.println("Ingrese nuevo valor:");
                                   int newVal = leer.nextInt();
                                   ((Carro) posicion).setVelocidad(newVal);
                                    
                            }
                        }else if (vehiculos.get(pos) instanceof CamiondeCarga){
                            System.out.println("Que desea modificar?\n"
                                    + "1-color\n"
                                    + "2-marca\n"
                                    + "3-modelo\n"
                                    + "4-año\n"
                                    + "5-precio\n"
                                    + "6-Volumen\n"
                                    + "7-Altura\n"
                                    + "8-Tiene excavadora?\n"
                                    + "Elija opcion:");
                            op2 = leer.nextInt();
                            if (op2 == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((CamiondeCarga) posicion).setColor(newVal);
                            }else if (op2 == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((CamiondeCarga) posicion).setMarca(newVal);
                            }else if (op2 == 3) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((CamiondeCarga) posicion).setModelo(newVal);
                            }else if (op2 == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((CamiondeCarga) posicion).setYear(newVal);
                            }else if (op2 == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((CamiondeCarga) posicion).setPrecio(newVal);
                            }else if (op2 == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((CamiondeCarga) posicion).setVolumen(newVal);
                            }else if (op2 == 7) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((CamiondeCarga) posicion).setAltura(newVal);
                            }if (op2 == 8) {
                                    
                                    boolean newVal;
                                    
                                    int op3 = 0; 
                                    do {
                                    System.out.println("Tiene retroexcavadora? \n"
                                            + "1. Si\n"
                                            + "2. No");
                                    op3 = leer.nextInt();
                                    }while(op3<1||op3>2);
                                    if(op3 ==1 ){
                                        newVal = true;
                                    }
                                    else{
                                        newVal = false; 
                                    }
                                    ((CamiondeCarga) posicion).setExcavadora(newVal);
                                    
                            }
                        }else if (vehiculos.get(pos) instanceof Bus){
                            System.out.println("Que desea modificar?\n"
                                    + "1-color\n"
                                    + "2-marca\n"
                                    + "3-modelo\n"
                                    + "4-año\n"
                                    + "5-precio\n"
                                    + "6-Pasajeros\n"
                                    + "Elija opcion:");
                            op2 = leer.nextInt();
                            if (op2 == 1) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bus) posicion).setColor(newVal);
                            }else if (op2 == 2) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bus) posicion).setMarca(newVal);
                            }else if (op2 == 3) {
                                    System.out.println("Ingrese nuevo valor:");
                                    leer = new Scanner(System.in);
                                    String newVal = leer.nextLine();
                                    ((Bus) posicion).setModelo(newVal);
                            }else if (op2 == 4) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bus) posicion).setYear(newVal);
                            }else if (op2 == 5) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bus) posicion).setPrecio(newVal);
                            }else if (op2 == 6) {
                                    System.out.println("Ingrese nuevo valor:");
                                    int newVal = leer.nextInt();
                                    ((Bus) posicion).setPasajeros(newVal);
                                    if(newVal>50){
                                        ((Bus) posicion).setTipo("De Puerta"); 
                                    }else{
                                        ((Bus) posicion).setTipo("Rapidito");
                                    }
                            }
                        }
                        
                        
                    }//Modificar vehiculo
                    if(op ==4){
                        System.out.println(Listar(vehiculos));
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
    
    static Clientes clientes(){
        Clientes retorno;
        String nombre;
        ArrayList<Vehiculos>vehiculos = new ArrayList();///Vehiculos a propiedad del cliente 
        int saldo;
        
        System.out.println("Ingrese nombre de concesionaria: ");
        leer = new Scanner(System.in);
        nombre = leer.nextLine();
        
        System.out.println("Ingrese saldo ");
        leer = new Scanner(System.in);
        saldo = leer.nextInt();
        
        
        
        retorno = new Clientes(clientes.size()+1, nombre, saldo);
        return retorno;
    }
    
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
    static String Listar(ArrayList lista){
        String s=""; // Collections.swap(lista, menu, menu);
                for (Object t : lista) {
                    if(t instanceof Carro){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof CamiondeCarga){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof Bus){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof Motocicleta){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof Bicicleta){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                return s;
    }
    
}
