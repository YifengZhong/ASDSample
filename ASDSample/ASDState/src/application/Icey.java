package application;

public class Icey implements State {

	@Override
	public Integer returnState() {
		return 1;
		// TODO Auto-generated method stub
	}
	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}	
}
