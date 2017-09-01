package application;

public class Gravel implements State {

	@Override
	public Integer returnState() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}
}
