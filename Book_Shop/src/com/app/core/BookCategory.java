package com.app.core;

public enum BookCategory {
	FICTION,SCIENCE,FINANCE,YOGA,MEDITATION;
	
	public String toString() {
		return name().toLowerCase();
	}
}
