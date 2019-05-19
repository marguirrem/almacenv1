package org.marlonaguirre.almacen.core;

import org.marlonaguirre.almacen.core.controller.VentanaPrincipalController;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.marlonaguirre.almacen.core.controller.ProveedorController;

public class Principal extends Application {

    private final String PAQUETE_VISTA = "/org/marlonaguirre/almacen/core/view/";
    private Stage escenarioPrincipal;

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        this.escenarioPrincipal = escenarioPrincipal;
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/VentanaPrincipal.fxml"));
        mostrarVentanaPrincipal();
        //mostrarProveedores();
        this.escenarioPrincipal.setTitle("Sistema de contro de Alamacen v1.0");
        this.escenarioPrincipal.show();
    }

    public void mostrarVentanaPrincipal() throws IOException {
        VentanaPrincipalController main = (VentanaPrincipalController)cambiarEscena("VentanaPrincipalView.fxml", 800, 600);        
        main.setPrincipal(this);
    }
    
    public void mostrarProveedores() throws IOException{
        ProveedorController proveedorController =( ProveedorController) cambiarEscena("ProveedorView.fxml", 655, 555);
        proveedorController.setPrincipal(this);
    }
    
    //Metodo para cambiar el escenario principal
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws IOException{
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA + fxml);  
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA + fxml));        
        Scene scene = new Scene((AnchorPane) cargadorFXML.load(archivo),ancho,alto);       
        scene.getStylesheets().add("/styles/Styles.css");
        this.escenarioPrincipal.setScene(scene);
        this.escenarioPrincipal.sizeToScene();        
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
