package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Investment")
public class InvestmentController {
    @Autowired
    private InvestmentService investmentService;
}
