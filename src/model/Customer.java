/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Pandong
 */
public class Customer {

    private int Id;
    private SimpleStringProperty FullName;
    private SimpleStringProperty Address;
    private SimpleIntegerProperty Number;
    private SimpleStringProperty Birthday;
    private SimpleIntegerProperty Days;
    private SimpleIntegerProperty Accounts;
    private SimpleStringProperty RegistrationDate;
    private SimpleStringProperty Daterelease;
    private SimpleIntegerProperty Releasedbonus;
    private SimpleStringProperty Remarks;

    public Customer( String FullName, String Address, int Number, String Birthday, int Days, int Accounts, String RegistrationDate, String Daterelease, int Releasedbonus, String Remarks) {
        this.FullName = new SimpleStringProperty(FullName);
      this.Address = new SimpleStringProperty(Address);
        this.Number = new SimpleIntegerProperty(Number);
      this.Birthday = new SimpleStringProperty(Birthday);
      this.Days = new SimpleIntegerProperty(Days);
      this.Accounts = new SimpleIntegerProperty(Accounts);
      this.RegistrationDate = new SimpleStringProperty(RegistrationDate);
      this.Daterelease = new SimpleStringProperty(Daterelease);
      this.Releasedbonus = new SimpleIntegerProperty(Releasedbonus);
      this.Remarks = new SimpleStringProperty(Address);

    }

    public void setFullname(String value) {
        FullNameProperty().set(value);
    }

    public StringProperty AddressProperty() {
        if (Address == null) {
            Address = new SimpleStringProperty(this, "Address");
        }
        return Address;
    }

    public String getAddress() {
        return AddressProperty().get();
    }

    public void setAddress(String Address) {
        AddressProperty().set(Address);
    }

    public int getNumber() {
        return NumberProperty().get();
    }

    public IntegerProperty NumberProperty() {
        if (Number == null) {
            Number = new SimpleIntegerProperty(this, "Number");
        }
        return Number;
    }

    public void setNumber(int Number) {
        NumberProperty().set(Number);
    }

    public String getBirthday() {
        return BirthdayProperty().get();
    }

    public StringProperty BirthdayProperty() {
        if (Birthday == null) {
            Birthday = new SimpleStringProperty(this, "Birthday");
        }
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        BirthdayProperty().set(Birthday);
    }

    public int getDays() {
        return daysProperty().get();
    }

    public void setDays(int Days) {
        daysProperty().set(Days);
    }

    public IntegerProperty daysProperty() {
        if (Days == null) {
            Days = new SimpleIntegerProperty(this, "Days");
        }
        return Days;
    }

    public int getAccounts() {
        return accountProperty().get();
    }

    public void setAccounts(int Accounts) {
        accountProperty().set(Accounts);
    }

    public IntegerProperty accountProperty() {
        if (Accounts == null) {
            Accounts = new SimpleIntegerProperty(this, "Accounts");
        }
        return Accounts;
    }

    public String getRegistrationDate() {
        return registrationProperty().get();
    }

    public StringProperty registrationProperty() {
        if (RegistrationDate == null) {
            RegistrationDate = new SimpleStringProperty(this, "Registration Date");
        }
        return RegistrationDate;
    }

    public void setRegistrationDate(String RegistratioDate) {
        registrationProperty().set(RegistratioDate);
    }

    public String getDaterelease() {
        return dateReleaseProperty().get();
    }

    public StringProperty dateReleaseProperty() {
        if (Daterelease == null) {
            Daterelease = new SimpleStringProperty(this, "Daterelease");
        }
        return Daterelease;
    }

    public void setDaterelease(String Daterelease) {
        dateReleaseProperty().set(Daterelease);
    }

    public int getReleasedbonus() {
        return releaseBonusProperty().get();
    }

    public IntegerProperty releaseBonusProperty() {
        if (Releasedbonus == null) {
            Releasedbonus = new SimpleIntegerProperty(this, "Releasedbonus");
        }
        return Releasedbonus;
    }

    public void setReleasedbonus(int Releasedbonus) {
        releaseBonusProperty().set(Releasedbonus);
    }

    public StringProperty remarksProperty() {
        if (Remarks == null) {
            Remarks = new SimpleStringProperty(this, "Remarks");
        }
        return Remarks;
    }

    public String getRemarks() {
        return remarksProperty().get();
    }

    public void setRemarks(String Remarks) {
        remarksProperty().set(Remarks);
    }

    public StringProperty FullNameProperty() {
        if (FullName == null) {
            FullName = new SimpleStringProperty(this, "FullName");
        }
        return FullName;
    }
    public String getFullName() {
        return FullNameProperty().get();
    }
}
