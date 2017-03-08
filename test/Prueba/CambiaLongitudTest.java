/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
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
     * Test of borrar method, of class CambiaLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] vector = null;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(vector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class CambiaLongitud.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int[] vector = null;
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(vector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Visualizar method, of class CambiaLongitud.
     */
    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int[] vector = null;
        int i = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.Visualizar(vector, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class CambiaLongitud.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        CambiaLongitud instance = new CambiaLongitud();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class CambiaLongitud.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
