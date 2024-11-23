module org.example.employeeff {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.employeeff to javafx.fxml;
    exports org.example.employeeff;
}