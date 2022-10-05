package com.tdd.sound.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "FirstName")
    private String firstName;
    @Basic
    @Column(name = "Title")
    private String title;
    @Basic
    @Column(name = "BirthDate")
    private Timestamp birthDate;
    @Basic
    @Column(name = "HireDate")
    private Timestamp hireDate;
    @Basic
    @Column(name = "Address")
    private String address;
    @Basic
    @Column(name = "City")
    private String city;
    @Basic
    @Column(name = "State")
    private String state;
    @Basic
    @Column(name = "Country")
    private String country;
    @Basic
    @Column(name = "PostalCode")
    private String postalCode;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "Fax")
    private String fax;
    @Basic
    @Column(name = "Email")
    private String email;
    @OneToMany(mappedBy = "employeeBySupportRepId")
    private Collection<Customer> customersByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "ReportsTo", referencedColumnName = "EmployeeId")
    private Employee employeeByReportsTo;
    @OneToMany(mappedBy = "employeeByReportsTo")
    private Collection<Employee> employeesByEmployeeId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Collection<Customer> getCustomersByEmployeeId() {
        return customersByEmployeeId;
    }

    public void setCustomersByEmployeeId(Collection<Customer> customersByEmployeeId) {
        this.customersByEmployeeId = customersByEmployeeId;
    }

    public Employee getEmployeeByReportsTo() {
        return employeeByReportsTo;
    }

    public void setEmployeeByReportsTo(Employee employeeByReportsTo) {
        this.employeeByReportsTo = employeeByReportsTo;
    }

    public Collection<Employee> getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(Collection<Employee> employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
