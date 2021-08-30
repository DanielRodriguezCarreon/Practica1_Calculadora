package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Rodriguez Carreon Daniel 5IM9
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1,numero2,resultado;
    String operador;

    public void onClickButtonOne(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }
    public void onClickButtonTwo(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }
    public void onClickButtonThree(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }
    public void onClickButtonFour(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }
    public void onClickButtonFive(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }
    public void onClickButtonSix(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }
    public void onClickButtonSeven(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }
    public void onClickButtonEight(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }
    public void onClickButtonNine(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }
    public void onClickButtonZero(View miView){
        TextView tv= findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }
    public void onClickOperacionCapturaNum1(View miView){
        TextView tv= findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void onClickDel(View miView){
        TextView tv= findViewById(R.id.textView);
        tv.setText("");
    }
    public void onClickSuma(View miView){
        operador="+";
        onClickOperacionCapturaNum1(miView);
    }
    public void onClickResta(View miView){
        operador="-";
        onClickOperacionCapturaNum1(miView);
    }
    public void onClickMultiplicacion(View miView){
        operador="*";
        onClickOperacionCapturaNum1(miView);
    }
    public void onClickDivision(View miView){
        operador="/";
        onClickOperacionCapturaNum1(miView);
    }
    public void onClickSin(View miView){
        operador="sin";
    }
    public void onClickCos(View miView){
        operador="cos";
    }
    public void onClickTan(View miView){
        operador="tan";
    }
    public void onClickLog10(View miView){
        operador="log10";
    }
    public void onClickRaiz(View miView){
        operador="raiz";
    }
    public void onClickIgual(View miView){
        TextView tv= findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());
        try{
            if(operador.equals("+")) {
                resultado = numero1+numero2;
            }else
            if(operador.equals("-")) {
                resultado = numero1-numero2;
            }else
            if(operador.equals("*")) {
                resultado = numero1*numero2;
            }else
            if(operador.equals("/")) {
                resultado = numero1/numero2;
            }else
            if(operador.equals("sin")) {
                resultado = Math.sin(numero2);
            }else
            if(operador.equals("cos")) {
                resultado = Math.cos(numero2);
            }else
            if(operador.equals("tan")) {
                resultado = Math.tan(numero2);
            }else
            if(operador.equals("log10")) {
                resultado = Math.log10(numero2);
            }else
            if(operador.equals("raiz")) {
                resultado = Math.sqrt(numero2);
            }

            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", Toast.LENGTH_SHORT).show();

        }
    }


}