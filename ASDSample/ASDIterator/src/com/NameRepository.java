package com;

import java.util.Iterator;

public class NameRepository implements Aggregate {
	private String names[][] = {{"Rob" , "Jon" ,"Jul" , "Lor", "Pat", "Ken"},
							    {"Bob" , "Bon" ,"Sul" , "Lor", "Bat", "Jen"},
							    {"Yifeng" , "Xianfeng" ,"Hufeng", "Lifeng", "Ofeng", "Ningfeng"}};
	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	private class NameIterator implements Iterator {
		int index = 0;
		int countElement;
		@Override
		public boolean hasNext() {
			int rows = names.length;
			int columns = names[0].length;
			countElement = rows*columns;
			if (index < countElement) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				int rows = index / names[0].length;
				int columns = index % names.length ;
				index++;
				System.out.println("rows: "+ rows + "columns: " + columns + "index: " + index);
				return names[rows][columns];
			}
			return null;
		}
		
	}
}
