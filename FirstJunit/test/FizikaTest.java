/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class FizikaTest {
    
    public FizikaTest() {
    }

    /**
     * Test of convertCtoF method, of class Fizika.
     */
    @Test
    public void testConvertCtoF() {
    }

    /**
     * Test of convertCtoK method, of class Fizika.
     */
    @Test
    public void testConvertCtoK() {
        System.out.println("fizika");
        Fizika presm = new Fizika();
		double expected= 4;
		double got =presm.ConvertCtoK;
	
		assertEquals(expected,got);
    }
    
}
