package com.example.assignemnt2;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private final double PRICE_PER_DAY=45;
    private final int DAY_LIMIT=100;
    private final double EXTRA_KILOMETER_COST=0.25;
    private final double PRICE_OF_FUEL=2.0;
    @FXML
    private TextField numberOfDaysRented;
    @FXML
    private TextField numbersOfkilometersDriven;
    @FXML
    private CheckBox checkBoxForFullTank;
    @FXML
    private TextField numberOfLiters;
    @FXML
    private Label totalAmount;
@FXML
    protected void onCalculatePayementButtonClicked() {
    double amountToPay=0;
if ((Double.parseDouble(numbersOfkilometersDriven.getText())>(Integer.parseInt(numberOfDaysRented.getText())*100))){
    double numberOfKilometersLeftToPay=Double.parseDouble(numbersOfkilometersDriven.getText())-(Integer.parseInt(numberOfDaysRented.getText())*100) ;
    amountToPay=(Double.parseDouble(numberOfDaysRented.getText())*PRICE_PER_DAY)+priceForExtraKilometer(numberOfKilometersLeftToPay);
    }
else{
    amountToPay=(Double.parseDouble(numberOfDaysRented.getText())*PRICE_PER_DAY);
    }
if(checkBoxForFullTank.isSelected()){
    amountToPay=priceTOFillFuElTankFuel()+amountToPay;
    }
totalAmount.setText("€"+String.format("%.2f", amountToPay));
}
    private double priceTOFillFuElTankFuel(){
    return Double.parseDouble(numberOfLiters.getText())*PRICE_OF_FUEL;
    }
    private double priceForExtraKilometer(double extraKilometer){
    return EXTRA_KILOMETER_COST*extraKilometer;
    }


}