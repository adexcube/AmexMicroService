package edu.miu.eshop.amexbank.domain;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Amexdata {

	@Id
	private BigInteger cardNumber;
	private int cvv;
	private String cardHolder;
	private int month;
	private int year;
	private String billingAddress;
	private double amount;
	private boolean status;
	
	public Amexdata(BigInteger cardNumber, int cvv, String cardHolder, int month, int year, String billingAddress, double amount) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.cardHolder = cardHolder;
		this.month = month;
		this.year = year;
		this.billingAddress = billingAddress;
		this.amount = amount;
		this.status = true;
	}
	

	public BigInteger getCardNumber() {
		return cardNumber;
	}


	public int getCvv() {
		return cvv;
	}


	public String getCardHolder() {
		return cardHolder;
	}


	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}


	public String getBillingAddress() {
		return billingAddress;
	}


	public double getAmount() {
		return amount;
	}


	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}	
	
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
