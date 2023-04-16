package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
}
