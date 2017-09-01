package com;

public class Main {

	public static void main(String[] args) {
		ProxyRowProtectionProxy datap =	new ProxyRowProtectionProxy();
		try {
			datap.addRow(new Row(), 0);
		} catch (RowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
