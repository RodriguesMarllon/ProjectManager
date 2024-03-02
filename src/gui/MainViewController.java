package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemCreate;
	
	@FXML
	private MenuItem MenuItemAbout;
	
	@FXML
	public void onMenuItemCreateAction() {
		System.out.println("onMenuItemCreateAction");
	}
	
	@FXML
	public void onMenuAboutCreateAction() {
		System.out.println("onMenuAboutCreateAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
}
