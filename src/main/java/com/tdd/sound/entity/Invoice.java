package com.tdd.sound.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InvoiceId")
    private Integer invoiceId;
    @Basic
    @Column(name = "CustomerId")
    private Integer customerId;
    @Basic
    @Column(name = "InvoiceDate")
    private Timestamp invoiceDate;
    @Basic
    @Column(name = "BillingAddress")
    private String billingAddress;
    @Basic
    @Column(name = "BillingCity")
    private String billingCity;
    @Basic
    @Column(name = "BillingState")
    private String billingState;
    @Basic
    @Column(name = "BillingCountry")
    private String billingCountry;
    @Basic
    @Column(name = "BillingPostalCode")
    private String billingPostalCode;
    @Basic
    @Column(name = "Total")
    private BigDecimal total;
    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId", nullable = false)
    private Customer customerByCustomerId;
    @OneToMany(mappedBy = "invoiceByInvoiceId")
    private Collection<InvoiceLine> invoiceLinesByInvoiceId;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(invoiceId, invoice.invoiceId) && Objects.equals(customerId, invoice.customerId) && Objects.equals(invoiceDate, invoice.invoiceDate) && Objects.equals(billingAddress, invoice.billingAddress) && Objects.equals(billingCity, invoice.billingCity) && Objects.equals(billingState, invoice.billingState) && Objects.equals(billingCountry, invoice.billingCountry) && Objects.equals(billingPostalCode, invoice.billingPostalCode) && Objects.equals(total, invoice.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, customerId, invoiceDate, billingAddress, billingCity, billingState, billingCountry, billingPostalCode, total);
    }

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public Collection<InvoiceLine> getInvoiceLinesByInvoiceId() {
        return invoiceLinesByInvoiceId;
    }

    public void setInvoiceLinesByInvoiceId(Collection<InvoiceLine> invoiceLinesByInvoiceId) {
        this.invoiceLinesByInvoiceId = invoiceLinesByInvoiceId;
    }
}
