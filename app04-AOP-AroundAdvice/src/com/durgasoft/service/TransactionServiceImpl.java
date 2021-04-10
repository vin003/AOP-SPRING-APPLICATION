package com.durgasoft.service;

import com.durgasoft.beans.Account;
import com.durgasoft.beans.Cheque;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public void debit(Account acc, Cheque cheque) {
		int total_amt = acc.getBalance() ; 
		int debt_amt = cheque.getAmount() ; 
		
		int new_amt = total_amt - debt_amt ; 
		acc.setBalance(new_amt);
		
		System.out.println("******************* TRANSACTION SUCCESS **************************");

	}

}
