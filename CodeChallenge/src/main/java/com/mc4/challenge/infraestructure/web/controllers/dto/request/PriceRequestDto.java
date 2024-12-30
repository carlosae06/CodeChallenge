package com.mc4.challenge.infraestructure.web.controllers.dto.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: CodeChallenge : com.mc4.challenge.infraestructure.web.controllers.dto.request : PriceRequest
 * Descripción : (Poner la descripción)
 * Author Prog.: Carlos Augusto Alegre E.
 * -------------------------------------------------------------------------*
 *
 * @Copyright : MC4 S.R.L.
 * @Autor : Carlos Augusto Alegre E.
 * @Date : 18/12/2024
 * -------------------------------------------------------------------------*
 */
@Data
public class PriceRequestDto {
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private BigDecimal price;
    private Integer priority;
    private String curr;
    private Short brandId;
    private Short productId;
}
