package com.BankingApplication.Banking.Application.Services;

import com.BankingApplication.Banking.Application.Model.Account;
import com.BankingApplication.Banking.Application.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Account> allAccounts(){
        return accountRepository.findAll();
    }

    public Optional<Account> singleAccount(long AccountNo){
        return accountRepository.findAccountByAccountNo(AccountNo);
    }

    public boolean updateAmount(long AccountNo,double newbalance){
        mongoTemplate.update(Account.class)
                .matching(Criteria.where("accountNo").is(AccountNo))
                .apply(new Update().set("accountBalance",newbalance))
                .first();
    return true;
    }

    public Optional<Account> singleAccountUsingCustomerId(long CustomerId){
        return accountRepository.findAccountByCustomerId(CustomerId);
    }


}
