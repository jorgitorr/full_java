package chohan.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class chohanfxController implements Initializable{
    private int dinero;

    private int dado1;

    private int dado2;

    @FXML
    private TextField apuestaTextField;

    @FXML
    private Label betLabel;

    @FXML
    private Button evenButton;

    @FXML
    private Button oddButton;

    @FXML
    private Label pointsLabel;

    @FXML
    private Button rollDiceButton;

    @FXML
    private Button wagerButton;

    @FXML
    private Label wagerLabel;

    @FXML
    private Label repetirTiradaLabel;

    @FXML
    private Label dineroLabel;

    public chohanfxController() {
        this.dinero = 5000;
        this.dado1 = 0;
        this.dado2 = 0;
    }

    

    private boolean checkDados(){
        return dado1==0;
    }

    @FXML
    void onEven(ActionEvent event) {
        //par
        if(!checkDados()){
            int dados = dado1+dado2;
            if(dados%2==0){
                dinero += Integer.parseInt(betLabel.getText());
                dineroLabel.setText(dinero + "");
                pointsLabel.setText(pointsLabel.getText()+1);
            }
            else
                pointsLabel.setText((Integer.parseInt(pointsLabel.getText())-1) + "");

            betLabel.setText("");
            wagerLabel.setText("0");
            apuestaTextField.setText("0");
        }else
            repetirTiradaLabel.setText("Tienes que tirar al menos una vez");
    }

    @FXML
    void onOdd(ActionEvent event) {
        if(!checkDados()){
            int dados = dado1+dado2;
            if(dados%2!=0){
                dinero += Integer.parseInt(betLabel.getText());
                dineroLabel.setText(dinero + "");
                pointsLabel.setText(pointsLabel.getText()+1);
            }
            else
                pointsLabel.setText((Integer.parseInt(pointsLabel.getText())-1) + "");

            betLabel.setText("");
            wagerLabel.setText("0");
            apuestaTextField.setText("0");
        }else
            repetirTiradaLabel.setText("Tienes que tirar al menos una vez");
    }

    @FXML
    void onRollDice(ActionEvent event) {
        repetirTiradaLabel.setText("");
        dado1 = (int) (Math.random()*6+1);
        dado2 = (int) (Math.random()*6+1);
        System.out.println("dado 1: " + dado1);
        System.out.println("dado 2: " + dado2);
    }

    @FXML
    void onWager(ActionEvent event) {
        int num = Integer.parseInt(wagerLabel.getText());
        int apuesta = Integer.parseInt(apuestaTextField.getText());
        if(apuesta<dinero){
            wagerLabel.setText((num + apuesta) + "");
            betLabel.setText(Integer.parseInt(wagerLabel.getText())*2 + "");
            dinero -= apuesta;
            dineroLabel.setText(dinero + "");
        }else{
            repetirTiradaLabel.setText("No tienes suficiente dinero");
        }
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        dineroLabel.setText(dinero + "");
    }

}
