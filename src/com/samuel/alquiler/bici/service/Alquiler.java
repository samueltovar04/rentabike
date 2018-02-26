/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.service;

import com.samuel.alquiler.bici.model.Bicicleta;
import com.samuel.alquiler.bici.model.Persona;
import java.util.Objects;

/**
 *
 * @author stovar
 */
public abstract class Alquiler {
    private int id;
    private int time;
    private String type;
    private double importe;
    private double descuento;
    
    private Persona cliente;
    private Bicicleta bike;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    
    public  void aplicaDescuento(){
       this.setImporte(this.getImporte() -((this.getDescuento()/100)*(getTime()*5)));
    }
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBike() {
        return bike;
    }

    public void setBike(Bicicleta bike) {
        this.bike = bike;
    }
    
    public int getId() {
    return id;
    }
    public void setId(int id) {
    this.id = id;
    }
    public double getTime() {
    return time;
    }
    public void setTime(int time) {
    this.time = time;
    }

     @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + this.type.hashCode();
        hash = 53 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", time=" + time + ", type=" + type + ", importe=" + importe + ", cliente=" + cliente + ", bike=" + bike + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquiler other = (Alquiler) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.bike, other.bike)) {
            return false;
        }
        return true;
    }

    public abstract double getImporteType();
    
   
    
}
