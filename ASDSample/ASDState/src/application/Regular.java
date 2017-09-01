package application;

public class Regular implements State {

	@Override
	public Integer returnState() {
		return 3;
		// TODO Auto-generated method stub
	}
	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}	

}
