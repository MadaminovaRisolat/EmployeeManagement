![Screen Shot 2024-11-24 at 01 14 27](https://github.com/user-attachments/assets/b53d8533-6fef-46ad-9c89-5f0847705931) 


![Screen Shot 2024-11-24 at 01 14 53](https://github.com/user-attachments/assets/c0bd6cf8-8331-4e51-b727-e7d9046b385f)


![Screen Shot 2024-11-24 at 01 15 14](https://github.com/user-attachments/assets/7505120d-9611-429e-8138-519e27a3a4ee)


![Screen Shot 2024-11-24 at 01 15 41](https://github.com/user-attachments/assets/a409b970-5add-4588-acb2-db3878fea697)


![Screen Shot 2024-11-24 at 01 15 50](https://github.com/user-attachments/assets/f4eafd8f-1f69-4ed1-ad66-de5b6ceaa53d)


![Screen Shot 2024-11-24 at 01 15 56](https://github.com/user-attachments/assets/1406e1d2-0ccc-46c0-b01b-7136b104ba45)


![Screen Shot 2024-11-24 at 01 16 36](https://github.com/user-attachments/assets/253939a9-05ae-4ba3-bec8-fac0fed55706)


![Screen Shot 2024-11-24 at 01 16 47](https://github.com/user-attachments/assets/bad051d0-16b0-4369-a584-0614c2affe63)


![Screen Shot 2024-11-24 at 01 17 24](https://github.com/user-attachments/assets/e982f120-aac4-4cb0-b004-5e7fa49a1a86)


![Screen Shot 2024-11-24 at 01 17 52](https://github.com/user-attachments/assets/e74c2937-de3e-4b35-ab9e-7b6a7a55a294)

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
