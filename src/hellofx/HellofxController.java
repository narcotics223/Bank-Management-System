package hellofx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pandong
 */
public class HellofxController implements Initializable {

   public void showData(ActionEvent event) throws IOException {
       Parent showDataView = FXMLLoader.load(getClass().getResource("ShowData.fxml"));
       Scene showDataScene = new Scene(showDataView);
       
       Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(showDataScene);
       window.show();
   }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
