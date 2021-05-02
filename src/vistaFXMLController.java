

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class vistaFXMLController implements Initializable {

    @FXML
    private Button btnPagar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Label txfTotal;
    @FXML
    private Label txfPlaca;
    @FXML
    private RadioButton rbVisa;
    @FXML
    private RadioButton rbMastercard;
    @FXML
    private TextField txfNoTarjeta;
    @FXML
    private TextField txfMes;
    @FXML
    private TextField txfNombreTitular;
    @FXML
    private TextField txfAnio;
    @FXML
    private TextField txfCodSeguridad;
    
    
    
    public void pagarMulta(ActionEvent event){
        
        final ImageIcon icon = new ImageIcon("http://www.archisevilla.org/wp-content/themes/archisevilla/images/loading.gif");
        JOptionPane.showMessageDialog(null,"Procesando..","Pago Multas",JOptionPane.PLAIN_MESSAGE,icon);
        
    
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
    }    
    
}
