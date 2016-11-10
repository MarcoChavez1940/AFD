/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afd;

import java.io.*;
import java.util.*;

/**
 *
 * @author Marco
 */
public class AFD {

    public static void terminacionEnCero(String cadena){ 
        try{  
            File  archivo = new File("terminacion_0.txt");
            Scanner lectura = new Scanner(archivo);
            String estados = lectura.nextLine(); 
            String cadenas = lectura.nextLine();
            String inicial = lectura.nextLine(); 
            ArrayList finales = new ArrayList(); //Array de finales
            String finale = lectura.nextLine();
            String[] f = finale.split(" ");
            
            for(int l=0;l<f.length;l++){
                finales.add(f[l]);  
            }
            
            ArrayList<Transicion> transiciones = new ArrayList(); 
            
            while(lectura.hasNextLine()){
                String transicione = lectura.nextLine();
                char cadenaT = transicione.charAt(3);
                String estado = transicione.substring(0, 2);
                String estadof = transicione.substring(5,7);
                transiciones.add(new Transicion(estado, cadenaT, estadof));
            }
            
            
            
            Verificar verificar = new Verificar();
            verificar.verificarCadena(transiciones, inicial, finales, cadena);
            
        }catch(FileNotFoundException e){
            System.out.println("No hay archivo");
        }
    
    }
    
    public static void automata2(String cadena){ 
        try{  
            File  archivo = new File("terminacion_0.txt");
            Scanner lectura = new Scanner(archivo);
            String estados = lectura.nextLine(); 
            String cadenas = lectura.nextLine();
            String inicial = lectura.nextLine(); 
            ArrayList finales = new ArrayList(); //Array de finales
            String finale = lectura.nextLine();
            String[] f = finale.split(" ");
            
            for(int l=0;l<f.length;l++){
                finales.add(f[l]);  
            }
            
            ArrayList<Transicion> transiciones = new ArrayList(); 
            
            while(lectura.hasNextLine()){
                String transicione = lectura.nextLine();
                char cadenaT = transicione.charAt(3);
                String estado = transicione.substring(0, 2);
                String estadof = transicione.substring(5,7);
                transiciones.add(new Transicion(estado, cadenaT, estadof));
            }
            
            
            
            Verificar verificar = new Verificar();
            verificar.verificarCadena(transiciones, inicial, finales, cadena);
            
        }catch(FileNotFoundException e){
            System.out.println("No hay archivo");
        }
    
    }
    
    public static void automata3(String cadena){ 
        try{  
            File  archivo = new File("terminacion_0.txt");
            Scanner lectura = new Scanner(archivo);
            String estados = lectura.nextLine(); 
            String cadenas = lectura.nextLine();
            String inicial = lectura.nextLine(); 
            ArrayList finales = new ArrayList(); //Array de finales
            String finale = lectura.nextLine();
            String[] f = finale.split(" ");
            
            for(int l=0;l<f.length;l++){
                finales.add(f[l]);  
            }
            
            ArrayList<Transicion> transiciones = new ArrayList(); 
            
            while(lectura.hasNextLine()){
                String transicione = lectura.nextLine();
                char cadenaT = transicione.charAt(3);
                String estado = transicione.substring(0, 2);
                String estadof = transicione.substring(5,7);
                transiciones.add(new Transicion(estado, cadenaT, estadof));
            }
            
            
            
            Verificar verificar = new Verificar();
            verificar.verificarCadena(transiciones, inicial, finales, cadena);
            
        }catch(FileNotFoundException e){
            System.out.println("No hay archivo");
        }
    
    }
    
    public static void automataseleccionado(String cadena, String file){ 
        try{  
            File  archivo = new File(file);
            Scanner lectura = new Scanner(archivo);
            String estados = lectura.nextLine(); 
            String cadenas = lectura.nextLine();
            String inicial = lectura.nextLine(); 
            ArrayList finales = new ArrayList(); //Array de finales
            String finale = lectura.nextLine();
            String[] f = finale.split(" ");
            
            for(int l=0;l<f.length;l++){
                finales.add(f[l]);  
            }
            
            ArrayList<Transicion> transiciones = new ArrayList(); 
            
            while(lectura.hasNextLine()){
                String transicione = lectura.nextLine();
                char cadenaT = transicione.charAt(3);
                String estado = transicione.substring(0, 2);
                String estadof = transicione.substring(5,7);
                transiciones.add(new Transicion(estado, cadenaT, estadof));
            }
            
            
            
            Verificar verificar = new Verificar();
            verificar.verificarCadena(transiciones, inicial, finales, cadena);
            
        }catch(FileNotFoundException e){
            System.out.println("No hay archivo");
        }
    
    }
    
}
