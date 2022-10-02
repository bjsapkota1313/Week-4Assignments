package com.example.week4assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private final double EXCHANGE_RATE=1.18;
    @FXML
    private Label convertedText;
    @FXML
    private TextField enteredAmount;

    @FXML
    protected void onConvertButtonClick() {
        double dollarPrice=EXCHANGE_RATE*(Double.parseDouble(enteredAmount.getText()));
        convertedText.setText(" Amount $: "+String.format("%.2f", dollarPrice));
    }
}