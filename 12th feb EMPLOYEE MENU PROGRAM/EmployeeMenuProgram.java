package com.ibm.training;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmployeeMenuProgram {
	Connection dbConn;
	PreparedStatement pstmt;
	public EmployeeMenuProgram() {
		try {
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmtraining?serverTimezone=IST", "root", "");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		EmployeeMenuProgram demo = new EmployeeMenuProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("                          Welcome to the Employee Portal");
		while(true) {
		System.out.println("Press 1. Add new employee");
		System.out.println("Press 2. Update employee details");
		System.out.println("Press 3. Delete employee");
		int choice = sc.nextInt();
		switch(choice) {
		case(1):
			System.out.println("Enter the name of the employee");
			String Name=sc.next();
			System.out.println("Enter the email ID");
			String Email = sc.next();
			System.out.println("Enter the ID");
			int ID = sc.nextInt();
			demo.insertData(Name, Email, ID);
			break;
		case(2):
			System.out.println("Enter the id of which you want to change the details");
			int iD = sc.nextInt();
			System.out.println("Enter the new name");
			String newName = sc.next();
			System.out.println("Enter the new Email ID");
			String newEmail = sc.next();
			demo.updateData(iD,newName,newEmail);
			break;
		case(3):
			System.out.println("Enter the id of the employee to delete");
		    int idd= sc.nextInt();
			demo.deleteData(idd);
			break;
		}}

	}
	//update employee details
		public void updateData(int newID, String newName, String newEmail) {
			String updateQry = "UPDATE employee SET Name = ?, Email = ? where iD = ?";
			try {
				pstmt = dbConn.prepareStatement(updateQry);
				
				pstmt.setString(1, newName);
				pstmt.setString(2, newEmail);
				pstmt.setInt(3, newID);
				if(pstmt.executeUpdate()>0) {
					System.out.println("Details updated succesfully");
				}
				else {
					System.out.println("Failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//Insert employee
				public void insertData(String Name, String Email, int ID) {
					String insertQry = "INSERT INTO employee (Name, Email, ID) VALUES (?,?,?)";
					try {

						pstmt = dbConn.prepareStatement(insertQry);
						
						pstmt.setString(1, Name);
						pstmt.setString(2, Email);
						pstmt.setInt(3, ID);
						if(pstmt.executeUpdate()>0) {
							System.out.println("New Employee Added!");
						}
						else {
							System.out.println("Failed");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				//Delete employee
				public void deleteData(int idd) {
					String deleteQry = "DELETE FROM employee WHERE ID=?";
					try {
						pstmt = dbConn.prepareStatement(deleteQry);
						
						pstmt.setInt(1,idd);
						if(pstmt.executeUpdate()>0) {
							System.out.println("Employee Deleted successfully");
						}
						else {
							System.out.println("Failed");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
}
