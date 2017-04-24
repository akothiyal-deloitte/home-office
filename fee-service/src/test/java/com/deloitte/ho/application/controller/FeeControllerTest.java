package com.deloitte.ho.application.controller;

import com.deloitte.ho.application.model.Fee;
import com.deloitte.ho.application.service.FeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.given;

import javax.validation.constraints.AssertTrue;

/**
 * Created by shivxsingh on 20/04/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FeeControllerTest {


    @MockBean
    private FeeService feeService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void feeShouldReturnObjectFromService() throws Exception {
        Fee mockFee = new Fee(12.00 , "ZAR");
        given(this.feeService.getFees()).willReturn(mockFee);
        Fee returnedFee = this.testRestTemplate.getForObject("/fees", Fee.class);
        assertThat(returnedFee).isEqualToComparingFieldByField(mockFee);
    }
}

