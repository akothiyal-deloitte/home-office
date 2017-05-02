package com.deloitte.ho.application.service;

import com.deloitte.ho.application.model.Fee;
import org.springframework.stereotype.Service;

/**
 * Created by akothiyal on 19/04/2017.
 */

@Service
public class FeeServiceImpl implements FeeService {

    private static final Double STANDARD_FEE = 12.32;

    @Override
    public Fee getFees(int multiplier) {
        Double feeAmount = STANDARD_FEE * multiplier;
        return new Fee(feeAmount, "GBP");
    }

}
