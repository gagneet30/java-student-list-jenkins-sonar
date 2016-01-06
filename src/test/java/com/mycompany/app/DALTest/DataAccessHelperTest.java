package DALTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.beans.Statement;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import DAL.DataAccessHelper;
import java.sql.DriverManager;
import java.sql.SQLException;
import DAL.DataAccessHelper;

/**
 *
 * @author huynh
 */
public class DataAccessHelperTest {
    Connection con;
    Statement stmt;
    DataAccessHelper da; 
    
    @BeforeClass
    public void beforeClass() throws SQLException{
        con = null;
        stmt=null;
    }
    
    @AfterClass
    public void releaseResource() {
        if (con != null) {
            da.getClose();
        }
    }
    public static void tearDownClass() {
        System.out.println("clean up.");
    }
    
    @Before
    public void setUp() throws Exception{
        da = new DataAccessHelper();
    }
    
    @After
    public void tearDown() throws Exception {
        da = null;
    }
    @Test
    public void testConstructor() {
        assertNotNull(da);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
