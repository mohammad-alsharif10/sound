package com.tdd.sound.repository;

import com.tdd.sound.entity.InvoiceLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceLineRepository extends JpaRepository<InvoiceLine, Integer> {
}
