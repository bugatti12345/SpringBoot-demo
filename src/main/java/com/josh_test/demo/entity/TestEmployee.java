package com.josh_test.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class TestEmployee {

    private @Id @GeneratedValue Long id;
    private String firstname;
    private String lastname;
    private String role;

    public TestEmployee() {}

    public TestEmployee(String firstname, String lastname, String role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Long getId(){
        return this.id;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getRole(){
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstname = parts[0];
        this.lastname = parts[1];
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof TestEmployee))
            return false;
        TestEmployee employee = (TestEmployee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstname, employee.firstname)
                && Objects.equals(this.lastname, employee.lastname) && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstname, this.lastname, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id='" + this.id + "', lastname='" + this.lastname + ", firstname='" + this.firstname + "', role='" + this.role + "'}";
    }
}
