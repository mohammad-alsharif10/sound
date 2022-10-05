package com.tdd.sound.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class InvoiceLine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InvoiceLineId")
    private Integer invoiceLineId;
    @Basic
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic
    @Column(name = "Quantity")
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "InvoiceId", referencedColumnName = "InvoiceId", nullable = false)
    private Invoice invoiceByInvoiceId;
    @ManyToOne
    @JoinColumn(name = "TrackId", referencedColumnName = "TrackId", nullable = false)
    private Track trackByTrackId;

    public Integer getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(Integer invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Invoice getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(Invoice invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }

    public Track getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(Track trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }
}
