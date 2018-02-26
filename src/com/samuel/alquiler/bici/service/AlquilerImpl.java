/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.service;

import com.samuel.alquiler.bici.dao.BicicletaDaoImpl;
import com.samuel.alquiler.bici.dao.PersonaDaoImpl;

/**
 *
 * @author stovar
 */
public abstract class AlquilerImpl {
     Alquiler alq;

    public static  Alquiler RentaBici(int id,int p,int b, String tipo,int cantidad,double descuento){
        try{
            Alquiler alq = AlquilerFactory.getAlquiler(tipo);
            alq.setId(id);
            alq.setBike(new BicicletaDaoImpl().get(b));
            alq.setCliente(new PersonaDaoImpl().get(p));
            alq.setDescuento(descuento);
            alq.setType(tipo);
            alq.setTime(cantidad);
            alq.setImporte(alq.getImporteType());
            
            return  alq;
         }catch (NullPointerException ex){
             
            ex.printStackTrace();
            return null;
        }
       
    }
    
}
