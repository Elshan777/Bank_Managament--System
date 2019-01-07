/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

import com.toedter.calendar.JDateChooser;



/**
 *
 * @author HP
 */
public class User {
    protected String name;
    protected String surname;
    protected String email;
    protected int id;
    protected String password;
    protected double balance=0.0;
    protected String address;
    protected JDateChooser dot;

    public User(String name, String surname, String email, int id, String password) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        setPassword(password);
    }
    public User(String name, String surname, String email, int id, String password,String address) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        this.address = address;
        setPassword(password);
    }
     public User(String name, String surname, String email, int id, String password,String address,JDateChooser dot) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        this.address = address;
        this.dot = dot;
        setPassword(password);
    }

    public User() {
        
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        
        return password;
    }

    public void setPassword(String password) {
        
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", id=" + id + ", password=" + password + ", balance=" + balance + ", address=" + address + '}';
    }
    

   
 
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }

    
    
    
}
