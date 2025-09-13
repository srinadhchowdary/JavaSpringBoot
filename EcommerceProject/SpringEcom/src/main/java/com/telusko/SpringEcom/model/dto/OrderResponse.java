package com.telusko.SpringEcom.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(


        String orderId,
        String customername,
        String email,
        String status,
        LocalDate orderDate,
        List<OrderItemResponse> items

) {}
