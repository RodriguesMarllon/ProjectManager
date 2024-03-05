package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Project;
import model.services.ProjectService;

public class ProjectListController implements Initializable{
	
	private ProjectService service;

	@FXML
	private TableView<Project> tableViewProject;
	
	@FXML
	private TableColumn<Project, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Project, String> tableColumnName;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Project> obsList;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}
	
	public void setProjectService(ProjectService service) { 
		this.service = service;
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idProjeto"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewProject.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Project> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewProject.setItems(obsList);
	}
}
