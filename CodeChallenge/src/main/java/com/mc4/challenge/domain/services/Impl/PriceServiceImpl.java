package com.mc4.challenge.domain.services.Impl;

import com.mc4.commons.base.domain.service.impl.BaseServiceImpl;
import com.mc4.challenge.domain.services.PriceService;
import com.mc4.challenge.domain.services.model.PriceModel;
import com.mc4.challenge.infraestructure.persistence.entities.Price;
import com.mc4.challenge.infraestructure.persistence.repositories.PriceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * ------------------------------------------------------------------------*
 * Información General
 * ------------------------------------------------------------------------*
 * Código de Aplicación: Trainig : com.mc4.trainig.domain.services.Impl : CategoryServiceImpl
 * Descripción : (Poner la descripción)
 * Author Prog.: Carlos Augusto Alegre E.
 * -------------------------------------------------------------------------*
 *
 * @Copyright : MC4 S.R.L.
 * @Autor : Carlos Augusto Alegre E.
 * @Date : 18/12/2024
 * -------------------------------------------------------------------------*
 */
@Service
public class PriceServiceImpl extends BaseServiceImpl<Price, Short, PriceModel> implements PriceService {
    public PriceServiceImpl(ModelMapper modelMapper, PriceRepository repository) {
        super(modelMapper, repository);
    }
}
