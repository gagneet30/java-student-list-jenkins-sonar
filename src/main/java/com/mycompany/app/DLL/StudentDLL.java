/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.StudentDAL;
import Entity.Student;
import java.util.ArrayList;


/**
 *
 * @author vinh
 */
public class StudentDLL {
    StudentDAL dal = new StudentDAL();
    public boolean  getLogin(String u,String p){
       return  dal.getLogin(u, p);
    }
    public ArrayList<Student> getALL(){
        return dal.getALL();
    }
    public boolean AddData(Student emp){
        return dal.AddData(emp);
    }
   
   public boolean  delete(String u){
       return dal.DeleteData(u);
    }
   public boolean  update(Student emp)
   {
       return dal.Update(emp);
   }
}
