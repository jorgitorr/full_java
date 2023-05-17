package prueba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button AButton;

    @FXML
    private Button BButton;

    @FXML
    private Button CButton;

    @FXML
    private Label labelA;

    @FXML
    private Label labelB;

    @FXML
    private Label labelC;

    @FXML
    void mostrar(ActionEvent event) {
        Button bt = (Button)event.getSource();
        if(bt.getText().equals("A"))
            labelA.setText(bt.getText());
        else if(bt.getText().equals("B"))
            labelB.setText(bt.getText());
        else if(bt.getText().equals("C"))
            labelC.setText(bt.getText());
    }


}
