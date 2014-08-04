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
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Sort method, of class QuickSort.
     */
    @Test
    public void testSort() {
        System.out.println("Sort");
        int[] data = null;
        int n = 0;
        QuickSort instance = new QuickSort();
        int[] expResult = null;
        int[] result = instance.Sort(data, n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class QuickSort.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int[] data = null;
        int i = 0;
        int j = 0;
        QuickSort.swap(data, i, j);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}