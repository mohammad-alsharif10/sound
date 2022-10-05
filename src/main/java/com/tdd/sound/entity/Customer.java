package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerId")
    private Integer customerId;
    @Basic
    @Column(name = "FirstName")
    private String firstName;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "Company")
    private String company;
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
    @Basic
    @Column(name = "SupportRepId")
    private Integer supportRepId;
    @ManyToOne
    @JoinColumn(name = "SupportRepId", referencedColumnName = "EmployeeId")
    private Employee employeeBySupportRepId;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<Invoice> invoicesByCustomerId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public Integer getSupportRepId() {
        return supportRepId;
    }

    public void setSupportRepId(Integer supportRepId) {
        this.supportRepId = supportRepId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(company, customer.company) && Objects.equals(address, customer.address) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state) && Objects.equals(country, customer.country) && Objects.equals(postalCode, customer.postalCode) && Objects.equals(phone, customer.phone) && Objects.equals(fax, customer.fax) && Objects.equals(email, customer.email) && Objects.equals(supportRepId, customer.supportRepId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, company, address, city, state, country, postalCode, phone, fax, email, supportRepId);
    }

    public Employee getEmployeeBySupportRepId() {
        return employeeBySupportRepId;
    }

    public void setEmployeeBySupportRepId(Employee employeeBySupportRepId) {
        this.employeeBySupportRepId = employeeBySupportRepId;
    }

    public Collection<Invoice> getInvoicesByCustomerId() {
        return invoicesByCustomerId;
    }

    public void setInvoicesByCustomerId(Collection<Invoice> invoicesByCustomerId) {
        this.invoicesByCustomerId = invoicesByCustomerId;
    }
}
