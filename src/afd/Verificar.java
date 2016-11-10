/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afd;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Verificar {
    
    
    public void verificarCadena(ArrayList<Transicion> lista, String inicial, ArrayList finales, String cadena){
        
        ArrayList<Transicion> transiciones = new ArrayList();
        String Estadoaux = inicial;
        
        for(int i=0;i<cadena.length();i++){
            
            for(int j=0;j<lista.size();j++){                //
                if(Estadoaux.equals(lista.get(j).getEstado())){  //
                    transiciones.add(lista.get(j));         // Aqui se crea el array donde
                }                                           // el estado actual coincide
            }                                               //
        
            for(int k=0;k<transiciones.size();k++){                         //
                if(cadena.charAt(i) == transiciones.get(k).getAlfabeto()){  //Aqui se busca la transicion
                    Estadoaux = transiciones.get(k).getEstadollegada();     // donde coincide el alfabeto
                }                                                           // con el caracter actual
            }                                                               //
            
            transiciones.clear(); //Se vacia el conjunto de transiciones.
        }
        
        /*if(finales.contains(Estadoaux)){
            System.out.println("Aceptada");
        }
        else{
            System.out.println("No aceptada");
        }*/
        if(finales.contains(Estadoaux)){
            System.out.println("aceptado");
        }
        else{
            System.out.println("no aceptado");
        }
        
    }
    
}
