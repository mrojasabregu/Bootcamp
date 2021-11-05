package com.intercorp.pinapper.domain.mappers;

import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.model.Pinapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PinapperMapper implements Function<PinapperRequest, Pinapper> {

    @Override
    public Pinapper apply(PinapperRequest pinapperRequest) {
        return Pinapper.builder()
                .id(pinapperRequest.getId())
                .name(pinapperRequest.getName())
                .lastName(pinapperRequest.getLastName())
                .build();
    }
}
