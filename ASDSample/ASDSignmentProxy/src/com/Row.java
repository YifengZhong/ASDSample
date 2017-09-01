package com;

public class Row implements IRow{

	private int id;
	private String value;
	
	public String getValue() {
		return value;
	}

	public int getRowNum() {
		return id;
	}

}
