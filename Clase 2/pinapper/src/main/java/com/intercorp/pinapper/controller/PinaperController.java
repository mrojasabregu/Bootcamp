package com.intercorp.pinapper.controller;


import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.model.Pinapper;
import com.intercorp.pinapper.service.IPinapperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/pinapp")
public class PinaperController {

    @Autowired
    private IPinapperService pinapperService;

    @GetMapping(path = "/{id}")
    public Pinapper retrivePinnaper(@PathVariable Long id) {
        log.info("id {}", id);
        return this.pinapperService.getPinapper();
    }


    @GetMapping(path = "/pinappers/")
    public List<Pinapper> retrivePinnapers() {
        return pinapperService.getPinappers();
    }

    @PostMapping(path = "/pinapper")
    public Pinapper createPinnaper(@Validated @RequestBody PinapperRequest request) {
        return pinapperService.createPinapper(request);
    }


}
