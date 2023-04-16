package com.BankingApplication.Banking.Application.Model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customer")
@Data
public class Customer{
    @Id
    private Long customerID;
    private String name;
    private Long phoneNumber;
    private String email;
    private String address;
    private String username;
    private String password;
    //How are we going to relate Customer with Transaction,Loan.
    //We need to have those feilds as well in Customer and refer to them
    //e.g @DocumentReference
    //private List<Loan> LoanIds;

//    public Customer(int CustomerId,String Name,long PhoneNumber,String Email,String Address,String Username,String Password){
//        this.CustomerID=CustomerId;
//        this.Name=Name;
//        this.PhoneNumber=PhoneNumber;
//        this.Email=Email;
//        this.Address=Address;
//        this.Username=Username;
//        this.Password=Password;
//    }

}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Account")
//@Data
//public class Account
//{
//    @Id
//    private long CustomerId;
//    private long AccountNo;
//    private double AccountBalance;
//    private  String AccountType;
//    private long Pin;
//
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Beneficiary")
//@Data
//public class Beneficiary
//{
//    private long AccountNo;
//    private String BeneficiaryName;
//    private String BeneficiaryBank;
//    private String BankIFSC;
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Investment")
//@Data
//public class Investment
//{
//    @Id
//    private long investmentID;
//    private double investmentBalance;
//    private String investmentType;
//    private long customerID;
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Loan")
//@Data
//public class Loan
//{
//    @Id
//    private long LoanID;
//    private String LoanType;
//    private double InterestRate;
//    private long Term;
//    private long AmountRequested;
//    private String Status;
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "NomineeInvestment")
//@Data
//public class NomineeInvestment{
//    private String Name;
//    private long PhoneNumber;
//    private String Email;
//    private String Address;
//    private String Relation;
//    @Id
//    private long investmentID;
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "NomineeLoan")
//@Data
//public class NomineeLoan
//{
//    private String Name;
//    private long PhoneNumber;
//    private String Email;
//    private String Address;
//    private String Relation;
//    @Id
//    private long LoanID;
//}

//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Transaction")
//@Data
//public class Transaction
//{
//    @Id
//    private long TransactionID;
//    private Date Date;
//    private double Amount;
//    private String Description;
//    private long ReceiveeAccountNo;
//    private long SenderAccountNo;
//    private String Status;
//}


