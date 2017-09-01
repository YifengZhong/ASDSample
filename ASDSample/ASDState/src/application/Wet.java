package application;

public class Wet implements State {

	@Override
	public Integer returnState() {
		return 2;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}	

}
