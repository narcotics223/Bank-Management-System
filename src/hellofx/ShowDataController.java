/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import DAO.Database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Customer;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;

/**
 * FXML Controller class
 *
 * @author Pandong
 */
public class ShowDataController implements Initializable {

//    List<Customer> list = List.of(new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
//            new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
//            new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"));
    @FXML
    TableColumn<Person, String> id;
    @FXML
    TableColumn<Person, String> firstnameCol;
    @FXML
    TableColumn<Person, String> addressCol;
//    @FXML
//    TableColumn<Customer, String> birthdayCol;
//    @FXML
//    TableColumn<Customer, Integer> daysCol;
//    @FXML
//    TableColumn<Customer, Integer> accountCol;
//    @FXML
//    TableColumn<Customer, String> registrationCol;
//    @FXML
//    TableColumn<Customer, String> datereleaseCol;
//    @FXML
//    TableColumn<Customer, String> releasedbonusCol;
//    @FXML
//    TableColumn<Customer, String> remarksCol;
    @FXML
    private TableView<Person> table;
    final ObservableList<Person> list = FXCollections.observableArrayList();
    private static final Logger logger = Logger.getLogger(ShowDataController.class.getName());
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    Connection con = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            con = Database.getDBConnection();
            
            ResultSet result = con.createStatement().executeQuery("select * from customer");
            while (result.next()) {
                list.add(new Person(result.getString("Id"), result.getString("FirstName"), result.getString("Address")));
                 
            }

        } catch (SQLException e) {
            Logger.getLogger(ShowDataController.class.getName()).log(Level.SEVERE, null, e);
        }

        id.setCellValueFactory(new PropertyValueFactory<>("id"));

        firstnameCol.setCellValueFactory(new PropertyValueFactory<>("FirstName"));

        addressCol.setCellValueFactory(new PropertyValueFactory<>("Address"));
      
        table.setItems(list);
//
//        birthdayCol.setCellValueFactory(new PropertyValueFactory<>("Birthday"));
//
//        daysCol.setCellValueFactory(new PropertyValueFactory<>("Days"));
//
//        accountCol.setCellValueFactory(new PropertyValueFactory<>("Accounts"));
//
//        registrationCol.setCellValueFactory(new PropertyValueFactory<>("Registration Date"));
//
//        datereleaseCol.setCellValueFactory(new PropertyValueFactory<>("Daterelease"));
//
//        releasedbonusCol.setCellValueFactory(new PropertyValueFactory<>("Releasebonus"));
//
//        remarksCol.setCellValueFactory(new PropertyValueFactory<>("Remarks"));
//
//        table.getColumns().setAll(firstNameCol, addressCol, numberCol, birthdayCol, daysCol, accountCol, registrationCol, datereleaseCol, releasedbonusCol, remarksCol);
//        table.setItems(tableShowData());

    }

    private ObservableList<Customer> tableShowData() {
        final ObservableList<Customer> data = FXCollections.observableArrayList();
        data.addAll(
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"),
                new Customer("sad", "sample", 12, "22-21-21", 30, 20, "21-23-23", "23-123-20", 123, "30days"));
        return data;

    }
}
