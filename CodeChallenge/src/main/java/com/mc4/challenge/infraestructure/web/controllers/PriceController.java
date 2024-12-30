package com.mc4.challenge.infraestructure.web.controllers;

import com.mc4.commons.base.infrastructure.web.controllers.BaseController;
import com.mc4.challenge.application.usecases.PriceCrudUseCase;
import com.mc4.challenge.domain.services.model.PriceModel;
import com.mc4.challenge.infraestructure.web.controllers.dto.request.PriceRequestDto;
import com.mc4.challenge.infraestructure.web.controllers.dto.response.PriceResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestController;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: CodeChallenge : com.mc4.challenge.infraestructure.web.controllers : PriceController
 * Descripción : (Poner la descripción)
 * Author Prog.: Carlos Augusto Alegre E.
 * -------------------------------------------------------------------------*
 *
 * @Copyright : MC4 S.R.L.
 * @Autor : Carlos Augusto Alegre E.
 * @Date : 18/12/2024
 * -------------------------------------------------------------------------*
 */
@RestController("api/v1/prices")
public class PriceController extends BaseController<Short, PriceModel, PriceRequestDto, PriceResponseDto> {
    public PriceController(PriceCrudUseCase priceCrudUseCase, ModelMapper modelMapper, MessageSource messageSource) {
        super(priceCrudUseCase, modelMapper, messageSource);
    }
}
