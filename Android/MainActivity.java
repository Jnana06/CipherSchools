package com.example.functional_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
 Button add,sub,mul,div,mod,clear,one,two,three,four,five,six,seven,eight,nine,zero,equal,cancel,point;
 TextView op;
 private String input,answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        op = (TextView) findViewById(R.id.op);
        clear=(Button)findViewById(R.id.clear);
        cancel=(Button)findViewById(R.id.cancel);
        point=(Button)findViewById(R.id.point);
    }
    public void ButtonClick(View view)
    {
    Button button=(Button) view;
    String data=button.getText().toString();
    switch (data)
    {
        case "AC":
            input="";
            break;
        case "x":
            input+="*";
            break;
        case "=":
            solve();
            answer=input;
            break;
        case "clear":
            String newT=input.substring(0,input.length()-1);
            input=newT;
            break;
        default:
            if(input==null)
            {
                input="";
            }
            if(data.equals("+")||data.equals("-")||data.equals("*")||data.equals("/")||data.equals("%"))
            {
                solve();
            }
            input+=data;
    }
    op.setText(input);
    }
    private void solve(){
        if(input.split("\\*").length==2)
        {
            String number[]=input.split("\\*");
            try{
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }
            catch(Exception e)
            {
                //error
        }
        }
        else if(input.split("/").length==2)
        {
            String number[]=input.split("/");
            try{
                double div=Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }
            catch(Exception e)
            {
                //error
            }
        }
        else if(input.split("%").length==2)
        {
            String number[]=input.split("%");
            try{
                double mod=Double.parseDouble(number[0])%Double.parseDouble(number[1]);
                input=mod+"";
            }
            catch(Exception e)
            {
                //error
            }
        }
        else if(input.split("\\+").length==2)
        {
            String number[]=input.split("\\+");
            try{
                double add=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=add+"";
            }
            catch(Exception e)
            {
                //error
            }
        }
        else if(input.split("-").length>1)
        {
            String number[]=input.split("-");
            if(number[0]=="" && number.length==2)
            {
                number[0]=0+"";
            }
            try{
                double sub=0;
                if(number.length==2){
                    sub=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                }
                else if(number.length==3)
                {
                    sub=Double.parseDouble(number[1])-Double.parseDouble(number[2]);
                }
                input=sub+"";
            }
            catch(Exception e)
            {
                //error
            }
        }
        String n[]=input.split("\\.");
        if(n.length>1)
        {
            if (n[1].equals("0"))
            {
                input=n[0];
            }
        }
        op.setText(input);
    }
}