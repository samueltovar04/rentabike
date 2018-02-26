/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.model;

/**
 *
 * @author stovar
 */
public class Bicicleta {
    private String modelo="";
    private int id=0;
    private char status='A';

    public Bicicleta() {
    }
    public Bicicleta(String m , int i) {
        modelo = m;
        id = i;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    public boolean equals(Object o) {
        if (!(o instanceof Bicicleta))
                    return false;		
        Bicicleta n = (Bicicleta)o;
        return n.modelo.equals(modelo) && n.id == id;
    }
 
    public int hashCode() {
            return 31 * modelo.hashCode() + id;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "modelo=" + modelo + ", id=" + id + ", status=" + status + '}';
    }
    
}
