package com;

import java.util.ArrayList;
import java.util.List;

public class ProxyRowProtectionProxy implements ITable<IRow>{

	TableO tableOP;

	public ProxyRowProtectionProxy() {
		tableOP = TableO.getInstance();
	}
	public int numOfRows() {
		return tableOP.numOfRows();
	}
	public IRow getRow(int rowNum) throws RowException {
		if(rowNum == tableOP.getProcessingNum()) {
			throw new RowException();
		} 
		return tableOP.getRow(rowNum);
	}
	public void addRow(IRow row, int rowNum) throws RowException {
		if(rowNum == tableOP.getProcessingNum()) {
			throw new RowException();
		} 
		tableOP.modifyRow(row, rowNum);

	}
	public void deleteRow(int rowNum) throws RowException {
		if(rowNum == tableOP.getProcessingNum()) {
			throw new RowException();
		} 
		tableOP.deleteRow(rowNum);
	}
	private static class TableO implements ITable<IRow> {
		
		private List<IRow> table;
		private int processingNum;
		private TableO() {
			table = new ArrayList<IRow>();
			processingNum = -1;
		}
		enum Table {
			INSTANCE;
			
			TableO table;
			private Table() {
				System.out.println("In table create");
				table = new TableO();
			}
			
			private TableO getInstance() {
				return table;
			}
		}
		public static TableO getInstance() {
			return Table.INSTANCE.getInstance();
		}
		public int getProcessingNum() {
			return processingNum;
		}
		@Override
		public int numOfRows() {
			return table.size();
		}

		@Override
		public IRow getRow(int rowNum) {
			return table.get(rowNum);
		}

		@Override
		public void addRow(IRow row, int rowNum) {
			processingNum = rowNum;
			modifyRow(row, rowNum);
			processingNum = -1;
			
		}

		@Override
		public void deleteRow(int rowNum) {
			processingNum = rowNum;
			table.remove(rowNum);
			processingNum = -1;
			
		}
		public void modifyRow(IRow row, int rowNum) {
			if (rowNum >= table.size()) {
				table.add(row);
			}
			table.set(rowNum, row);	
			
		}		
	}

}
