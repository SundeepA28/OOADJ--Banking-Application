package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Loan")
public class LoanController {
    @Autowired
    private LoanService loanService;

}
