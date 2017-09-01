package mum.edu;

import java.util.ArrayList;
import java.util.List;

public class Adaptee {
	private List<String> data;

	public Adaptee() {

		data = new ArrayList<String>();
	}
	public boolean empty(){
		return data.isEmpty();
	}
	public void add(String str){
		data.add(str);
	}
	public void remove(int pos){
	//remove the String object at position 'pos' and bring //forward all items after it
		for ( int i = pos; i < data.size()-2; i++ ){
			data.set(i, data.get(i+1));
		}
	}
	public String get(int pos){
		return data.get(pos);
	}
	public int getEnd() {
		return data.size()-1;
	}
}
