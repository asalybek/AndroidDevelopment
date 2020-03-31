package com.example.calculatorapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button zero,one,two,three,four,five,six,seven,eight,nine,plus,minus,multiply,divide,dot,equal,square,root,ntroot,percent,sinus,cosine,tangent,natlog,logar,power,factorial;
    private Button back,clear;
    private TextView txtScreen;
    double num1,num2;
    boolean plu,minu,mul,div,sqrt,powerTwo,lastDot,bntroot,bpercent,bsinus,bcosine,btangent,bnatlog,blogar,bpower,bfactorial,bback,bclear,bequal;
    private boolean lastNumeric,setError;
    String operations =" ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        dot = findViewById(R.id.dot);
        square = findViewById(R.id.square);
        root = findViewById(R.id.root);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        ntroot= findViewById(R.id.nthroot);
        percent = findViewById(R.id.percent);
        sinus = findViewById(R.id.sinus);
        cosine = findViewById(R.id.cosine);
        tangent = findViewById(R.id.tangent);
        natlog = findViewById(R.id.natlog);
        logar = findViewById(R.id.logar);
        power = findViewById(R.id.power);
        factorial = findViewById(R.id.factorial);
        txtScreen = findViewById(R.id.txtScreen);
        plu=false;minu = false;mul =false;div = false;
        sqrt=false;powerTwo=false;bntroot = false;
        bpercent=false;bsinus=false;bcosine=false;bback = false;
        btangent=false;bnatlog=false;blogar=false;bpower=false;bfactorial=false;

        if (savedInstanceState != null) {
            String displayText = savedInstanceState.getString("displayText");
            lastNumeric = savedInstanceState.getBoolean("lastNumeric");
            num1 = savedInstanceState.getDouble("num1");
            num2 = savedInstanceState.getDouble("num2");
            operations = savedInstanceState.getString("operations");
            txtScreen.setText(displayText);
        }
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                else {
                    txtScreen.setText(txtScreen.getText() + "0");
                    lastNumeric = true;

                }
            }

        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }

                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "1");
                lastNumeric = true;

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }
                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "2");
                lastNumeric = true;

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }

                else if(setError == true){
                    txtScreen.setText(null);
                    setError =false;
                }
                txtScreen.setText(txtScreen.getText() + "3");
                lastNumeric = true;


            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }

                else if(setError == true){
                    txtScreen.setText(null);
                    setError =false;
                }
                txtScreen.setText(txtScreen.getText() + "4");
                lastNumeric = true;

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }

                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "5");
                lastNumeric = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }
                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "6");
                lastNumeric = true;

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }
                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "7");
                lastNumeric = true;

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }
                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "8");
                lastNumeric = true;

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtScreen.getText().equals("0")){
                    txtScreen.setText(null);
                }
                else if(setError == true){
                    txtScreen.setText(null);
                    setError = false;
                }
                txtScreen.setText(txtScreen.getText() + "9");
                lastNumeric = true;}

        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lastDot) {
                    txtScreen.setText(txtScreen.getText() + ".");
                    lastDot = true;
                    lastNumeric = false;
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && plu==false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    plu = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="+";
                }
                else {
                    operations+="+";
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && minu==false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    minu = true;
                    lastNumeric =false;
                    lastDot = false;
                    txtScreen.setText(null);
                    operations+="-";
                }
                else {
                    operations+="-";
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && mul == false){
                    num1 = Double.parseDouble(txtScreen.getText() + " ");
                    mul = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="*";
                }
                else{
                    operations+="*";
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //operations+="/";
                if(lastNumeric && div == false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    div = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="/";
                }
                else {
                    operations+="/";
                }
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && sqrt==false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    sqrt = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="√";
                }
                else{
                    operations+="√";
                }
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && powerTwo==false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    powerTwo = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="2";
                }
                operations+="2";
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastNumeric && bpercent==false){
                    num1 = Double.parseDouble(txtScreen.getText() + "");
                    bpercent = true;
                    lastDot = false;
                    lastNumeric = false;
                    txtScreen.setText(null);
                    operations+="%";
                }
                else{
                    operations+="%";
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            NumberFormat nf = new DecimalFormat("#.######");

            @Override
            public void onClick(View v) {
                lastDot = false;
                if(txtScreen.getText().toString().equals("") || txtScreen.getText().toString().equals("Error")){
                    operations = "";
                }
                else if(operations.charAt(operations.length() -1) == '+' ){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format(num1+num2));
                    plu = false;

                }
                else if(operations.charAt(operations.length() -1) == '-') {
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format(num1-num2));
                    minu = false;
                }
                else if(operations.charAt(operations.length() -1) == '*'){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format(num1*num2));
                    mul = false;
                }
                else if(operations.charAt(operations.length() -1) == '/'){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    if(num2 == 0){
                        txtScreen.setText("Error");
                        setError = true;
                    }
                    else{
                        txtScreen.setText(nf.format(num1/num2));
                    }
                    div = false;
                }
                else if(operations.charAt(operations.length() -1) == '√'){
                    txtScreen.setText(nf.format(Math.sqrt(num1)));
                    sqrt = false;
                }
                else if(operations.charAt(operations.length() -1) == '2'){
                    txtScreen.setText(nf.format(Math.pow(num1,2)));
                    powerTwo = false;
                }
                else if(operations.charAt(operations.length() -1) == '!'){
                    if(num1 > 0 && num1 <= 104) {
                        txtScreen.setText(nf.format(factorial(num1)));
                    }
                    else{
                        txtScreen.setText("Error");
                        setError = true;
                    }
                    bfactorial = false;
                }
                else if(operations.charAt(operations.length() -1) == 'l'){
                   txtScreen.setText(nf.format(Math.log(num1)));
                        bnatlog = false;

                }
                else if(operations.charAt(operations.length() -1) == 'g'){
                    txtScreen.setText(nf.format(Math.log10(num1)));
                    blogar = false;
                }
                else if( operations.charAt(operations.length() -1) == 's'){
                    txtScreen.setText(nf.format(Math.sin(Math.toRadians(num1))));
                    bsinus = false;
                }
                else if(operations.charAt(operations.length() -1) == 't'){
                    txtScreen.setText(nf.format(Math.tan(Math.toRadians(num1))));
                    btangent = false;
                }
                else if(operations.charAt(operations.length() -1) == '%'){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format((num1*num2) / 100));
                    bpercent = false;
                }
                else if(operations.charAt(operations.length() -1) == '^'){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format(Math.pow(num1,num2)));
                    bpower = false;
                }
                else if(operations.charAt(operations.length() -1) == 'n'){
                    num2 = Double.parseDouble(txtScreen.getText() + "");
                    txtScreen.setText(nf.format(Math.pow(num1,1/num2)));
                    bntroot = false;
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtScreen.getText().equals("")) {
                    String s = txtScreen.getText().toString();
                    s = s.substring(0, s.length() - 1);
                    txtScreen.setText(s);
                    lastDot = false;
                    lastNumeric = false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("");
                lastDot = false;
                lastNumeric = false;
            }
        });
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bfactorial==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bfactorial = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="!";
                    }
                    else {
                        operations+="!";
                    }
                }
            });
            natlog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bnatlog==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bnatlog = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="l";
                    }
                    else{
                        operations+="l";
                    }
                    if(num1 == 0){
                        setError = true;
                        txtScreen.setText("Error");
                    }

                }
            });
            logar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bnatlog==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        blogar = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="g";
                    }
                    else{
                        operations+="g";
                    }
                }
            });
            sinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bsinus==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bsinus = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="s";
                    }else {
                        operations += "s";
                    }
                }
            });
            cosine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bcosine == false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bcosine = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="c";
                    }
                    else{
                        operations+="c";
                    }
                }
            });
            tangent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && btangent==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        btangent = true;
                        lastDot = false;
                        lastNumeric = false;
                        operations+="t";
                    }
                    else{
                        operations+="t";
                    }
                }
            });

            power.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bpower==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bpower = true;
                        lastDot = false;
                        lastNumeric = false;
                        txtScreen.setText(null);
                        operations+="^";
                    }
                    else {
                        operations += "^";
                    }
                }
            });
            ntroot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lastNumeric && bntroot ==false){
                        num1 = Double.parseDouble(txtScreen.getText() + "");
                        bntroot = true;
                        lastDot = false;
                        lastNumeric = false;
                        txtScreen.setText(null);
                        operations+="n";
                    }
                    else{
                        operations+="n";
                    }
                }
            });


        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putString("displayText", String.valueOf(txtScreen.getText()));
        savedInstanceState.putString("operations",operations);
        savedInstanceState.putBoolean("lastNumeric",true);
        savedInstanceState.putDouble("num1",num1);
        savedInstanceState.putDouble("num2",num2);
        super.onSaveInstanceState(savedInstanceState);
    }


    public long factorial(double number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}