package com.durgasoft.service;

import com.durgasoft.beans.Account;
import com.durgasoft.beans.Cheque;

public interface TransactionService {

	public void debit(Account acc , Cheque cheque) ; 
}
