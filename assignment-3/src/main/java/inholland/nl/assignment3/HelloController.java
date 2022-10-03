package inholland.nl.assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.Map;


public abstract class HelloController {


@FXML
    private Button btnX1Y1;
@FXML
private Label lblCurrentTurn;
@FXML
private Button btnX1Y2;
@FXML
private Button  btnX1Y3;
@FXML
    private Button btnX2Y1;
@FXML
    private Button btnX2Y2;
@FXML
    private Button btnX2Y3;
@FXML
    private Button btnX3Y1;
@FXML
    private Button btnX3Y2;
@FXML
    private Button btnX3Y3;

    private void setButtonTextToX(Button btn){btn.setText("X");}
    private void setButtonTextToO(Button btn){
        btn.setText("O");
}
    private void setButtonTextToDefault(Button btn){btn.setText("_");}
    private  Map<Integer,Button> buttonMaps= MakeButtonDictionary();
    private  Map<Integer,Button> MakeButtonDictionary()
    {
        Map<Integer,Button> buttonMaps= new HashMap<>() ;
        buttonMaps.put(1,btnX1Y1);
        buttonMaps.put(2,btnX1Y2);
        buttonMaps.put(3,btnX1Y3);
        buttonMaps.put(4,btnX2Y1);
        buttonMaps.put(5,btnX2Y2);
        buttonMaps.put(6,btnX2Y3);
        buttonMaps.put(7,btnX3Y1);
        buttonMaps.put(8,btnX3Y2);
        buttonMaps.put(9,btnX3Y3);
        return buttonMaps;
    }
    private  void startGame(){
        resetEverything();
        int i=1;
        int randomPosition=0;
        while(i<=9){
            if(i%2==0)
            {
                displayCurrentTurn("O");
                 randomPosition= (int) ((Math.random() * (9 - 1)) + 1);
                while(!(checkMove(buttonMaps.get((randomPosition))))){
                    randomPosition= (int) ((Math.random() * (9 - 1)) + 1);
                }
                setButtonTextToO(buttonMaps.get(randomPosition));
            }
            else{
                displayCurrentTurn("X");
            }
        }
    }
    @FXML
    private void onBtnX1Y1Clicked(){
        if(checkMove(btnX1Y1)){setButtonTextToX(btnX1Y1);}
    }
    @FXML
    private void onBtnX1Y2Clicked(){
        if(checkMove(btnX1Y2)){setButtonTextToX(btnX1Y2);}
    }
    @FXML
    private void onBtnX1Y3Clicked(){
        if(checkMove(btnX1Y3)){setButtonTextToX(btnX1Y3);}
    }
    @FXML
    private void onBtnX2Y1Clicked(){
        if(checkMove(btnX2Y1)){setButtonTextToX(btnX2Y1);}
    }
    @FXML
    private void onBtnX2Y2Clicked(){
        if(checkMove(btnX2Y2)){setButtonTextToX(btnX2Y2);}
    }
    @FXML
    private void onBtnX2Y3Clicked(){
        if(checkMove(btnX2Y3)){setButtonTextToX(btnX2Y3);}
    }
    @FXML
    private void onBtnX3Y1Clicked(){
        if(checkMove(btnX3Y1)){setButtonTextToX(btnX3Y1);}
    }
    @FXML
    private void onBtnX3Y2Clicked(){
        if(checkMove(btnX3Y2)){setButtonTextToX(btnX3Y2);}
    }
    @FXML
    private void onBtnX3Y3Clicked(){
        if(checkMove(btnX3Y3)){setButtonTextToX(btnX3Y3);}
    }
    private  boolean checkMove(Button btn){
        return (btn.getText()=="_");
    }
    private void calculatingComputerMove(Button movingButton){

    }
    private void displayCurrentTurn(String s){
        lblCurrentTurn.setText("Current turn: "+s);
    }
    private void resetEverything(){
        for (Button btn:buttonMaps.values()
             ) {
            setButtonTextToDefault(btn);
        }
    }
    }