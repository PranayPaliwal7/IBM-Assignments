package com.ibm.bank.service;
import java.sql.SQLException;
import java.util.*;
import com.ibm.bank.bean.*;
import com.ibm.bank.dao.XYZBankDaoInterface;
import java.sql.*;
import com.ibm.bank.dao.XYZBankDaoClass;

public class XYZBankServiceClass implements XYZBankServiceInterface {
	XYZBankDaoClass dao = new XYZBankDaoClass();
	


		@Override
		public void WithdrawMoney(String email4, int pin4, int amount3) {
			// TODO Auto-generated method stub
			 dao.WithdrawMoney(email4, pin4, amount3);
			
		}

		@Override
		public void FundTransfer(String email3, int pin3, String emailReciever, int amount2) {
			// TODO Auto-generated method stub
			 dao.FundTransfer(email3, pin3, emailReciever, amount2);
			
		}

		@Override
		public void ShowBalance(String email2, int pin2) {
			// TODO Auto-generated method stub
			 dao.ShowBalance(email2, pin2);
			
		}

		@Override
		public void DepositMoney(String email5, int pin5, int amount4) {
			// TODO Auto-generated method stub
			 dao.DepositMoney(email5, pin5, amount4);
			
		}



		@Override
		public void insertData(String Name, String Email, int Pin, int amount) {
			// TODO Auto-generated method stub
			dao.insertData(Name, Email, Pin, amount );
			
		}
	
}
