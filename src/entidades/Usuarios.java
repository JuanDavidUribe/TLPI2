/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Usuarios {
    private int DNI;
    private String Name;
    private String NickName;
    private String Password;
    private String CellPhone;
    private String Address;

    public Usuarios() {
    }

    public Usuarios(int DNI, String Name, String NickName, String Password, String CellPhone, String Address) {
        this.DNI = DNI;
        this.Name = Name;
        this.NickName = NickName;
        this.Password = Password;
        this.CellPhone = CellPhone;
        this.Address = Address;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String CellPhone) {
        this.CellPhone = CellPhone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    
}
