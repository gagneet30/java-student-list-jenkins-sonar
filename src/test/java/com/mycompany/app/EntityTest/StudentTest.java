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
import Entity.Student;

/**
 *
 * @author huynh
 */
public class StudentTest {
    Student stu;
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stu = new Student();
    }
    
    @After
    public void tearDown() {
        stu= null;
    }
    @Test
    public void testConstructor() {
        assertNotNull(stu);
    }
    
    //User
    @Test
    public void testgetUsername(){
        String UserName="admin";
        stu.setUsername("admin");
        assertEquals(UserName,stu.getUsername());
    }
    @Test
    public void testsetUsername(){
        String UserName="admin";
        stu.setUsername("admin");
        assertEquals(UserName,stu.getUsername());
    }
    
    //Password
    @Test
    public void testgetPassword(){
        String Pass ="admin";
        stu.setPassword("admin");
        assertEquals(Pass,stu.getPassword());
    }
    @Test
    public void testsetPassword(){
        String Pass ="admin";
        stu.setPassword("admin");
        assertEquals(Pass,stu.getPassword());
    }
    
    //Ho Ten
    @Test
    public void testgetFullName(){
        String HoTen="Huynh The Vinh";
        stu.setFullName("Huynh The Vinh");
        assertEquals(HoTen,stu.getFullName());
    }
    @Test
    public void testsetFullName(){
        String HoTen="Huynh The Vinh";
        stu.setFullName("Huynh The Vinh");
        assertEquals(HoTen,stu.getFullName());
    }
    //Tuoi
    @Test
    public void testgetAge(){
        String HoTen="10/10/1994";
        stu.setAge("10/10/1994");
        assertEquals(HoTen,stu.getAge());
    }
    @Test
    public void testsetAge(){
        String HoTen="10/10/1994";
        stu.setAge("10/10/1994");
        assertEquals(HoTen,stu.getAge());
    }
    //Dia chi
    @Test
    public void getAddress(){
        String HoTen="Dong Thap";
        stu.setAddress("Dong Thap");
        assertEquals(HoTen,stu.getAddress());
    }
    @Test
    public void testsetAddress(){
        String HoTen="Dong Thap";
        stu.setAddress("Dong Thap");
        assertEquals(HoTen,stu.getAddress());
    }
    // SDT
    @Test
    public void testgetPhone(){
        String SDT="01699998665";
        stu.setPhone("01699998665");
        assertEquals(SDT,stu.getPhone());
    }
    @Test
    public void testsetPhone(){
        String SDT="01699998665";
        stu.setPhone("01699998665");
        assertEquals(SDT,stu.getPhone());
    }
    //Ma khoa
    @Test
    public void testgetDepID2(){
        int MaKhoa = 13;
        stu.setDepID(13);
        assertEquals(MaKhoa,stu.getDepID());
    }
    @Test
    public void testsetDepID2(){
        int MaKhoa = 13;
        stu.setDepID(13);
        assertEquals(MaKhoa,stu.getDepID());
    }
    //Ma Lop
    @Test
    public void testgetPrID(){
        int MaLop = 1;
        stu.setPrID(1);
        assertEquals(MaLop,stu.getPrID());
    }
    @Test
    public void testsetPrID(){
        int MaLop = 111;
        stu.setPrID(111);
        assertEquals(MaLop,stu.getPrID());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
