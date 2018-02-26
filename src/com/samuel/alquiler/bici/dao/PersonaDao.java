/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.dao;

import com.samuel.alquiler.bici.model.Persona;
import java.util.List;
import java.util.ArrayList;

interface PersonaDao {
  public List<Persona> getAll();

  public Persona get(int id);

  public void updateCliente(Persona cliente);

  public void delete(Persona cliente);
}