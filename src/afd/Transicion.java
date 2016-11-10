/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afd;

/**
 *
 * @author Marco
 */
public class Transicion {

    private String estado;
    private char alfabeto;
    private String estadollegada;

    public Transicion(String estado, char alfabeto, String estadollegada) {
        this.estado = estado;
        this.alfabeto = alfabeto;
        this.estadollegada = estadollegada;
    }

    @Override
    public String toString() {
        return "Transicion{" + "estado=" + estado + ", alfabeto=" + alfabeto + ", estadollegada=" + estadollegada + '}';
    }

    

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the alfabeto
     */
    public char getAlfabeto() {
        return alfabeto;
    }

    /**
     * @param alfabeto the alfabeto to set
     */
    public void setAlfabeto(char alfabeto) {
        this.alfabeto = alfabeto;
    }

    /**
     * @return the estadollegada
     */
    public String getEstadollegada() {
        return estadollegada;
    }

    /**
     * @param estadollegada the estadollegada to set
     */
    public void setEstadollegada(String estadollegada) {
        this.estadollegada = estadollegada;
    }

    }


    
    

