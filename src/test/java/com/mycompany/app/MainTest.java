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
import java.util.ArrayList;
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
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.exit(0);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    
}
