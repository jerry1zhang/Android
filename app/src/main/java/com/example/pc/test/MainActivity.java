package com.example.pc.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText display;
    private Button jia;
    private Button jian;
    private Button cheng;
    private Button chu;
    private Button clear;
    private int v1 = 0;
    private int v2 = 0;
    private int v3 = 0;
    private int vz = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (EditText) findViewById(R.id.display1);
        display.setText("");
        jia = (Button)findViewById(R.id.jia);
        jian = (Button)findViewById(R.id.jian);
        cheng = (Button)findViewById(R.id.cheng);
        chu = (Button)findViewById(R.id.chu);
        clear = (Button)findViewById(R.id.C);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    public void jiafa(View v){}
    public void jianfa(View v){}
    public void chengfa(View v){}
    public void chufa(View v){}
    public void dengyu(View v){}
    public void clear(View v){
        v1 = 0;
        v2 = 0;
        v3 = 0;
        display.setText("");
    }
    public void number(View v){
        vz = 0;
        switch (v.getId()){
            case R.id.one :
                if(v3!=0){
                    v3=v1;
                    v2=1;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 1;
                    vz = 1;
                }else if (v2==0){
                    v2 = 1;
                    vz = 2;
                }
                display.setText(display.getText()+"1");
                break;
            case R.id.two :
                if(v3!=0){
                    v3=v1;
                    v2=2;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 2;
                    vz = 1;
                }else if (v2==0){
                    v2 = 2;
                    vz = 2;
                }
                display.setText(display.getText()+"2");
                break;
            case R.id.three :
                if(v3!=0){
                    v3=v1;
                    v2=3;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 3;
                    vz = 1;
                }else if (v2==0){
                    v2 = 3;
                    vz = 2;
                }
                display.setText(display.getText()+"3");
                break;
            case R.id.four :
                if(v3!=0){
                    v3=v1;
                    v2=4;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 4;
                    vz = 1;
                }else if (v2==0){
                    v2 = 4;
                    vz = 2;
                }
                display.setText(display.getText()+"4");
                break;
            case R.id.five :
                if(v3!=0){
                    v3=v1;
                    v2=5;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 5;
                    vz = 1;
                }else if (v2==0){
                    v2 = 5;
                    vz = 2;
                }
                display.setText(display.getText()+"5");
                break;
            case R.id.six :
                if(v3!=0){
                    v3=v1;
                    v2=6;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 6;
                    vz = 1;
                }else if (v2==0){
                    v2 = 6;
                    vz = 2;
                }
                display.setText(display.getText()+"6");
                break;
            case R.id.seven :
                if(v3!=0){
                    v3=v1;
                    v2=7;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 7;
                    vz = 1;
                }else if (v2==0){
                    v2 = 7;
                    vz = 2;
                }
                display.setText(display.getText()+"7");
                break;
            case R.id.eight :
                if(v3!=0){
                    v3=v1;
                    v2=8;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 8;
                    vz = 1;
                }else if (v2==0){
                    v2 = 8;
                    vz = 2;
                }
                display.setText(display.getText()+"8");
                break;
            case R.id.nine :
                if(v3!=0){
                    v3=v1;
                    v2=9;
                    vz = 2;
                }else if(v1==0&&v2==0){
                    v1 = 9;
                    vz = 1;
                }else if (v2==0){
                    v2 = 9;
                    vz = 2;
                }
                display.setText(display.getText()+"9");
                break;
            case R.id.zero :
                if (vz == 1){
                    v1 = v1 * 10;
                }else if(vz == 2){
                    v2 = v2 * 10;
                }else{
                    clear(v);
                }
                break;
        }
    }
}
