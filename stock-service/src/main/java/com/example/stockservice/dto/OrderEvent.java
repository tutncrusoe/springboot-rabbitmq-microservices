package com.example.stockservice.dto;

import com.example.stockservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String status; // pending, progress, completed
    private String message;
    private Order order;
}
