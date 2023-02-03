
package lab3p2_tatianagarcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_TatianaGarcia {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionario = new ArrayList();

    public static void main(String[] args) {
        ArrayList<Vehiculos>vehiculos = new ArrayList();
        
        
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
                    
                    break; 
                }
                case 2: {
                    break; 
                }
                case 3: {
                    break; 
                }  
                case 4:
                    System.out.println("Salida del sistema");
                    break; 
                    
            }
            
        }while(menu != 5);
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
    
}
