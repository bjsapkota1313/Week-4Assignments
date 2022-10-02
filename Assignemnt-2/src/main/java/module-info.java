module com.example.assignemnt2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignemnt2 to javafx.fxml;
    exports com.example.assignemnt2;
}