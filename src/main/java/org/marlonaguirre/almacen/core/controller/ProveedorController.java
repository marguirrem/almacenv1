package org.marlonaguirre.almacen.core.controller;

import com.mysql.fabric.xmlrpc.base.Value;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

import org.marlonaguirre.almacen.core.Principal;
import org.marlonaguirre.almacen.core.model.Proveedor;
import org.marlonaguirre.almacen.core.service.ProveedorService;
import org.marlonaguirre.almacen.core.service.ProveedorServiceImpl;

public class ProveedorController implements Initializable {

    private Principal principal;

    @FXML
    private TableView tblProveedor;
    
    private ProveedorService proveedorService = new ProveedorServiceImpl();
    @FXML
    private TableColumn<Proveedor, String> colNit;
    @FXML
    private TableColumn<Proveedor, String> colRazonSocial;
    @FXML
    private TableColumn<Proveedor, String> colDireccion;
    @FXML
    private TableColumn<Proveedor, String> colPaginaWeb;
    @FXML
    private TableColumn<Proveedor, String> colContacto;
    
    @FXML private TextField txtNit;
    @FXML private TextField txtDireccion;
    @FXML private TextField txtContactoPrincipal;
    @FXML private TextField txtRazonSocial;
    @FXML private TextField txtPaginaWeb;

    private ObservableList<Proveedor> lista;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lista = FXCollections.observableArrayList(proveedorService.findAllProveedor());
        tblProveedor.setItems(lista);
        this.colNit.setCellValueFactory(cellData -> cellData.getValue().nit());
        this.colRazonSocial.setCellValueFactory(cellData -> cellData.getValue().razonSocial());
        this.colDireccion.setCellValueFactory(cellData -> cellData.getValue().direccion());
        this.colPaginaWeb.setCellValueFactory(cellData -> cellData.getValue().paginaWeb());
        this.colContacto.setCellValueFactory(cellData -> cellData.getValue().contactoPrincipal());

    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void regresarVentanaPrincipal() throws IOException {
        this.principal.mostrarVentanaPrincipal();
    }

    public void nuevo() {
        try {
            Proveedor nuevo = new Proveedor();
            nuevo.setNit(txtNit.getText());
            nuevo.setDireccion("Guatemala,Guatemala");
            nuevo.setContactoPrincipal("Luis Lopez");
            nuevo.setRazonSocial("Soluciones GT S.A");
            nuevo.setPaginaWeb("www.solucionesgt.com");
            this.proveedorService.saveProveedor(nuevo);
            this.lista.add(nuevo);
            JOptionPane.showMessageDialog(null, "Proveedor guardado con exito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Proveedor");
        }
    }

    public void seleccionar(){
        //txtNit.setText(tblProveedor.getSelectionModel().getSelectedItem());
    }
}
