package vista;

import clase.MainFX;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * 
 * @author ruben
 * @version 1.0
 *
 */
public class ControlFX {
	// Reference to the main application
    private MainFX main;
    //metodo que llama el main a LayoutController
    
    public void setMain(MainFX main) {
        this.main = main;
    }

    /**
     * Cierra aplicación cuando piche en la foto que tiene este método
     */
    @FXML
    private void cerrar() {
   	        System.exit(0);
    }
    
    public void mostarSend() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}