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
public class Persona {
    private String name="";
    private int dni=0;
    private char sexo='M';
   

    public Persona() {
    }
    
    public Persona(String n,int id) {
        name = n;
        dni = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public boolean equals(Object o) {
        if (!(o instanceof Persona))
                    return false;		
        Persona n = (Persona)o;
        return n.name.equals(name) && n.dni == dni;
    }
 
    public int hashCode() {
            return 31 * name.hashCode() + dni;
    }
    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", dni=" + dni + ", sexo=" + sexo + '}';
    }
    
}
