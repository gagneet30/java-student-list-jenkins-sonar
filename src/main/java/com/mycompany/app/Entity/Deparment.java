/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author vinh
 */
public class Deparment {
    int MaKhoa;
    String TenKhoa;

    public int getDepID() {
        return MaKhoa;
    }

    public void setDepID(int depID) {
        this.MaKhoa = depID;
    }

    public String getDepName() {
        return TenKhoa;
    }

    public void setDepName(String DepName) {
        this.TenKhoa = DepName;
    }
    
}
