package com.adikaplabs.core;

public class Calculator {
	private Double firstNumber;
	private Double secondNumber;

	public Double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(Double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public Double add() {
		return firstNumber + secondNumber;
	}

	public Double subtract() {
		return firstNumber - secondNumber;
	}

	public Double multiply() {
		return firstNumber * secondNumber;
	}

	public Double divide() {
		return firstNumber / secondNumber;
	}
}


