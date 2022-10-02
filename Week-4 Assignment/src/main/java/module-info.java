module com.example.week4assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week4assignment to javafx.fxml;
    exports com.example.week4assignment;
}