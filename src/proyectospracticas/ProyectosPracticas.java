/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectospracticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class sobrecargaProyectosPracticas{
  void sobrecargaDemo(){
      System.out.println("sobrecarga sin parametros \n");
  }
  void sobrecargaDemo(int a){
      System.out.println("sobrecarga con un parametro \n" + a);
  }
  
  int sobrecargaDemo(int a, int b){
      System.out.println("sobrecarga con parametros "+ a + " : " + b);
      return a+b;
  }
}
public class ProyectosPracticas {

    
    public static void main(String[] args) {
        
        //Programa sobre POO
        
        Scanner s = new Scanner(System.in);
        int opc;
        System.out.println("1.- Getters y Setters");
        System.out.println("2.- Sobrecarga");
        System.out.println("3.- ArrayList<>");
        System.out.println("4.- Foreach");
        System.out.println("5.- Suma con metodos");
        System.out.println("6.- StringTokenizer");
        System.out.println("*********************");
        System.out.println("Elige una opcion \n");
        opc = s.nextInt();
        switch(opc){
            case 1: 
                
                String nombre,apellido,fecha;
                int edad;
                Abstraccion abs = new Abstraccion();
                System.out.println("Cual es tu nombre: ");
                abs.setNombre(nombre = s.next());
                System.out.println("Ingresa tu apellido: ");
                abs.setApellido(apellido = s.next());
                System.out.println("Ingresa tu edad: ");
                abs.setEdad(edad = s.nextInt());
                System.out.println("Ingresa tu fecha de nacimiento: DD/MM/AAAA: ");
                abs.setFecha(fecha = s.next());
                
                System.out.println("Resultados: \n");
                System.out.println("Tu nombre es: " + abs.getNombre());
                System.out.println("Tu apellido es: " + abs.getApellido());
                System.out.println("Tu edad es: " + abs.getEdad());
                System.out.println("Tu Fecha de nacimiento es: " + abs.getFecha());
                break;
            case 2: 
                sobrecargaProyectosPracticas sbc = new sobrecargaProyectosPracticas();
                int suma;
                sbc.sobrecargaDemo();
                sbc.sobrecargaDemo(22);
                suma = sbc.sobrecargaDemo(1, 4);
                System.out.println("" + suma);
                
                break; 
            case 3:
                ArrayList array = new ArrayList(); 
                array.add(5);
                array.add(6);
                array.add(7);
                for(int i = 0; i<array.size(); i++){
                   
                    System.out.println("Indice ["+i+"] -> "+array.set(i, array ));
                    //System.out.println("Indice ["+i+"] -> " +array);
                    
                
                }
                
                break;
            case 4:
                StringTokenizer token = new StringTokenizer("");
                List<String> lista = new ArrayList<String>();
                
                lista.add("Jorge");
                lista.add("Alberto");
                lista.add("Cruz");
                lista.add("Percastegui");
                
                for(String nombres : lista){
                    
                    System.out.println("" + nombres);
                }
                break;
            case 5:
                int a,b;
                System.out.println("Ingresa el numero 1");
                a = s.nextInt();
                System.out.println("Ingresa el numero 2");
                b = s.nextInt();
                System.out.println("\nLa suma es: "+ suma(a,b));
                break;
                
            case 6:
                stringtokenizercontador();
                break;
                
        }
        
        
        
        
    }
    
    public static void stringtokenizercontador(){
        StringTokenizer token = new StringTokenizer("Jorge=Programador;Alberto=Informático;","=;",true);
        System.out.println("Hay un total de: "+token.countTokens() + " tokens");
        while(token.hasMoreTokens()){
            System.out.println(""+token.nextToken());
        }
        }
    
    public static int suma(int a, int b){
    return a + b;
    }
    
}
