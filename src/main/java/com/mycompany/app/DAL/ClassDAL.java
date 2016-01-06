/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import Entity.Class;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vinh
 */
public class ClassDAL extends  DataAccessHelper{
    private final String GET_BY_ID = "select * from LOP where MaLop =?";
    private final String GET_ALL = "select * from LOP";
    
    public ArrayList<Class> getByID(int id){
        ArrayList<Class> objs = new ArrayList<>();
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs!= null && rs.next()){
                Class item = new Class();
                item.setPrID(rs.getInt("MaLop"));
                item.setprName(rs.getString("TenLop"));
                objs.add(item);
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Class> getAll(){
        ArrayList<Class> objs = new ArrayList<>();
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null){
                while (rs.next()) {                    
                    Class item = new Class();
                    item.setPrID(rs.getInt("MaLop"));
                    item.setprName(rs.getString("TenLop"));
                    objs.add(item);
                }
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }
   
}
