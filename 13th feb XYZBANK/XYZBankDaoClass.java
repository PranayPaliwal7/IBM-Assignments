package com.ibm.bank.dao;
import com.ibm.bank.bean.*;
import com.ibm.bank.dao.XYZBankDaoInterface;
import java.util.*;
import java.sql.*;

	public class XYZBankDaoClass implements XYZBankDaoInterface{
		Connection dbCon;
		PreparedStatement pstmt;
		public XYZBankDaoClass() {
			try {
				dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmtraining?serverTimezone=IST", "root", "");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
		public void insertData(String Name, String Email, int Pin, int amount) {
			String insertQry = "INSERT INTO customerdetails (Name, Email, Pin, amount) VALUES (?,?,?,?)";
			try {

				pstmt = dbCon.prepareStatement(insertQry);
				
				pstmt.setString(1, Name);
				pstmt.setString(2, Email);
				pstmt.setInt(3, Pin);
				pstmt.setInt(4, amount);
				
				if(pstmt.executeUpdate()>0) {
					System.out.println("Account Successfully Created!");
				}
				else {
					System.out.println("Couldn't Create. Try Again!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		public void ShowBalance(String Email, int Pin) {
			String ShowBalanceQry = "SELECT amount FROM customerdetails where EMAIL=?";
			try {
				pstmt = dbCon.prepareStatement(ShowBalanceQry);
				pstmt.setString(1,Email);
				ResultSet rs = pstmt.executeQuery();   
				int balance = 0;
				while (rs.next()) {         
				 balance = rs.getInt(1);        
				 
				}
				if(pstmt.execute()) {
					System.out.println("Available Balance is: " + balance);
				}
				else {
					System.out.println("Try Again!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		public void FundTransfer(String EmailSender, int Pin, String EmailReciever, int amount) {
			String FundTransferQry = "UPDATE customerdetails SET AMOUNT=AMOUNT + ?  WHERE EMAIL=?";
			try {

				pstmt = dbCon.prepareStatement(FundTransferQry);
				pstmt.setInt(1, amount);
				pstmt.setString(2, EmailReciever);
				//pstmt.setInt(3, amount);
				//pstmt.setString(4, EmailSender);
				if(pstmt.executeUpdate()>0) {
					System.out.println("Amount Transferred Successfully");
				}
				else {
					System.out.println("Failed.Try Again!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void WithdrawMoney(String Email, int Pin,int amount) {
			String WithdrawMoneyQry = "UPDATE customerdetails SET AMOUNT=AMOUNT - ?  WHERE EMAIL=?";
			try {

				pstmt = dbCon.prepareStatement(WithdrawMoneyQry);
				pstmt.setInt(1, amount);
				pstmt.setString(2, Email);
				if(pstmt.executeUpdate()>0) {
					System.out.println("Money Withdrawn successfully.");
				}
				else {
					System.out.println("Failed. Try Again!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		public void DepositMoney(String Email, int Pin, int amount) {
			String DepositQry = "UPDATE customerdetails SET AMOUNT=AMOUNT + ?  WHERE EMAIL=?";
			try {

				pstmt = dbCon.prepareStatement(DepositQry);
				
				pstmt.setInt(1, amount);
				pstmt.setString(2, Email);
				
				if(pstmt.executeUpdate()>0) {
					System.out.println("Money Deposited Successfully.");
				}
				else {
					System.out.println("Failed. Try Again!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}	

	