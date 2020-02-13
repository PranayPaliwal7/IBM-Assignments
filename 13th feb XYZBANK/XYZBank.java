package com.ibm.bank.bean;
import java.util.*;
import java.sql.*;
public class XYZBank {
	private String Name;
	private String Email;
	private int Pin;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int Pin) {
		this.Pin = Pin;
	}
	@Override
	public String toString() {
		return "XYZBank [NAME=" + Name + ", Email=" + Email + "]";
	}


}
