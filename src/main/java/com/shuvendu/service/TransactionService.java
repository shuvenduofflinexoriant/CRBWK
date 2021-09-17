package com.shuvendu.service;

import com.shuvendu.model.Token;

public interface TransactionService {
		public void sell(Token token,double price,double quantity);
		public void buy(Token token,double price,double quantity);
}
