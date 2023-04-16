package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Model.*;
import com.BankingApplication.Banking.Application.Services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/bank")
public class BankController{
    @Autowired
    private BeneficiaryService beneficiaryService;

    @Autowired
    private LoanService loanService;


    @PostMapping("/getAllPendingBeneficiaries")
    public ResponseEntity<List<Beneficiary>> LoginCustomer(){
        List<Beneficiary> ans = beneficiaryService.findAllPending();
        System.out.println("Reached Controller");
        return new ResponseEntity<>(ans,HttpStatus.CREATED);
    }

    @PostMapping("/updateBeneficiary")
    public ResponseEntity<Boolean> AcceptBeneficiary(@RequestParam("accountNo") Long accountNo,
                                                     @RequestParam("status") String status){
        boolean ans = beneficiaryService.UpdateBeneficiary(accountNo,status);
        System.out.println("Reached Controller");
        return new ResponseEntity<>(ans,HttpStatus.CREATED);
    }
    @PostMapping("/UpdateLoanStatus")
    public ResponseEntity<Boolean> updateLoanStatus(
            @RequestParam("LoanId") Long loanId,
            @RequestParam("Status") String status
    ){
        return new ResponseEntity<>(loanService.UpdateLoanStatus(loanId,status),HttpStatus.CREATED);
    }


}