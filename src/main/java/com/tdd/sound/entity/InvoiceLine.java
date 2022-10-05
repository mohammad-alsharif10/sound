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
    @Column(name = "InvoiceId")
    private Integer invoiceId;
    @Basic
    @Column(name = "TrackId")
    private Integer trackId;
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

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceLine that = (InvoiceLine) o;
        return Objects.equals(invoiceLineId, that.invoiceLineId) && Objects.equals(invoiceId, that.invoiceId) && Objects.equals(trackId, that.trackId) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceLineId, invoiceId, trackId, unitPrice, quantity);
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
