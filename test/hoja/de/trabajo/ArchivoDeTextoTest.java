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
public class ArchivoDeTextoTest {
    
    public ArchivoDeTextoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of escritura method, of class ArchivoDeTexto.
     */
    @Test
    public void testEscritura() {
        System.out.println("escritura");
        ArchivoDeTexto instance = new ArchivoDeTexto();
        instance.escritura();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }   

    /**
     * Test of lectura method, of class ArchivoDeTexto.
     */
    @Test
    public void testLectura() {
        System.out.println("lectura");
        int[] lista = new int[2001]; 
        ArchivoDeTexto instance = new ArchivoDeTexto();
        lista = instance.lectura();
        
        
        int[] expResult = lista;
        int[] result = instance.lectura();
        assertArrayEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
