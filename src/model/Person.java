/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author JOAN
 */
public class Person {
     private final SimpleStringProperty id;
        private final SimpleStringProperty FirstName;
        private final SimpleStringProperty Address;
 
        public Person(String id, String FirstName, String Address) {
       this.id = new SimpleStringProperty(id);
       this.FirstName = new SimpleStringProperty(FirstName);
       this.Address = new SimpleStringProperty(Address);
        }
 
        public String getFirstName() {
            return FirstName.get();
        }
 
        public void setFirstName(String fName) {
            FirstName.set(fName);
        }
 
        public String getLastName() {
            return Address.get();
        }
 
        public void setLastName(String address) {
            Address.set(address);
        }
 
        public String getId() {
            return id.get();
        }
 
        public void setId(String Id) {
            id.set(Id);
        }
    }

