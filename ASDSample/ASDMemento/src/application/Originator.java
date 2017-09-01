package application;

public class Originator {
	User state;

	public User getState() {
		return state;
	}

	public void setState(User state) {
		this.state = state;
	}
	public Memento saveStateToMemenTo() {
		return new Memento(state);
	}
	public User getStateFromMemnto(Memento memento) {
		return memento.getState();
		
	}
}
