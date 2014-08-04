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
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Sort method, of class BubbleSort.
     */
    @Test
    public void testSort() {
        System.out.println("Sort");
        
        int[] data = null;
        int n = 0;
        BubbleSort instance = new BubbleSort();
        int[] expResult = null;
        int[] result = instance.Sort(data, n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class BubbleSort.
     */
    @Test
    public void testSwap() {
        int[] lista = new int[2001]; 
        ArchivoDeTexto instance = new ArchivoDeTexto();
        lista = instance.lectura();
        
        System.out.println("swap");
        int[] data = lista;
        int i = 0;
        int j = 0;
        BubbleSort.swap(data, i, j);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}