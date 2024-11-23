package org.example.employeeff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.employeeff.Contractor;
import org.example.employeeff.Employee;
import org.example.employeeff.FullTimeEmployee;
import org.example.employeeff.PartTimeEmployee;

public class HelloController {

    @FXML
    private RadioButton rbFullTime;

    @FXML
    private RadioButton rbPartTime;

    @FXML
    private RadioButton rbContractor;

    @FXML
    private ToggleGroup employeeType;

    @FXML
    private TextField textName;

    @FXML
    private TextField textHourlyRate;

    @FXML
    private TextField textHours;

    @FXML
    private ListView<Employee> listView;

    @FXML
    private Label label;

    private ObservableList<Employee> employeeList = FXCollections.observableArrayList();

    // Initialize method
    @FXML
    public void initialize() {
        // Ensure the ToggleGroup is properly initialized
        if (employeeType == null) {
            employeeType = new ToggleGroup(); // Initialize ToggleGroup if it's not injected
        }

        // Set the ToggleGroup to each RadioButton
        rbFullTime.setToggleGroup(employeeType);
        rbPartTime.setToggleGroup(employeeType);
        rbContractor.setToggleGroup(employeeType);

        // Bind the listView to the ObservableList
        listView.setItems(employeeList);

        // Set default message for label
        label.setText("Select an employee to add or remove.");
    }

    // Event handler for Add button
    @FXML
    public void onAddClick() {
        try {
            // Collect common attributes
            String name = textName.getText();
            double hourlyRate = Double.parseDouble(textHourlyRate.getText());
            int hoursWorked = Integer.parseInt(textHours.getText());

            Employee newEmployee = null;

            // Check which employee type is selected and create the appropriate object
            if (rbFullTime.isSelected()) {
                newEmployee = new FullTimeEmployee(name, hourlyRate); // Full-time salary uses hourlyRate as an annual salary
            } else if (rbPartTime.isSelected()) {
                newEmployee = new PartTimeEmployee(name, hourlyRate, hoursWorked);
            } else if (rbContractor.isSelected()) {
                newEmployee = new Contractor(name, hourlyRate, hoursWorked);
            }

            // Add new employee to the list
            if (newEmployee != null) {
                employeeList.add(newEmployee);
                label.setText(name + " added.");
            }

            // Clear input fields after adding
            textName.clear();
            textHourlyRate.clear();
            textHours.clear();

        } catch (NumberFormatException e) {
            label.setText("Please enter valid numeric values for hourly rate and hours worked.");
        }
    }

    // Event handler for Remove button
    @FXML
    public void onRemoveClick() {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            Employee removedEmployee = employeeList.remove(selectedIndex);
            label.setText(removedEmployee.getName() + " removed.");
        } else {
            label.setText("Please select an employee to remove.");
        }
    }

    // Event handler for selecting from ListView
    @FXML
    public void onListClicked(MouseEvent event) {
        Employee selectedEmployee = listView.getSelectionModel().getSelectedItem();
        if (selectedEmployee != null) {
            label.setText("Selected: " + selectedEmployee);
        }
    }
}
