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
public class InsertionSortTest {
    
    public InsertionSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Sort method, of class InsertionSort.
     */
    @Test
    public void testSort() {
        System.out.println("Sort");
        int[] data = null;
        int n = 0;
        InsertionSort instance = new InsertionSort();
        int[] expResult = null;
        int[] result = instance.Sort(data, n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}