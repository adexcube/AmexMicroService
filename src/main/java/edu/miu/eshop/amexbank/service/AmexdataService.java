package edu.miu.eshop.amexbank.service;

import java.math.BigInteger;
import java.util.List;

import edu.miu.eshop.amexbank.domain.Amexdata;
import edu.miu.eshop.amexbank.domain.Transaction;

public interface AmexdataService {

	public Amexdata findAmexdata(BigInteger cardNumber);
	public void saveAmexdata(Amexdata data );
	public List<Amexdata> getAmexdata();
	public boolean confirmTransaction(Transaction transaction);
	public double getBalanceOfAccount(String cardname);
}
