package com.deloitte.ho.application.service;

import com.deloitte.ho.application.model.Fee;
import org.springframework.stereotype.Service;

/**
 * Created by akothiyal on 19/04/2017.
 */

@Service
public class FeeServiceImpl implements FeeService {

    @Override
    public Fee getFees() {
        return new Fee(12.32, "GBP");
    }

}
