package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import dao.Dao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Deporte;
import model.Encuesta;

public class Controller implements Initializable {

    @FXML
    private Button AceptarButton;

    @FXML
    private ListView<Deporte> DeporteListView;

    @FXML
    private Spinner<Integer> NumHermanosSpinner;

    @FXML
    private ToggleGroup Sexo;

    @FXML
    private Button cancelarButton;

    @FXML
    private Slider cineSlider;

    @FXML
    private Slider comprasSlider;

    @FXML
    private CheckBox deporteCheckBox;

    @FXML
    private ChoiceBox<Integer> edadChoiceBox;

    @FXML
    private TextField profesionTextField;

    @FXML
    private Slider televisionSlider;

    @FXML
    private RadioButton hombreButton;

    @FXML
    private RadioButton mujerButton;

    @FXML
    private Label mensajeLabel;

    private char sexo;

    private Dao dao;

    private Deporte deporte;

    private final int minSlider = 0;
    private final int maxSlider = 10;

    private boolean activar = false;
    

    public Controller() {
        deporte = null;
        dao = new Dao();
    }

    @FXML
    void aceptar(ActionEvent event) {
        Encuesta encuesta = null;
        String profesion = profesionTextField.getText();
        //si la casilla de ¿Hace deporte? no ha sido seleccionada
        if(deporteCheckBox.isSelected()) 
            deporte = DeporteListView.getSelectionModel().getSelectedItem();
        else 
            deporte = null;

        int edad;
        if(edadChoiceBox.getValue()==null)
            edad = 0;
        else
            edad = edadChoiceBox.getValue();
        int numHermanos = NumHermanosSpinner.getValue();
        double television = televisionSlider.getValue();
        double compras = comprasSlider.getValue();
        double cine = cineSlider.getValue();

        List<Double>aficciones = new ArrayList<>();
        aficciones.add(television);
        aficciones.add(compras);
        aficciones.add(cine);

        if(profesion==""||deporte==null||edad==0){
            mensajeLabel.setText("Te falta algún dato");
        }else{
            encuesta = new Encuesta(profesion, numHermanos, edad, sexo);
            encuesta.setAficcion(aficciones);
            encuesta.setDeporte(deporte);
            dao.escribir(encuesta);
            dao.escribirObject(encuesta);
            //leer DAO
            dao.leerObject();
        }
    }



    @FXML
    void cancelar(ActionEvent event) {
        profesionTextField.setText("");
        edadChoiceBox.setValue(0);
        mensajeLabel.setText("");
        
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
    void tieneDeporte(ActionEvent event) {
        if(activar){
            DeporteListView.setDisable(activar);
            activar = false;
        }else{
            DeporteListView.setDisable(activar);
            activar = true;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DeporteListView.setDisable(true);//desactiva al iniciar la lista de deportes hasta que no se ha seleccionado en el radio button
        
        DeporteListView.getItems().addAll(Deporte.values());
        profesionTextField.setText("");

        for(int i=1; i<100; i++)
            edadChoiceBox.getItems().add(i);

        NumHermanosSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10));
        televisionSlider.setMin(minSlider);
        comprasSlider.setMin(minSlider);
        cineSlider.setMin(minSlider);

        televisionSlider.setMax(maxSlider);
        comprasSlider.setMax(maxSlider);
        cineSlider.setMax(maxSlider);
    }

}
