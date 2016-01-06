/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.ClassDAL;
import Entity.Class;
import java.util.ArrayList;

/**
 *
 * @author vinh
 */
public class ClassDLL {
    ClassDAL dal = new ClassDAL();
    public ArrayList<Class> getByID(int id){
        return  dal.getByID(id);
    }
 
    public ArrayList<Class> getAll(){
        return dal.getAll();
    }
}
