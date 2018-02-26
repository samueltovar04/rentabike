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
public class AlquilerDay extends Alquiler{

    @Override
    public double getImporteType() {
        return getTime()*20; //To change body of generated methods, choose Tools | Templates.
    }
    
}
