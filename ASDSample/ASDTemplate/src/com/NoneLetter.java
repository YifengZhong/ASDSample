package com;

public class NoneLetter extends LetterProcessor {
	private Character[][] temp;
	
	public NoneLetter(Character[][] temp) {
		super();
		this.temp = temp;
	}

	@Override
	public SymmetryType getType() {
		// TODO Auto-generated method stub
		return SymmetryType.NONE;
	}

	@Override
	public Character[][] getTemplate() {

		return temp;
	}

	@Override
	public Character[][] doProcess(SymmetryType type, Character[][] temp) {
		int lenRow = temp.length;
		int lenCol = temp[0].length;
		Character[][] result = new Character[20][10];
		int i = 0;
		for(; i< lenRow; i++) {
			int indexCol = 0;
			for(int j = 0; j<lenCol; j++,indexCol++) {	
				result[i][indexCol] = temp[i][j]; 
			}
			while (indexCol<10) {
				result[i][indexCol] = '-';
				indexCol++;
			}			
		}
		while (i<20) {
			for(int j =0; j<10; j++) {
				result[i][j] = '-';
			}
			i++;
		}
		return result;	
	}


}
