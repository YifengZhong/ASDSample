package application;

public interface State {
	public Integer returnState();
	public void doAction(Context context);
}
