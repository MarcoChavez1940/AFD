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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Todas las transiciones del txt
        //desde la linea 5
        
        try{  
            File  archivo = new File("Prueba_Teoria.txt");
            //BufferedReader archivo = new BufferedReader(new FileReader("Prueba_Teoria.txt"));
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
             //Estado finales escritos en la linea 4
            
            ArrayList<Transicion> transiciones = new ArrayList(); 
            
            while(lectura.hasNextLine()){
                String transicione = lectura.nextLine();
                char cadenaT = transicione.charAt(3);
                String estado = transicione.substring(0, 2);
                String estadof = transicione.substring(5,7);
                transiciones.add(new Transicion(estado, cadenaT, estadof));
            }
                   
            Scanner entradaC = new Scanner(System.in);
            String cadena = entradaC.nextLine();
            
            Verificar verificar = new Verificar();
            verificar.verificarCadena(transiciones, inicial, finales, cadena);
            
        }catch(FileNotFoundException e){
            System.out.println("No hay archivo");
        }
        
     /*   transiciones.add(new Transicion("A1","0","A2")); //Se añaden las transiciones al array
        transiciones.add(new Transicion("A1","1","A1"));
        transiciones.add(new Transicion("A2","0","A2"));
        transiciones.add(new Transicion("A2","1","A1"));
        
       */ 
        
     //String inicial = "A1"; //Estado inicial escrito en la linea 3 del txt
        
        
        
        //Cadena a evaluar si es aceptada o no.
        
        
        //Este automata acepta solo las cadenas que terminen en 0
    }
    
}
