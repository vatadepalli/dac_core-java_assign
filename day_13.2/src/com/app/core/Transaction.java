package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	private TxType txType;
	private double amount;
	private LocalDate txDate;

	public Transaction(TxType txType, double amount, LocalDate txDate) {
		super();
		this.txType = txType;
		this.amount = amount;
		this.txDate = txDate;
	}

	@Override
	public String toString() {
		return "Transaction [txType=" + txType + ", amount=" + amount + ", txDate=" + txDate + "]";
	}

}
