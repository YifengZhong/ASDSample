package application;

public class Memento {
	private User state;
	public Memento(User state) {
		this.state = state;
	}
	
	public User getState() {
		return state;
	}
}
