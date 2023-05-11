package com.product.newtest.javaalex.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRICES")
public class Price {
    
    @Id
    @Column(name = "PRICE_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "BRAND_ID", nullable = false)
    private Brand brand;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "PRICE_LIST")
    private Long priceList;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "CURR")
    private String curr;

}
