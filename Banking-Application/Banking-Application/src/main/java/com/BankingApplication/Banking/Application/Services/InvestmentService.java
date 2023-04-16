package com.BankingApplication.Banking.Application.Services;

import com.BankingApplication.Banking.Application.Repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {
    @Autowired
    private InvestmentRepository investmentRepository;
}
