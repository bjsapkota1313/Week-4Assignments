module inholland.nl.assignment3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens inholland.nl.assignment3 to javafx.fxml;
    exports inholland.nl.assignment3;
}