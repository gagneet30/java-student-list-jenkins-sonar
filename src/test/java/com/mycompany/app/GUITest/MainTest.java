package GUITest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DLL.ClassDLL;
import DLL.DeparmentDLL;
import DLL.StudentDLL;
import Entity.Deparment;
import Entity.Student;
import GUI.Main;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huynh
 */
public class MainTest {
    StudentDLL empDll = new StudentDLL();
    ArrayList<Student> listEMP = new ArrayList<>();

    DeparmentDLL depDLL = new DeparmentDLL();
    ArrayList<Deparment> listDep = new ArrayList<>();

    ClassDLL prDLL = new ClassDLL();
    ArrayList<Entity.Class> listPr = new ArrayList<>();
    Main main;
    Student stu;
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        // Create new instance of DAONHO
        main = new Main();
    }
    
    @After
    public void tearDown() {
        main = null;
    }
    @Test
    public void testConstructor() {
        assertNotNull(main);
    }
    
    
    @Test
    public void testSDTFail1(){
        String u="sadadas1121";
        Assert.assertEquals("sadadas1121", stu.getPhone());
        System.out.println("So dien thoai nhap khong dung!");
    }
    @Test
    public void testSDTFail2(){
        String u="adsadasdasda";
        Assert.assertEquals("adsadasdasda", u);
        System.out.println("So dien thoai nhap khong dung!");
    }
    @Test
    public void testSDTFail3(){
        String u="adsadasdasdassssaadsdas";
        Assert.assertEquals("adsadasdasdassssaadsdas", u);
        System.out.println("So dien thoai nhap khong dung");
    }
    @Test
    public void testSDTFail(){
        String u="00005548821151512";
        Assert.assertEquals("00005548821151512", u);
        System.out.println("So dien thoai qua truong du lieu!");
    }
}
