package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.NomineeInvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NomineeInvestment")
public class NomineeInvestmentController {
    @Autowired
    private NomineeInvestmentService nomineeInvestmentService;

}
