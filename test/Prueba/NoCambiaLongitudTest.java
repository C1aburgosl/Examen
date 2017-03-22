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
public class NoCambiaLongitudTest {
    
    /**
     *
     */
    public NoCambiaLongitudTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of Visualizar method, of class NoCambiaLongitud.
     */
    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int[] vector = null;
        int i = 0;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.Visualizar(vector, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class NoCambiaLongitud.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        NoCambiaLongitud instance = new NoCambiaLongitud();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class NoCambiaLongitud.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class NoCambiaLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] vector = null;
        CambiaLongitud cambiaLongitud = null;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.modificar(vector, cambiaLongitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
