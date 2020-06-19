package application;

import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
@FXML
private Label lblStatus;
@FXML
private TextField txtUserName;

@FXML
private TextField txtPassword;

public void Login(ActionEvent event) {
	if(txtUserName.getText().equals("user")&&txtPassword.getText().equals("pass")) {
		lblStatus.setText("Login success");
	}else {
		lblStatus.setText("Login failed");
	}
	
}


}
