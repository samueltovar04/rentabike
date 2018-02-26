/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.dao;

import com.samuel.alquiler.bici.model.Bicicleta;
import com.samuel.alquiler.bici.model.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stovar
 */

interface BicicletaDao {
  public List<Bicicleta> getAll();

  public Bicicleta get(int id);

  public void updateBicicleta(Bicicleta bike);

  public void delete(Bicicleta bike);
}