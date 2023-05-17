package controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import dao.ClienteDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Cliente;

public class Controller implements Initializable{
    @FXML
    private ListView<Cliente> ClientesListView;

    @FXML
    private Label apellidoLabel;

    @FXML
    private TextField apellidoTextField;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTextField;

    @FXML
    private Button insertarButton;

    @FXML
    private Label nombreLabel;

    @FXML
    private TextField nombreTextField;

    @FXML
    private Label paisLabel;

    @FXML
    private Button borrarButton;

    @FXML
    private TextField paisTextField;    

    private ClienteDAO dao;

    @FXML
    void borrar(ActionEvent event) {
        Cliente c = ClientesListView.getSelectionModel().getSelectedItem();
        dao.borrarCliente(c);
        ClientesListView.getItems().remove(c);
    }

    @FXML
    void mostrarCliente(MouseEvent event) {
        Cliente cliente = ClientesListView.getSelectionModel().getSelectedItem();
        idLabel.setText(cliente.getId() + "");
        nombreLabel.setText(cliente.getNombre());
        apellidoLabel.setText(cliente.getApellido());
        paisLabel.setText(cliente.getPais());
    }

    @FXML
    void insertarCliente(ActionEvent event) {
        int id = Integer.parseInt(idTextField.getText());
        Cliente cliente = dao.getClienteById(id);
        if(cliente == null){//si no hay ningun cliente con ese id se crea
            cliente = new Cliente(id, nombreTextField.getText(), apellidoTextField.getText());
            cliente.setPais(paisTextField.getText());
            dao.insertarCliente(cliente);
            ClientesListView.getItems().add(cliente);
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        dao = new ClienteDAO();
        List<Cliente>clientes = dao.obtieneClientes();
        ClientesListView.getItems().addAll(clientes);
    }

}
