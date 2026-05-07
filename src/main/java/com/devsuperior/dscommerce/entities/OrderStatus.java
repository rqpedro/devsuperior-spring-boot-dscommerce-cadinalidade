package com.devsuperior.dscommerce.entities;

import java.time.Instant;

public enum OrderStatus {

    WAITING_PAYMENT,
    PAID,
    SHIPPED,
    DELIVERED,
    CANCELED;
}
