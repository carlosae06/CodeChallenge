package com.mc4.challenge.domain.services.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: Trainig : com.mc4.trainig.domain.services.model : CagegoryModel
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
public class PriceModel {
    private Short id;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private BigDecimal price;
    private Integer priority;
    private String curr;
    private Short brandId;
    private Short productId;
}
