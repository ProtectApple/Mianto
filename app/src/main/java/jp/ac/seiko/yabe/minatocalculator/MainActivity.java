package jp.ac.seiko.yabe.minatocalculator;
//plz wait

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mButton[];

    int mId[] = {
            R.id.button2, R.id.button3, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button11, R.id.button12, R.id.button13, R.id.button17, R.id.button_clear, R.id.button_hiku, R.id.button_ikoolu, R.id.button_kakeru, R.id.button_purasu, R.id.button_waru, R.id.lnput, R.id.answer
    };
    //定義　
    private int PUSh_PLUS = 10;
    private int PUSH_MINUS = 11;
    private int PUSH_KAKERU = 12;
    private int PUSH_WARU = 13;
    private int PUSH_CLEAR = 14;
    private int PUSH_IKOULU = 15;
    private TextView mAnswer;
    private TextView mInput;

    private String[] answers = new String [4];

    //始まり
    private int Status = 0;

    private ArrayList<String> calcArray;
    private ArrayList<String> signArray;
    //終わり
     private int Final = 0;

    //Fuck
    //FUCK!!!!!!!!!!!!
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnswer = findViewById(R.id.answer);
        mInput= findViewById(R.id.lnput);
        mButton = new Button[mId.length];

        for (int i = 0; i < mId.length; i++) {
            mButton[i] = findViewById(mId[i]);
            mButton[i].setOnClickListener(this);
        }
        calcArray = new ArrayList<String>();
        signArray = new ArrayList<String>();
    }


    @Override
    public void onClick(View v) {
        //  判定　　
        for (int i = 0; i < mId.length; i++){
            if (v.equals(mButton[i])) {
                String nowValue = mAnswer.getText().toString();
                if (i == PUSH_CLEAR) {
                    mAnswer.setText("");
                    //進行度
                    calcArray.clear();
                    signArray.clear();
                    Status = PUSH_CLEAR;
                }

                else if (i == PUSh_PLUS && nowValue.length() > 0) {
                    calcArray.add(nowValue);
                    signArray.add("+");
                    Status = PUSh_PLUS;
                }
                else if (i == PUSH_MINUS && nowValue.length() > 0) {
                    calcArray.add(nowValue);
                    signArray.add("-");
                    Status = PUSH_MINUS;
                }
                else if (i == PUSH_KAKERU && nowValue.length() > 0) {
                    calcArray.add(nowValue);
                    signArray.add("×");
                    Status = PUSH_KAKERU;
                }
                else if (i == PUSH_WARU && nowValue.length() > 0) {
                    calcArray.add(nowValue);
                    signArray.add("÷");
                }
                else if (i == PUSH_IKOULU && nowValue.length() > 0) {
                    //To Do
                }
                else if (i < 10) {
                    nowValue = nowValue + i;
                    mAnswer.setText(nowValue);
                    Status = i;
                }
                break;
            }
        }

    }


}
