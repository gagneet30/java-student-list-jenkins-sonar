/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vinh
 */
public class StudentDAL extends DataAccessHelper {

    private final String GET_LOGIN = "select * from HOCSINH where UserName=? and Pass=?";
    private final String GET_ALL = "select * from HOCSINH";
    private final String ADD_DATA = "insert into "
            + "HOCSINH(UserName,Pass,HoTen,NgaySinh,DiaChi,SDT,MaKhoa,MaLop)"
            + "values (?,?,?,?,?,?,?,?)";
    private final String UPDATE_DATA = "Update "
            + "HOCSINH set Pass =?,HoTen=?,age=?,DiaChi=?,SDT=?,MaKhoa=?,MaLop=? where UserName=?";
    private final String REMOVE_DATA = "Delete from HOCSINH where UserName=?";

    public boolean getLogin(String u, String p) {
        boolean check = false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_LOGIN);
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            if (rs != null && rs.next()) {
                check = true;
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public ArrayList<Student> getALL() {
        ArrayList<Student> objs = new ArrayList<>();
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Student item = new Student();
                    item.setUsername(rs.getString("UserName"));
                    item.setPassword(rs.getString("Pass"));
                    item.setFullName(rs.getString("HoTen"));
                    item.setAge(rs.getString("NgaySinh"));
                    item.setAddress(rs.getString("DiaChi"));
                    item.setPhone(rs.getString("SDT"));
                    item.setPrID(rs.getInt("MaLop"));
                    item.setDepID(rs.getInt("MaKhoa"));
                    objs.add(item);
                }
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }
    
    public boolean AddData(Student emp){
        boolean check = false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(ADD_DATA);
            ps.setString(1, emp.getUsername());
            ps.setString(2, emp.getPassword());
            ps.setString(3, emp.getFullName());
            ps.setString(4, emp.getAge());
            ps.setString(5, emp.getAddress());
            ps.setString(6, emp.getPhone());
            ps.setInt(7, emp.getDepID());
            ps.setInt(8, emp.getPrID());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

   public boolean DeleteData(String u){
       boolean check = false;
       try {
           getConnect();
            PreparedStatement ps = con.prepareStatement(REMOVE_DATA);
            ps.setString(1, u);
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
           getClose();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return check;
   }
   
    public boolean Update(Student emp){
        boolean check = false;
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(UPDATE_DATA);
            ps.setString(1, emp.getPassword());
            ps.setString(2, emp.getFullName());
            ps.setString(3, emp.getAge());
            ps.setString(4, emp.getAddress());
            ps.setString(5, emp.getPhone());
            ps.setInt(6, emp.getDepID());
            ps.setInt(7, emp.getPrID());
            ps.setString(8, emp.getUsername());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
