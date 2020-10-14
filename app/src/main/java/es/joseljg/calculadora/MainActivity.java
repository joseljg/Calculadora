package es.joseljg.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_numero1 = null;
    private EditText edt_numero2 = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1  = (EditText) findViewById(R.id.edt_numero1);
        edt_numero2 = (EditText) findViewById(R.id.edt_numero2);
        txt_resultado = (TextView) findViewById(R.id.txt_resutado);
    }

    public void sumar(View view) {
        String textonumero1 = String.valueOf(edt_numero1.getText());
        String textonumero2 = String.valueOf(edt_numero2.getText());
        //----------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //----------------------------------------------------------
        double resultado = numero1 + numero2;
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void restar(View view) {
        String textonumero1 = String.valueOf(edt_numero1.getText());
        String textonumero2 = String.valueOf(edt_numero2.getText());
        //----------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //----------------------------------------------------------
        double resultado = numero1 - numero2;
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void multiplicar(View view) {
        String textonumero1 = String.valueOf(edt_numero1.getText());
        String textonumero2 = String.valueOf(edt_numero2.getText());
        //----------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //----------------------------------------------------------
        double resultado = numero1 * numero2;
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void dividir(View view) {
        String textonumero1 = String.valueOf(edt_numero1.getText());
        String textonumero2 = String.valueOf(edt_numero2.getText());
        //----------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //----------------------------------------------------------
        double resultado = 0.0;
        if(numero2 != 0) {
            resultado = numero1 / numero2;
        }
        else{
            edt_numero2.setError("no puedes poner cero");
        }
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void resto(View view) {
        String textonumero1 = String.valueOf(edt_numero1.getText());
        String textonumero2 = String.valueOf(edt_numero2.getText());
        //----------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //----------------------------------------------------------
        double resultado = 0.0;
        if(numero2 != 0) {
            resultado = numero1 % numero2;
        }
        else{
            edt_numero2.setError("no puedes poner cero");
        }
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
}