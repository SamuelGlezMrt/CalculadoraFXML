package dad.maven.calculadora.fxml;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();

		Scene scena = new Scene(controller.getView());
		
		primaryStage.setTitle("Calculadora - FXML");
		primaryStage.setScene(scena);
		primaryStage.getIcons().add(new Image("/img/calculator-32x32.png"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
