/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.alquiler.bici.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stovar
 */
public class AlquilerImplTest {
    
    public AlquilerImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RentaBici method, of class AlquilerImpl.
     */
    @Test
    public void testRentaBici() {
        System.out.println("RentaBici");
        int id = 1;
        int p = 0;
        int b = 3;
        String tipo = "day";
        int cantidad = 2;
        double descuento = 30.0;
        Alquiler expResult = null;
        Alquiler result = AlquilerImpl.RentaBici(id, p, b, tipo, cantidad, descuento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
