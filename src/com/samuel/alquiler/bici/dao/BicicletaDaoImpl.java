/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.dao;

import com.samuel.alquiler.bici.model.Bicicleta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stovar
 */
public class BicicletaDaoImpl implements BicicletaDao {
  List<Bicicleta> bikeList;
  public BicicletaDaoImpl() {
    bikeList = new ArrayList<Bicicleta>();
    Bicicleta b1 = new Bicicleta("Mounter", 0);
    Bicicleta b2 = new Bicicleta("Classic", 1);
    Bicicleta b3 = new Bicicleta("A", 2);
    Bicicleta b4 = new Bicicleta("B", 3);
    bikeList.add(b1);
    bikeList.add(b2);
    bikeList.add(b3);
    bikeList.add(b4);
  }

  @Override
  public void delete(Bicicleta bike) {
    bikeList.remove(bike.getId());
    System.out.println("Bicicleta: No " + bike.getId()
        + ", deleted from database");
  }

  @Override
  public List<Bicicleta> getAll() {
    return bikeList;
  }

  @Override
  public Bicicleta get(int rollNo) {
    return bikeList.get(rollNo);
  }

  public void updateBicicleta(Bicicleta b) {
    bikeList.get(b.getId()).setModelo(b.getModelo());
    System.out.println("Persona:No " + b.getId()
        + ", updated in the database");
  }

}

