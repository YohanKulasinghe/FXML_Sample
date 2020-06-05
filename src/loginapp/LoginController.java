package loginapp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginmodel = new LoginModel();

    @FXML
    private Label dbstatus;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private ComboBox combobox;
    @FXML
    private Button loginButton;

    public void initialize(URL url, ResourceBundle rb){
        if(this.loginmodel.isDatabaseConnected()){
            this.dbstatus.setText("Connected to Database");
        }else {
            this.dbstatus.setText("Not Connected to Database");
        }

        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
    }

}
