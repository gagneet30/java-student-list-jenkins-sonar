package EntityTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entity.Class;

/**
 *
 * @author huynh
 */
public class ClassTest {
    
    public ClassTest() {
    }
    Class cla;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        cla = new Class();
    }
    
    @After
    public void tearDown() {
        cla=null;
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(cla);
    }
    @Test
    public void testgetPrID(){
        int MaLop = 1;
        cla.setPrID(1);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testsetPrID(){
        int MaLop = 111;
        cla.setPrID(111);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testgetprName(){
        String TenLop="10A1";
        cla.setprName("10A1");
        assertEquals(TenLop,cla.getprName());
        
    }
    @Test
    public void testsetprName(){
        String TenLop="10A1";
        cla.setprName("10A1");
        assertEquals(TenLop,cla.getprName());
    }
    @Test
    public void testgetPrID1(){
        int MaLop = 222;
        cla.setPrID(222);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testsetPrID1(){
        int MaLop = 222;
        cla.setPrID(222);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testgetprName1(){
        String TenLop="10A2";
        cla.setprName("10A2");
        assertEquals(TenLop,cla.getprName());
        
    }
    @Test
    public void testsetprName1(){
        String TenLop="10A2";
        cla.setprName("10A2");
        assertEquals(TenLop,cla.getprName());
    }
    @Test
    public void testgetPrID3(){
        int MaLop = 333;
        cla.setPrID(333);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testsetPrID3(){
        int MaLop = 333;
        cla.setPrID(333);
        assertEquals(MaLop,cla.getPrID());
    }
    @Test
    public void testgetprName3(){
        String TenLop="10A3";
        cla.setprName("10A3");
        assertEquals(TenLop,cla.getprName());
        
    }
    @Test
    public void testsetprName3(){
        String TenLop="10A3";
        cla.setprName("10A3");
        assertEquals(TenLop,cla.getprName());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
