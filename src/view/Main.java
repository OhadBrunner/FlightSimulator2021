package view;
	
import ViewModel.ViewModel;
import javafx.application.Application;
import javafx.stage.Stage;
import model.FlightGearplayer;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxml = new FXMLLoader();
			BorderPane root = fxml.load(getClass().getResource("Window.fxml").openStream());
			Scene scene = new Scene(root,400,400);
			
			FlightGearplayer model = new FlightGearplayer("/FlightSimulator/src/settings/XMLProperties.xml");
			ViewModel viewModel = new ViewModel(model);
			
			WindowController view = fxml.getController();
			view.init(viewModel);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}