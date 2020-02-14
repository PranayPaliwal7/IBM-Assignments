package com.ibm.bank.service;

import java.util.*;
import java.sql.*;
import com.ibm.bank.bean.*;

public interface XYZBankServiceInterface {
	public void insertData(String Name, String Email, int Pin, int amount);

	public void WithdrawMoney(String email4, int pin4, int amount3);


	public void FundTransfer(String email3, int pin3, String emailReciever, int amount2);

	public void ShowBalance(String email2, int pin2);

	public void DepositMoney(String email5, int pin5, int amount4);
}
