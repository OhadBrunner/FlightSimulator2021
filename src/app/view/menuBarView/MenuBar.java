package app.view.menuBarView;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


public class MenuBar extends AnchorPane {
	MenuBarController menuBarButton;
	private StringProperty settingFile;
	private StringProperty csvFile;
	private StringProperty algorithmFile;

	public MenuBar() {
		super();
		try {

			
			FXMLLoader fxl = new FXMLLoader();
			AnchorPane menuBar = fxl.load(getClass().getResource("MenuBar.fxml").openStream());
			MenuBarController menuBarController = fxl.getController();

			
			this.getChildren().add(menuBar);
			settingFile = new SimpleStringProperty(menuBarController.getSettingFile().getValue());
			csvFile = new SimpleStringProperty(menuBarController.getCsvFileString().getValue());
			algorithmFile = new SimpleStringProperty(menuBarController.getAlgorithmFile().getValue());

			menuBarController.getAlgorithmFile().bindBidirectional(algorithmFile);
			menuBarController.getCsvFileString().bindBidirectional(csvFile);
			menuBarController.getSettingFile().bindBidirectional(settingFile);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MenuBarController getMenuBarButton() {
		return menuBarButton;
	}

	public void setMenuBarButton(MenuBarController menuBarButton) {
		this.menuBarButton = menuBarButton;
	}

	public StringProperty getSettingFile() {
		return settingFile;
	}

	public void setSettingFile(StringProperty settingFile) {
		this.settingFile = settingFile;
	}

	public StringProperty getCsvFile() {
		return csvFile;
	}

	public void setsCsvFile(StringProperty sCsvFile) {
		this.csvFile = sCsvFile;
	}

	public StringProperty getAlgorithmFile() {
		return algorithmFile;
	}

	public void setAlgorithmFile(StringProperty algorithmFile) {
		this.algorithmFile = algorithmFile;
	}

}
