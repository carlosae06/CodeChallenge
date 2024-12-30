package com.mc4.challenge.infraestructure.web.controllers.dto.response;

import com.mc4.commons.base.infrastructure.web.dto.response.ResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: Trainig : com.mc4.trainig.infraestructure.web.controllers.dto.response : CategoryResponse
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
public class PriceResponseDto extends ResponseDTO<Short> {
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private BigDecimal price;
    private Integer priority;
    private String curr;
    private Short brandId;
    private Short productId;
}
