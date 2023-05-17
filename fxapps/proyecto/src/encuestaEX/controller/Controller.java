package encuestaEX.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import encuestaEX.dao.EncuestaDAO;
import encuestaEX.model.Deporte;
import encuestaEX.model.Encuesta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

    @FXML
    private CheckBox DeporteCheckBox;

    @FXML
    private ListView<Deporte> DeporteListView;

    @FXML
    private Spinner<Integer> HermanosSpinner;

    @FXML
    private Button aceptarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    private Slider cineSlider;

    @FXML
    private Slider comprasSlider;

    @FXML
    private ChoiceBox<Integer> edadChoiceBox;

    @FXML
    private RadioButton hombreRadioButton;

    @FXML
    private RadioButton mujerRadioButton;

    @FXML
    private TextField profesionTextField;

    @FXML
    private Slider televisionSlider;

    private int minSlider;

    private int maxSlider;

    private char sexo;

    private EncuestaDAO dao;

    

    public Controller() {
        this.minSlider = 0;
        this.maxSlider = 10;
        dao = new EncuestaDAO();
    }

    @FXML
    void onAceptar(ActionEvent event) {
        String profesion = profesionTextField.getText();
        int numHermanos = (int) HermanosSpinner.getValue();
        int edad = edadChoiceBox.getValue();

        Deporte deporte = DeporteListView.getSelectionModel().getSelectedItem();

        int compras = (int) comprasSlider.getValue();
        int television = (int) televisionSlider.getValue();
        int cine = (int) cineSlider.getValue();

        List<Integer>aficciones = new ArrayList<>();
        aficciones.add(compras);
        aficciones.add(television);
        aficciones.add(cine);

        Encuesta encuesta = new Encuesta(profesion, numHermanos, edad, sexo);
        encuesta.setDeporte(deporte);
        encuesta.setAficciones(aficciones);

        //inserta en fichero
        dao.insertarEnFichero(encuesta);
    }

    @FXML
    void esHombre(ActionEvent event) {
        sexo = 'h';
    }

    @FXML
    void esMujer(ActionEvent event) {
        sexo = 'm';
    }

    @FXML
    void onCancelar(ActionEvent event) {
        profesionTextField.setText("");
    }

    @FXML
    void onCheckDeporte(ActionEvent event) {
        DeporteListView.setDisable(false);
    }

    @FXML
    void onClickDeporte(MouseEvent event) {
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int hermanos;
        

        DeporteListView.getItems().addAll(Deporte.values());
        for(int i=1; i<100; i++)
            edadChoiceBox.getItems().add(i);

        HermanosSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10));

        televisionSlider.setMin(minSlider);
        comprasSlider.setMin(minSlider);
        cineSlider.setMin(minSlider);

        televisionSlider.setMax(maxSlider);
        comprasSlider.setMax(maxSlider);
        cineSlider.setMax(maxSlider);

        DeporteListView.setDisable(true);
            
    }

}
