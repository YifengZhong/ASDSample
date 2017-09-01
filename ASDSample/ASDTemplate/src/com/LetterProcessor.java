package com;

public abstract class LetterProcessor {
	

	public final void processLetter() {
		SymmetryType type = getType();
		Character[][] temp = getTemplate();
		Character[][] result = doProcess(type, temp);
		printOut(result);
		
	}
	abstract public SymmetryType getType(); 
	abstract public Character[][] getTemplate();
	abstract public Character[][] doProcess(SymmetryType type, Character[][] temp);
	private void printOut(Character[][] result) {
		for(int i=0; i< result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
	}

}
