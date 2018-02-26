/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.dao;

import com.samuel.alquiler.bici.model.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stovar
 */
public class PersonaDaoImpl implements PersonaDao {
  List<Persona> employeeList;
  public PersonaDaoImpl() {
    employeeList = new ArrayList<Persona>();
    Persona emp1 = new Persona("Luis", 0);
    Persona emp2 = new Persona("Ana", 1);
    employeeList.add(emp1);
    employeeList.add(emp2);
  }

  @Override
  public void delete(Persona cliente) {
    employeeList.remove(cliente.getDni());
    System.out.println("Persona: No " + cliente.getDni()
        + ", deleted from database");
  }

  @Override
  public List<Persona> getAll() {
    return employeeList;
  }

  @Override
  public Persona get(int rollNo) {
    return employeeList.get(rollNo);
  }

  public void updateCliente(Persona emp) {
    employeeList.get(emp.getDni()).setName(emp.getName());
    System.out.println("Persona:No " + emp.getDni()
        + ", updated in the database");
  }

}


