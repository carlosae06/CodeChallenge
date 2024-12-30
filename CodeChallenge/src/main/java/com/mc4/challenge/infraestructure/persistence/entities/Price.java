package com.mc4.challenge.infraestructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: CodeChallenge : com.mc4.challenge.infraestructure.persistence.entities : Price
 * Descripción : (Poner la descripción)
 * Author Prog.: Carlos Augusto Alegre E.
 * -------------------------------------------------------------------------*
 *
 * @Copyright : MC4 S.R.L.
 * @Autor : Carlos Augusto Alegre E.
 * @Date : 18/12/2024
 * -------------------------------------------------------------------------*
 */
@Entity
@Getter
@Setter
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "PRICE_LIST")
    private Integer priceList;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Column(name = "CURR")
    private String curr;
    @Column(name = "BRAND_ID")
    private Short brandId;
    @Column(name = "PRODUCT_ID")
    private Short productId;

}
