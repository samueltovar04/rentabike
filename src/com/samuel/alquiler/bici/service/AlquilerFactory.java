/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.service;

/**
 *
 * @author stovar
 */
public class AlquilerFactory {
    public static Alquiler getAlquiler(String tipo) {
 
        if (tipo.equals("hour")) {
               return new AlquilerHour();
        }
        else{
            if(tipo.equals("day"))
            {
                return new AlquilerDay();
            }
           else {
                return new AlquilerWeek();
           }
        }
 
    }
}
