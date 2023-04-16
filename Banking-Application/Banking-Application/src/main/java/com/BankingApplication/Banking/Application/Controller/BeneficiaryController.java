package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Beneficiary")
public class BeneficiaryController {
    @Autowired
    private BeneficiaryService beneficiaryService;
}
