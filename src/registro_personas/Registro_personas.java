
package registro_personas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Registro_personas {

    static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
   static boolean bandera=true;
    
    public static void main(String[] args) {
       seleccionMenu();
    }
    
    public static void seleccionMenu(){
	    int aux;
	    Scanner sc = new Scanner(System.in);
	   
	    do{
	        menu();
	         aux=sc.nextInt();
	         if(aux>0 && aux<4){
	             switch(aux){
	                 case 1:
	                     Registro();
	                     break;
	                 case 2:
	                     Mostrar_clientes();
	                     break;
                         case 3:
                             salir();
	                 default:
	                     break;     
	             }
	         }else{
	            System.out.println("ingrese un opcion valida"); 
	         }
	    }while(bandera==true);
	    
	}

    public static void Registro(){
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("Cuantos clientes quiere registrar");
        x=sc.nextInt();
        //areglo para el registro de datos de los clientes
        
        
        for(int i=0;i<x;i++){
            String nombre="";
            int documento=0;
            long celular=0;
            String direccion="";
            boolean Cliente_frecuente=false;
            int id=0;
            
            System.out.println("Ingrese el nombre del cliente");
             nombre=sc.nextLine();
             sc.nextLine();
            System.out.println("ingrese el documento del cliente");
             documento=sc.nextInt();
             sc.nextLine();
            System.out.println("ingrese el numero de celular del cliente");
             celular=sc.nextLong();
             sc.nextLine();
            System.out.println("Ingrese la direccion del cliente");
             direccion=sc.nextLine();
             sc.nextLine();
            System.out.println("es un cliente frecuente(escriba 1 si es recuente o 0 si no)");
             Cliente_frecuente=sc.nextBoolean();
             sc.nextLine();
            System.out.println("ingrese el id del cliente");
             id=sc.nextInt(); 
             sc.nextLine();
            
            Clientes registro = new Clientes(nombre,documento,celular,direccion,Cliente_frecuente,id);
            
            clientes.add(registro);
            
            
        }
    }
    
    public static void Mostrar_clientes(){
        for(int i =0;i<=clientes.size()-1;i++){
        
            
        System.out.println(clientes.get(i).getnombre());
        System.out.println(clientes.get(i).getdocumento());
        System.out.println(clientes.get(i).getcelular());
        System.out.println(clientes.get(i).getdireccion());
        System.out.println(clientes.get(i).getCliente_frecuente());
        System.out.println(clientes.get(i).getid());
        }

    }
    
    public static boolean salir(){
        bandera=false;
        return bandera;
    }

    
    public static void menu(){
        System.out.println("---------------MENU--------------");
	System.out.println("1.registral los clientes ");   
        System.out.println("2.mostrar a los clientres registrados");
        System.out.println("3.salir");
    
    
    }
    
}
