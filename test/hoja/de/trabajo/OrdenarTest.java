/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Temp
 */
public class OrdenarTest {
    
    public OrdenarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLista method, of class Ordenar.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        Ordenar instance = new Ordenar();
        int[] expResult = null;
        int[] result = instance.getLista();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setLista method, of class Ordenar.
     */
    @Test
    public void testSetLista() {
        System.out.println("setLista");
        int[] data = null;
        Ordenar instance = new Ordenar();
        instance.setLista(data);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ordenar.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ordenar instance = new Ordenar();
        String expResult = "Los valores son null";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
}