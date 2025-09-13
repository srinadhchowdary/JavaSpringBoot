package com.telusko.SpringEcom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.util.List;

@Entity(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    @Column(unique = true)
    private String orderId;
    private String customerName;

    private String email;

    private String status;

    private LocalDate orderDate;

    @OneToMany(mappedBy = "order" , cascade=CascadeType.ALL)
    private List<OrderItem> orderItems;

}