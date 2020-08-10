package edu.miu.eshop.amexbank.domain;



import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Card {

	@Id
	private BigInteger cardNumber;
	private int cvv;
	private String cardHolder;
	private int month;
	private int year;
	private String billingAddress;
	
	
	
	public Card(String customerid, BigInteger cardnumber, int cvv, String cardholder, String address, int month, int year) {
		this.cardNumber = cardnumber;
		this.cvv = cvv;
		this.cardHolder = cardholder;
		this.month = month;
		this.year = year;
		this.billingAddress = address;
		
		
	}
	
	public Card() {
		// TODO Auto-generated constructor stub
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


	
	
	
	
}
