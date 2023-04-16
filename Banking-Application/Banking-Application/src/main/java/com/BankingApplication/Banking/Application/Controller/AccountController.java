package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Model.Account;
import com.BankingApplication.Banking.Application.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping

    public ResponseEntity<List<Account>> getAllAccounts(){
        return new ResponseEntity<List<Account>>(accountService.allAccounts(), HttpStatus.OK);
    }

    @GetMapping("/{AccountNo}")
    public ResponseEntity<Optional<Account>> getSingleCustomer(@PathVariable long AccountNo){
        return new ResponseEntity<Optional<Account>>(accountService.singleAccount(AccountNo),HttpStatus.OK);
    }
}
