package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Convertors.DecimalToDouble;
import sample.Convertors.DecimalToSingle;
import sample.Convertors.DoubleToDecimal;
import sample.Convertors.SingleToDecimal;

public class Controller
{
    DecimalToSingle decimalToSingle = new DecimalToSingle();
    DecimalToDouble decimalToDouble = new DecimalToDouble();
    SingleToDecimal singleToDecimal = new SingleToDecimal();
    DoubleToDecimal doubleToDecimal = new DoubleToDecimal();
    @FXML
    Label lblSPrecision = new Label();
    @FXML
    Label lblDPrecision = new Label();
    @FXML
    Label lblDecimal = new Label();
    @FXML
    Label lblDecimal1 = new Label();
    @FXML
    TextField txtFDecimal = new TextField();
    @FXML
    TextField txtFSPrecision = new TextField();
    @FXML
    TextField txtFDPrecision = new TextField();

    public void Exit() {
        System.exit(0);
    }
    public void convertDecimal()
    {
        String decNum = txtFDecimal.getText();
        if (decNum.equals("NaN"))
        {
            lblSPrecision.setText("01111111111111111111111111111111");
            lblDPrecision.setText("01111111111111111111111111111111" +
                    "11111111111111111111111111111111");
        }
        else if (decNum.equals("Infinity"))
        {
            lblSPrecision.setText("01111111100000000000000000000000");
            lblDPrecision.setText("01111111111100000000000000000000" +
                    "00000000000000000000000000000000");
        }
        else if (decNum.equals("-Infinity"))
        {
            lblSPrecision.setText("11111111100000000000000000000000");
            lblDPrecision.setText("11111111111100000000000000000000" +
                    "00000000000000000000000000000000");
        }
        else {
            lblSPrecision.setText(decimalToSingle.convert(Double.parseDouble(decNum)));
            lblDPrecision.setText(decimalToDouble.convert(Double.parseDouble(decNum)));
        }
    }
    public void convertSPrecision()
    {
        String sPrecision = txtFSPrecision.getText();
        lblDecimal.setText(singleToDecimal.convert(sPrecision));
    }
    public void convertDPrecision()
    {
        String dPrecision = txtFDPrecision.getText();
        lblDecimal1.setText(doubleToDecimal.convert(dPrecision));
    }

}
