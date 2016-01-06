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
import Entity.Deparment;

/**
 *
 * @author huynh
 */
public class DeparmentTest {
    
    public DeparmentTest() {
    }
    Deparment de;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        de = new Deparment();
    }
    
    @After
    public void tearDown() {
        de = null;
    }
    @Test
    public void testConstructor() {
        assertNotNull(de);
    }
    @Test
    public void testgetDepID(){
        int MaKhoa = 11;
        de.setDepID(11);
        assertEquals(MaKhoa,de.getDepID());
    }
    @Test
    public void testsetDepID(){
        int MaKhoa = 11;
        de.setDepID(11);
        assertEquals(MaKhoa,de.getDepID());
    }
    @Test
    public void testgetDepID1(){
        int MaKhoa = 12;
        de.setDepID(12);
        assertEquals(MaKhoa,de.getDepID());
    }
    @Test
    public void testsetDepID1(){
        int MaKhoa = 12;
        de.setDepID(12);
        assertEquals(MaKhoa,de.getDepID());
    }
    @Test
    public void testgetDepID2(){
        int MaKhoa = 13;
        de.setDepID(13);
        assertEquals(MaKhoa,de.getDepID());
    }
    @Test
    public void testsetDepID2(){
        int MaKhoa = 13;
        de.setDepID(13);
        assertEquals(MaKhoa,de.getDepID());
    }
    
    @Test
    public void testgetDepName1(){
        String TenKhoa="Kỹ Thuật Phần Mềm";
        de.setDepName("Kỹ Thuật Phần Mềm");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testsetDepName1(){
        String TenKhoa = "Kỹ Thuật Phần Mềm";
        de.setDepName("Kỹ Thuật Phần Mềm");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testgetDepName2(){
        String TenKhoa="Khoa Học Máy Tính";
        de.setDepName("Khoa Học Máy Tính");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testsetDepName2(){
        String TenKhoa="Khoa Học Máy Tính";
        de.setDepName("Khoa Học Máy Tính");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testgetDepName3(){
        String TenKhoa="Hệ Thống Thông Tin";
        de.setDepName("Hệ Thống Thông Tin");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testsetDepName3(){
        String TenKhoa="Hệ Thống Thông Tin";
        de.setDepName("Hệ Thống Thông Tin");
        assertEquals(TenKhoa,de.getDepName());
    }
    
    
    @Test
    public void testfailgetDepName1(){
        String TenKhoa="Hệ Thống Thông tin";
        de.setDepName("Hệ Thống Thông Tin");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testfailsetDepName1(){
        String TenKhoa="Hệ Thống Thông tin";
        de.setDepName("Hệ Thống Thông Tin");
        assertEquals(TenKhoa,de.getDepName());
    }
    
    @Test
    public void testfailgetDepName2(){
        String TenKhoa="Kỹ Thuật hần Mềm";
        de.setDepName("Kỹ Thuật Phần Mềm");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testfailsetDepName2(){
        String TenKhoa = "Kỹ Thuật hần Mềm";
        de.setDepName("Kỹ Thuật Phần Mềm");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testfailgetDepName3(){
        String TenKhoa="Khoa ọc Máy Tính";
        de.setDepName("Khoa Học Máy Tính");
        assertEquals(TenKhoa,de.getDepName());
    }
    @Test
    public void testfailsetDepName3(){
        String TenKhoa="Koa Học Máy Tính";
        de.setDepName("Khoa Học Máy Tính");
        assertEquals(TenKhoa,de.getDepName());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
