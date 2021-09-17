package com.shuvendu.service;

import com.shuvendu.model.Token;
import com.shuvendu.model.Transaction;


public class TransactionServiceImpl implements TransactionService {

	@Override
	public void sell(Token token, double price, double quantity) {
		Transaction tr = new Transaction(token, price, quantity);
	}

	@Override
	public void buy(Token token, double price, double quantity) {
		Transaction tr = new Transaction(token, price, quantity,true);

	}

}
