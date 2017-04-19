package com.deloitte.ho.application.controller;

import com.deloitte.ho.application.model.Circumstance;
import com.deloitte.ho.application.service.CircumstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akothiyal on 19/04/2017.
 */
@RestController
public class CircumstanceController {

    @Autowired
    CircumstanceService circumstanceService;

    @RequestMapping(path = "/circumstance", method =  RequestMethod.GET)
    public Circumstance getFees(){
        return circumstanceService.getCircumstance();
    }

}
