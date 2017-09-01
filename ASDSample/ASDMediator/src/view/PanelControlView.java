package view;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import application.Position;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PanelControlView  implements Initializable  {
	
	Stone a0b = new A0(0,0);
	private Map<Position, Button> map = new HashMap();	
	@FXML
	private Button a0;
	@FXML
	private Button a1;
	@FXML
	private Button a2;
	@FXML
	private Button a3;
	@FXML
	private Button a4;
	@FXML
	private Button a5;
	@FXML
	private Button a6;
	@FXML
	private Button a7;
	
	Mediator mediator;
//	Stone a1 = new A0("a","1");
//	Stone a2 = new A0("a","2");
//	Stone a3 = new A0("a","3");
//	Stone a4 = new A0("a","4");
//	Stone a5 = new A0("a","5");
//	Stone a6 = new A0("a","6");
//	Stone a7 = new A0("a","7");
	public void onA0(ActionEvent event) throws IOException {
		List<Position> ret = a0b.display(mediator);
		
		ret.stream().forEach(x -> {
			map.get(x).getStyleClass().removeAll("black");
			map.get(x).getStyleClass().add("green");
		});
		a0.getStyleClass().add("black");
		a1.getStyleClass().add("green");
		a2.getStyleClass().add("green");
		
	}
	public void onA1(ActionEvent event) throws IOException {
		
	}
	public void onA2(ActionEvent event) throws IOException {
		
	}
	public void onA3(ActionEvent event) throws IOException {
		
	}
	public void onA4(ActionEvent event) throws IOException {
		
	}
	public void onA5(ActionEvent event) throws IOException {
		
	}
	public void onA6(ActionEvent event) throws IOException {
		
	}
	public void onA7(ActionEvent event) throws IOException {
		
	}
	public void onB0(ActionEvent event) throws IOException {
		
	}
	public void onB1(ActionEvent event) throws IOException {
		
	}
	public void onB2(ActionEvent event) throws IOException {
		
	}
	public void onB3(ActionEvent event) throws IOException {
		
	}
	public void onB4(ActionEvent event) throws IOException {
		
	}
	public void onB5(ActionEvent event) throws IOException {
		
	}
	public void onB6(ActionEvent event) throws IOException {
		
	}
	public void onB7(ActionEvent event) throws IOException {
		
	}
	public void onC0(ActionEvent event) throws IOException {
		
	}
	public void onC1(ActionEvent event) throws IOException {
		
	}
	public void onC2(ActionEvent event) throws IOException {
		
	}
	public void onC3(ActionEvent event) throws IOException {
		
	}
	public void onC4(ActionEvent event) throws IOException {
		
	}
	public void onC5(ActionEvent event) throws IOException {
		
	}
	public void onC6(ActionEvent event) throws IOException {
		
	}
	public void onC7(ActionEvent event) throws IOException {
		
	}
	public void onD0(ActionEvent event) throws IOException {
		
	}
	public void onD1(ActionEvent event) throws IOException {
		
	}
	public void onD2(ActionEvent event) throws IOException {
		
	}
	public void onD3(ActionEvent event) throws IOException {
		
	}
	public void onD4(ActionEvent event) throws IOException {
		
	}
	public void onD5(ActionEvent event) throws IOException {
		
	}
	public void onD6(ActionEvent event) throws IOException {
		
	}
	public void onD7(ActionEvent event) throws IOException {
		
	}
	public void onE0(ActionEvent event) throws IOException {
		
	}
	public void onE1(ActionEvent event) throws IOException {
		
	}
	public void onE2(ActionEvent event) throws IOException {
		
	}
	public void onE3(ActionEvent event) throws IOException {
		
	}
	public void onE4(ActionEvent event) throws IOException {
		
	}
	public void onE5(ActionEvent event) throws IOException {
		
	}
	public void onE6(ActionEvent event) throws IOException {
		
	}
	public void onE7(ActionEvent event) throws IOException {
		
	}
	public void onF0(ActionEvent event) throws IOException {
		
	}
	public void onF1(ActionEvent event) throws IOException {
		
	}
	public void onF2(ActionEvent event) throws IOException {
		
	}
	public void onF3(ActionEvent event) throws IOException {
		
	}
	public void onF4(ActionEvent event) throws IOException {
		
	}
	public void onF5(ActionEvent event) throws IOException {
		
	}
	public void onF6(ActionEvent event) throws IOException {
		
	}
	public void onF7(ActionEvent event) throws IOException {
		
	}
	public void onG0(ActionEvent event) throws IOException {
		
	}
	public void onG1(ActionEvent event) throws IOException {
		
	}
	public void onG2(ActionEvent event) throws IOException {
		
	}
	public void onG3(ActionEvent event) throws IOException {
		
	}
	public void onG4(ActionEvent event) throws IOException {
		
	}
	public void onG5(ActionEvent event) throws IOException {
		
	}
	public void onG6(ActionEvent event) throws IOException {
		
	}
	public void onG7(ActionEvent event) throws IOException {
		
	}
	public void onH0(ActionEvent event) throws IOException {
		
	}
	public void onH1(ActionEvent event) throws IOException {
		
	}
	public void onH2(ActionEvent event) throws IOException {
		
	}
	public void onH3(ActionEvent event) throws IOException {
		
	}
	public void onH4(ActionEvent event) throws IOException {
		
	}
	public void onH5(ActionEvent event) throws IOException {
		
	}
	public void onH6(ActionEvent event) throws IOException {
		
	}
	public void onH7(ActionEvent event) throws IOException {
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 mediator = ColorMediator.getInstance();
		 map.put(new Position(0,0), a0);
		 map.put(new Position(1,0), a1);
		 map.put(new Position(2,0), a2);
		
	}

}
