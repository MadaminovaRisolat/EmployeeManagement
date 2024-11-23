








Project Description

The Employee Management System is a JavaFX-based application designed to manage employees and their salaries. It allows the user to add different types of employees (Full-time, Part-time, Contractor), calculate their salaries, and display a list of employees. The system uses an object-oriented approach with an abstract class for employees, and each employee type implements its own salary calculation logic.

Features:
Add Employees: Users can add employees by entering their name, employee type, hourly rate, and hours worked.
Remove Employees: Users can remove employees from the list.
Salary Calculation: The system calculates and displays the salary for each employee type.
Full-time: Uses a fixed annual salary.
Part-time: Calculates based on hourly rate and hours worked.
Contractor: Uses an hourly rate with a maximum number of hours worked per month.
The project also features validation to ensure the entered data is correct (e.g., non-negative hours, positive hourly rate), and a GUI that updates dynamically as employees are added or removed.



Code Overview 

1. **Employee Class (Abstract)**  
   The `Employee` class defines the basic structure for all employees. It has an abstract `calculateSalary()` method, a `name` field, and a `toString()` method to display the employee's name.

2. **Employee Subclasses**  
   - **FullTimeEmployee**: Implements `calculateSalary()` with a fixed annual salary.
   - **PartTimeEmployee**: Implements `calculateSalary()` based on hourly rate and hours worked.
   - **Contractor**: Implements `calculateSalary()` based on an hourly rate and max hours worked.

3. **HelloController**  
   The controller manages user interactions via the GUI. It handles adding/removing employees, displaying employee details, and updating the ListView. It also validates user input.

4. **FXML File (UI Layout)**  
   Defines the UI layout with components like buttons, text fields, radio buttons, and a ListView. It links UI elements to the `HelloController` for interaction.

5. **ListView**  
   Displays employee names in the `ListView`, which updates dynamically when employees are added or removed.

6. **Validation**  
   Ensures valid numeric input for hours worked and hourly rate, with error messages displayed for invalid data.
