/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Admin
 */
public class ContactPerson {

    private int id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String phone;
    private String email;

    public ContactPerson(int id, String first_name, String middle_name,String last_name, String phone, String email) {
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }

    public ContactPerson() {
        this.id = 0;
        this.first_name = "";
        this.middle_name = "";
        this.last_name = "";
        this.phone = "";
        this.email = "";
    }
/////////////////////////////////////// SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   

/////////////////////////////////////// GETTERS

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    

}
