/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.app;

import com.samuel.alquiler.bici.model.Persona;
import com.samuel.alquiler.bici.service.Alquiler;
import com.samuel.alquiler.bici.service.AlquilerImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author stovar
 */
public class Alquilerbici {

    public static void main(String[] args) {
        Alquiler a;
        Persona p;
        int dni,arreglo[];
        
        Map<Integer, Alquiler> RentaBici= new HashMap<>();
        a= AlquilerImpl.RentaBici(1,0, 0, "week", 1,30);
        RentaBici.put(1, a);
        a= AlquilerImpl.RentaBici(2,1, 1, "day", 4,30);
        RentaBici.put(2, a);
        a= AlquilerImpl.RentaBici(3,0, 2, "hour", 12,30);
        RentaBici.put(3, a);
        a= AlquilerImpl.RentaBici(4,0, 3, "day", 2,30);
        RentaBici.put(4, a);
        
        arreglo = new int[2];
        dni=0;
        for(Alquiler alq : RentaBici.values()) {
           p =(Persona)alq.getCliente();
           dni =p.getDni();
           System.out.println(dni);
           arreglo[dni]= arreglo[dni]+1;                 
           System.out.println("sfsdf"+Arrays.toString(arreglo));
        }
        dni=0;
        Iterator it = RentaBici.entrySet().iterator();
        int cont = 0;
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            
            Alquiler al = (Alquiler)e.getValue();
            Persona pe = al.getCliente();
            dni = pe.getDni();
            try{
                cont= arreglo[dni];   
             }catch(Exception e2){
               continue;
            }
            if(cont>=3)
                {
                    al.aplicaDescuento();
                }
            
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
        
    }
    
}
