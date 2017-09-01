package com;

public interface ITable<T> {
	public int numOfRows();
	public T getRow(int rowNum) throws RowException;
	public void addRow(T row, int rowNum) throws RowException; //add row at the end public void modifyRow(int rowNum, IRow row);
	public void deleteRow(int rowNum) throws RowException;
}
