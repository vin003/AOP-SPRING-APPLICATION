package com.durgasoft.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionServiceImpl implements TransactionService {

	/*DriverManagerDataSource*/
	
	
	private JdbcTemplate jdbcTemplate ;
	private DataSourceTransactionManager  transactionDataSourceManager ; 
	
	
	public void setTransactionDataSourceManager(DataSourceTransactionManager transactionDataSourceManager) {
		this.transactionDataSourceManager = transactionDataSourceManager;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public String transaction(String frmAccount, String toAccount, int amount) {
	String status = "";
	TransactionStatus tx_status= null ; 
	try {
		TransactionDefinition txDef = new DefaultTransactionDefinition() ; 
		tx_status = transactionDataSourceManager.getTransaction(txDef) ; 
	int debitRowCount = 	debit( frmAccount ,  amount ) ;
	int creditRowCount  = 	credit(toAccount, amount) ;
	
	if( debitRowCount ==1 && creditRowCount==1 )
	{
		status = "Transaction Sucess" ; 
		transactionDataSourceManager.commit(tx_status);
	}
		
		
		
	} catch (Exception e) {
		
		transactionDataSourceManager.rollback(tx_status);
		status= "Transaction Failure";
		e.printStackTrace();
	}
	
	
		return status;
	}
		public int debit(String frmAccount , int amount)
		{
			int debitCount = jdbcTemplate.update("update account set ACCBALANCE = ACCBALANCE - "+amount+" where ACCNO = '"+frmAccount+"'");
			System.out.println(amount + "from Acocunt "+frmAccount + "has been debited");
			return debitCount ;
		}
		
		public int credit(String toAccount , int amount)	
		{
			int creditCount = jdbcTemplate.update("update account set ACCBALANCE = ACCBALANCE + "+amount+" where ACCNO= '"+toAccount+"'");
			System.out.println(amount + "to Account "+toAccount + "has been credited");
			return creditCount ;
		}
}
