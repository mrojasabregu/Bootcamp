package com.intercorp.pinapper.service.impl;

import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.model.Pinapper;
import com.intercorp.pinapper.domain.mappers.PinapperMapper;
import com.intercorp.pinapper.service.IPinapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinapperService implements IPinapperService {

    @Autowired
    private PinapperMapper pinapperMapper;

    @Qualifier("pinappers")
    @Autowired
    private List<Pinapper> pinappers;

    @Override
    public Pinapper getPinapper(){
        return Pinapper.builder().id(1L).name("Rodolfo").lastName("Aguirre").build();
    }

    @Override
    public List<Pinapper> getPinappers(){
        return pinappers;
    }

    @Override
    public Pinapper createPinapper(PinapperRequest request){
        return pinapperMapper.apply(request);
    }


}