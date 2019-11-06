package com.app.core;

public enum AccType {
	SAVING, CURRENT, FD, LOAN, DMAT;

	@Override
	public String toString(){
		return name().toLowerCase();
	}
}