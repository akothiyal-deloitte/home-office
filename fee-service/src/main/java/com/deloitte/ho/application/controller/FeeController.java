package com.deloitte.ho.application.controller;

import com.deloitte.ho.application.model.Fee;
import com.deloitte.ho.application.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akothiyal on 19/04/2017.
 */
@RestController
public class FeeController {

    private FeeService feeService;

    @Autowired
    public FeeController(FeeService feeService) {
        this.feeService = feeService;
    }

    @RequestMapping(path = "/fees", method =  RequestMethod.GET)
    public Fee getFees(){
        return feeService.getFees(1);
    }

}
