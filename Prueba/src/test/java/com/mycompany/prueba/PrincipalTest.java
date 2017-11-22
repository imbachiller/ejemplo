/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PrincipalTest {
private Persona persona;
private static Persona PersonaNull;
    public PrincipalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        PersonaNull= new Persona();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        persona=new Persona ("ivan");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    /**
     * Test of main method, of class Principal.
     */

    @Test
    public void testPruebaPersona() {
        System.out.println("testPruebaPersona");

        assertTrue(persona.getNombre().length()<5);
        //String[] args = null;
        //Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   // @Test(expected = NullPointerException.class)
   // public void testPruebaPersonaNull() {
    //    System.out.println("testPruebaPersonaNull");

        //String h=PersonaNull.getNombre();
        //String[] args = null;
        //Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}


}
