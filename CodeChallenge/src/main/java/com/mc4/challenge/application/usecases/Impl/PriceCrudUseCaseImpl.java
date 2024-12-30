package com.mc4.challenge.application.usecases.Impl;

import com.mc4.commons.base.application.usecases.impl.CrudUseCaseImpl;
import com.mc4.challenge.application.usecases.PriceCrudUseCase;
import com.mc4.challenge.domain.services.PriceService;
import com.mc4.challenge.domain.services.model.PriceModel;
import org.springframework.stereotype.Component;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: CodeChallenge : com.mc4.challenge.application.usecases.Impl : PriceCrudUseCaseImpl
 * Descripción : (Poner la descripción)
 * Author Prog.: Carlos Augusto Alegre E.
 * -------------------------------------------------------------------------*
 *
 * @Copyright : MC4 S.R.L.
 * @Autor : Carlos Augusto Alegre E.
 * @Date : 18/12/2024
 * -------------------------------------------------------------------------*
 */
@Component
public class PriceCrudUseCaseImpl extends CrudUseCaseImpl<Short, PriceModel> implements PriceCrudUseCase {
    public PriceCrudUseCaseImpl(PriceService baseService) {
        super(baseService);
    }
}
