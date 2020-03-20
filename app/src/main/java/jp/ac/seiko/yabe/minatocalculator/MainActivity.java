package jp.ac.seiko.yabe.minatocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mClear;
    private Button mtasu;
    private Button mhiku;
    private Button mkakeru;
    private Button mwaru;
    private Button mikoulu;
    private TextView mAnswer;
    private TextView mInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.button11);
        mButton2 = findViewById(R.id.button12);
        mButton3 = findViewById(R.id.button13);
        mButton4 = findViewById(R.id.button3);
        mButton5 = findViewById(R.id.button8);
        mButton6 = findViewById(R.id.button9);
        mButton7 = findViewById(R.id.button2);
        mButton8 = findViewById(R.id.button6);
        mButton9 = findViewById(R.id.button7);
        mClear = findViewById(R.id.button_clear);
        mtasu = findViewById(R.id.button_purasu);
        mhiku = findViewById(R.id.button_hiku);
        mkakeru = findViewById(R.id.button_kakeru);
        mwaru = findViewById(R.id.button_waru);
        mikoulu = findViewById(R.id.button_ikoolu);
        mAnswer = findViewById(R.id.answer);
        mInput= findViewById(R.id.lnput);
    }


}
