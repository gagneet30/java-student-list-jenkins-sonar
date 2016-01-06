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
public class Student {

    String UserName;
    String Pass;
    String HoTen;
    String NgaySinh;
    String DiaChi;
    String SDT;
    int MaKhoa;
    int MaLop;

    public String getUsername() {
        return UserName;
    }

    public void setUsername(String username) {
        this.UserName = username;
    }

    public String getPassword() {
        return Pass;
    }

    public void setPassword(String password) {
        this.Pass = password;
    }

    public String getFullName() {
        return HoTen;
    }

    public void setFullName(String FullName) {
        this.HoTen = FullName;
    }

    public String getAge() {
        return NgaySinh;
    }

    public void setAge(String age) {
        this.NgaySinh = age;
    }

    public String getAddress() {
        return DiaChi;
    }

    public void setAddress(String address) {
        this.DiaChi = address;
    }

    public String getPhone() {
        return SDT;
    }

    public void setPhone(String phone) {
        this.SDT = phone;
    }

    public int getDepID() {
        return MaKhoa;
    }

    public void setDepID(int depID) {
        this.MaKhoa = depID;
    }

    public int getPrID() {
        return MaLop;
    }

    public void setPrID(int prID) {
        this.MaLop = prID;
    }
}
