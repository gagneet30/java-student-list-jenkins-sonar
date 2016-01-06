/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import GUI.Login;

/**
 *
 * @author huynh
 */
public class LoginTest {
    Login lo;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        lo = new Login();
    }
    
    @After
    public void tearDown() {
        lo=null;
    }
    @Test
    public void testConstructor() {
        assertNotNull(lo);
    }
    @Test
    public void testjButton2ActionPerformed(){
        String u = txtUser.getText();
        String p = new String(txtpass.getPassword());
        String u1=txtUser.getText();
        String p1 = new String(txtpass.getPassword());
        assertEquals(u,u1);
        assertEquals(p,p1);
    }
    
    @Test
    public void jButton1ActionPerformed(){
        String u = txtUser.getText();
        String p = new String(txtpass.getPassword());
        String u1="admin";
        String p1 = "admin";
        assertTrue(u.equals(u1));
        assertTrue(p.equals(p1));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel txtmess;
    private javax.swing.JPasswordField txtpass;
}
