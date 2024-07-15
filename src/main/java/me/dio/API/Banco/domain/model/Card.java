package me.dio.API.Banco.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "cards")
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID card_id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",scale = 13, precision = 2)
    private BigDecimal limit;
}
