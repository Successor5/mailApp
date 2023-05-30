package Models;

import java.awt.*;
import java.util.List;

public class User {
    private  String name;
    private  String otherName;
    private String lastName;
    private String userName;
    private int age;
    private String dateOfBirth;
    private int id;
    private String password;
    private List<Mail> inbox;
    private List<Mail> sent;
    private List<Mail> drafts;


    public User(String name, String otherName, String lastName, String userName, int age, String dateOfBirth, int id) {
        this.name = name;
        this.otherName = otherName;
        this.lastName = lastName;
        this.userName = userName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
