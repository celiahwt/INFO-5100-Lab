package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import model.User;

public class MainFXMLController implements Initializable {

    @FXML
    private TextField nameTextField;

    @FXML
    private Spinner<Integer> ageSpinner;

    @FXML
    private TextField emailTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Controller initialized");

        // Initialize spinner with a range of valid ages
        ageSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 120, 18));
    }

    @FXML
    public void submit() {
        try {
            String name = nameTextField.getText().trim();
            String email = emailTextField.getText().trim();
            int age = ageSpinner.getValue();

            // Validation
            if (name.isEmpty() || email.isEmpty()) {
                showAlert("Please fill in all fields.", Alert.AlertType.WARNING, "Missing Data");
                return;
            }

            if (!email.contains("@") || !email.contains(".")) {
                showAlert("Please enter a valid email address.", Alert.AlertType.ERROR, "Email Error");
                return;
            }

            // Create a User object
            User user = new User(name, age, email);

            // Show success alert with details
            showAlert("Registration Successful!\n\n" + user, Alert.AlertType.INFORMATION, "Success");

            // Clear fields after success
            nameTextField.clear();
            emailTextField.clear();
            ageSpinner.getValueFactory().setValue(18);

        } catch (Exception e) {
            showAlert("An unexpected error occurred: " + e.getMessage(), Alert.AlertType.ERROR, "Error");
        }
    }

    private void showAlert(String message, Alert.AlertType type, String header) {
        Alert alert = new Alert(type);
        alert.setTitle("Registration");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
