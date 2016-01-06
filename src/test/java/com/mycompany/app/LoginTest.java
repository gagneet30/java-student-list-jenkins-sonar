/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DLL.StudentDLL;
import GUI.Login;
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
public class LoginTest {
    Login login;
    StudentDLL dll = new StudentDLL();
    final String u1 ="admin";
    final String p1 ="admin";
    String name, pass;
    
    
    
    
    public LoginTest() {
        if(dll.getLogin(u1, p1)){
            Assert.assertEquals("Dang nhap thanh cong", name);
        }
    }
    
    @BeforeClass
    @AfterClass
    public static void tearDownClass() {
        System.exit(0);
    }
    
    @Before
    public void createLogin(){
        login= new Login();
    }
    
    @After
    public void destroyMenuObject(){
        login = null;
    }
    @Test
    public void getMenuNotNullTest(){
        Assert.assertTrue(login!=null);
    }
    public void testPass(){
        Assert.assertEquals(p1, u1);
        Assert.assertEquals(u1, p1);
    }
    
    public void testFail(){
        Assert.assertEquals(" ", u1);
        Assert.assertEquals(p1, "");
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public void testLogin(){
        System.out.println("login");
        String[] args = null;
        Login.main(args);
        fail("the test cas");
    }
    
}
