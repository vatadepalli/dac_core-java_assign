package com.app.core;

public enum Course {
	DAC, DMC, DBDA, DAI;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
