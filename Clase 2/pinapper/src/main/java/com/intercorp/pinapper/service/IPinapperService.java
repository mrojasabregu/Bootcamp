package com.intercorp.pinapper.service;

import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.model.Pinapper;

import java.util.List;

public interface IPinapperService {

    Pinapper getPinapper();

    List<Pinapper> getPinappers();

    Pinapper createPinapper(PinapperRequest request);

}
