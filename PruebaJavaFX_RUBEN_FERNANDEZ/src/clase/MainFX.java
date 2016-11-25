package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Aplicación de la prueba de desarrollo de interfaces
 * @author ruben
 * @version 1.0
 * @see vista/ControlFX
 *
 */
public class MainFX extends Application{
		private Stage primaryStage;
	    private AnchorPane rootLayout;

	    @Override
	    public void start(Stage primaryStage) {
	        this.primaryStage = primaryStage;
	        this.primaryStage.setTitle("My GitHub Profile");

	        primaryStage.show();
	        initRootLayout();
	    }
	    /**
	     Iniciar el layout y la clase css
	     */
	    public void initRootLayout() {
	        try {
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
	            rootLayout = (AnchorPane) loader.load();

	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            
	            scene.getStylesheets().add(getClass().getResource("../vista/mystylesheet.css").toExternalForm());
	            scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Abel");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	        launch(args);
	    }
}