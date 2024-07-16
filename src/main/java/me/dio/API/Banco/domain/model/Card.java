package me.dio.API.Banco.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "cards")
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long card_id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",precision = 13, scale = 2)
    private BigDecimal limit;
}
