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
public class MatematikaTest {
    //@Autowire
    //Matematika matematika; 
    //Matematika objGK = new Matematika();
    
    public MatematikaTest() {
    }

    /**
     * Test of pPravoagolnik method, of class Matematika.
     */
    @Test
    public void testPPravoagolnik() {
    }

    /**
     * Test of pKruznica method, of class Matematika.
     */
    @Test
    public void testPKruznica() {
    }

    /**
     * Test of pPravoagolnikRet method, of class Matematika.
     */
    @Test
    public void testPPravoagolnikRet() {
        System.out.println("matematika");
        Matematika objGK = new Matematika();
		int expected= 6;
		int got =objGK.pPravoagolnikRet(2, 3);//6
	
		assertEquals(expected,got);
    }
     @Test
    public void testPkvadratRet() {
        System.out.println("matematika");
        Matematika objGK = new Matematika();
		int expected= 4;
		int got =objGK.pKvadratRet(2);//6
	
		assertEquals(expected,got);
    }
}
