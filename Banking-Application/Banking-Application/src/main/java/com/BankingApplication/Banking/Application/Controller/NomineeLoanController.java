package com.BankingApplication.Banking.Application.Controller;

import com.BankingApplication.Banking.Application.Services.NomineeLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NomineeLoan")
public class NomineeLoanController {
    @Autowired
    private NomineeLoanService nomineeLoanService;
}
