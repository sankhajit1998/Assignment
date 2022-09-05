/*
@Author Sankhajit Roy
*/

package com.menudrivenjdbc;

// menu driven operation using jdbc

public class Bank {    // class
	
	// taking variables
	private int custId;
	private String custName;
	private String custAddress;
	private long accountNo;
	
	// getter & setter method
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
	
}
