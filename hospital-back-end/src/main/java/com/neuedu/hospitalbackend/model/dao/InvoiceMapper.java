package com.neuedu.hospitalbackend.model.dao;

import org.springframework.stereotype.Component;

@Component
public interface InvoiceMapper {
    String getAvailableInvoiceCode();
}