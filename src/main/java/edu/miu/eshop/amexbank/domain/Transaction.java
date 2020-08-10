package edu.miu.eshop.amexbank.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {

	private Card card;
	private double amount;
	
	
	
	public Transaction(Card card, double amount) {
		this.card = card;
		this.amount = amount;
		
	}
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
}
