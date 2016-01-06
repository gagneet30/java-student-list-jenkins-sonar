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
public class Class {
    int MaLop;
    String TenLop;

    public int getPrID() {
        return MaLop;
    }

    public void setPrID(int prID) {
        this.MaLop = prID;
    }
    public String getprName() {
        return TenLop;
    }

    public void setprName(String prName) {
        this.TenLop = prName;
    }

}
