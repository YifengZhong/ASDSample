package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Context;
import application.Gravel;
import application.Icey;
import application.Regular;
import application.State;
import application.Wet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class ControlPanelCtl implements Initializable  {
	@FXML
	private Label scale = null;
	@FXML
	private ComboBox<String> roadState;
	
	private Context context;
	private State state;
	
	public void onRight(ActionEvent event) throws IOException {
		if (context.getState().returnState() == 0) {
			scale.setText("1");
		}
		if (context.getState().returnState() == 1) {
			scale.setText("2");
		}
		if (context.getState().returnState() == 2) {
			scale.setText("3");
		}
		if (context.getState().returnState() == 3) {
			scale.setText("4");
		}
	
	}
	public void onLeft(ActionEvent event) throws IOException {
		if (context.getState().returnState() == 0) {
			scale.setText("5");
		}
		if (context.getState().returnState() == 1) {
			scale.setText("6");
		}
		if (context.getState().returnState() == 2) {
			scale.setText("7");
		}
		if (context.getState().returnState() == 3) {
			scale.setText("8");
		}
		
	}
	public void onBrake(ActionEvent event) throws IOException {
		if (context.getState().returnState() == 0) {
			scale.setText("9");
		}
		if (context.getState().returnState() == 1) {
			scale.setText("10");
		}
		if (context.getState().returnState() == 2) {
			scale.setText("12");
		}
		if (context.getState().returnState() == 3) {
			scale.setText("13");
		}
		
	}
	public void onSelect(ActionEvent event) throws IOException {
		if (roadState.getValue() == "Regular") {
			state = new Regular();
			state.doAction(context);
		}
		if (roadState.getValue() == "Gravel") {
			state = new Gravel();
			state.doAction(context);
		}
		if (roadState.getValue() == "Wet") {
			state = new Wet();
			state.doAction(context);
		}
		if (roadState.getValue() == "Icey") {
			state = new Icey();
			state.doAction(context);
		}
		
	}
	public void onAccel(ActionEvent event) throws IOException {
		if (context.getState().returnState() == 0) {
			scale.setText("14");
		}
		if (context.getState().returnState() == 1) {
			scale.setText("15");
		}
		if (context.getState().returnState() == 2) {
			scale.setText("16");
		}
		if (context.getState().returnState() == 3) {
			scale.setText("17");
		}
		
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Regular",
			        "Gravel",
			        "Wet",
			        "Icey"
			    );
		context = new Context(new Regular());
		roadState.getItems().addAll(options);
		roadState.getSelectionModel().select("Regular");
	}

}
