package com.testdemo.demo.employee;

public class Employee {

    private Long id;

    private String fName;
    private String lName;

    private String email;


    public Employee(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
