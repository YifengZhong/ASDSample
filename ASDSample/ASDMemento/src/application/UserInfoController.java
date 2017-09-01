package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UserInfoController {
	@FXML
	private TextField id = null;
	
	@FXML
	private TextField lastName = null;

	@FXML
	private TextField firstName = null;
	
	@FXML
	private TextField address = null;
	
	Originator originator = new Originator();
	CareTaker careTaker = new CareTaker();
	
	private void saveState() {
		User user = new User(id.getText(), lastName.getText(), firstName.getText(), address.getText());
		originator.setState(user);
		careTaker.add(originator.saveStateToMemenTo());
	}
	
	public void onLastNameMouse(MouseEvent event) throws IOException {
		System.out.println("1");
		saveState();
	}
	public void onAddressMouse(MouseEvent event) throws IOException {
		System.out.println("2");
		saveState();
	}
	public void onFirstNameMouse(MouseEvent event) throws IOException {
		System.out.println("3");
		saveState();
	}
	public void onGenderMouse(MouseEvent event) throws IOException {
		System.out.println("4");
		saveState();
	}
	
	public void onLoad(ActionEvent event) throws IOException {
		System.out.println("5");
		saveState();
	}
	
	public void onIdMouse(MouseEvent event) throws IOException {
		System.out.println("6");
		saveState();
	}
	public void onSave(ActionEvent event) throws IOException {
		System.out.println("7");
	}
	public void onReturn(ActionEvent event) throws IOException {
		System.out.println("8");
		User user = originator.getStateFromMemnto(careTaker.getLast());
		id.setText(user.getId().toString());
		firstName.setText(user.getFirstName());
		lastName.setText(user.getLastName());
		address.setText(user.getAddress());
	}
	
}
