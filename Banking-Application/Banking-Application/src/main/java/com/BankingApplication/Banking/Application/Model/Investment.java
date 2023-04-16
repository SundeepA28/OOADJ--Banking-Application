package com.BankingApplication.Banking.Application.Model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Investment")
@Data
public class Investment
{
    @Id
    private Long investmentID;
    private Double investmentBalance;
    private String investmentType;
    private Long customerID;
}
