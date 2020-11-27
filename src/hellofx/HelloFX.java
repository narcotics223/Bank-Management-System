package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pandong
 */
public class HelloFX extends Application {

    /**
     * @param stage
     * @throws java.lang.Exception
 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

}
