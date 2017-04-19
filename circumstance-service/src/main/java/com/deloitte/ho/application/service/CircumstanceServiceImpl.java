package com.deloitte.ho.application.service;

import com.deloitte.ho.application.model.Circumstance;
import org.springframework.stereotype.Service;

/**
 * Created by akothiyal on 19/04/2017.
 */

@Service
public class CircumstanceServiceImpl implements CircumstanceService {


    @Override
    public Circumstance getCircumstance() {
        return new Circumstance("10 Years", "AXJPP323233");
    }

}
