package com.example.myapplication;


import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winCount();
    }


    public void placeb00(View view) {
        if (countNumber % 2 == 0) {
            if (countNumber < 9 && (!wincheckX()) && (!winchecko()) && (countNumber%2 ==0)) {
                if (view == findViewById(R.id.b00)) {
                    Button btn = findViewById(R.id.b00);
                    if (((Button) view).getText().toString().equals("")) {

                            btn.setText(getResources().getString(R.string.x));

                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }

            }
        }
    }
        public void placeb01 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)){
                Button btn = findViewById(R.id.b01);
                if (((Button) view).getText().toString().equals("")) {

                    btn.setText(getResources().getString(R.string.x));
                    countNumber++;
                    surprise = 0;
                    winCheck();
                    if(!wincheckX()) {
                        computerTurn();
                    }
                }
            }
        }
        public void placeb02 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)){
                if (view == findViewById(R.id.b02)) {
                    Button btn = findViewById(R.id.b02);
                    if (((Button) view).getText().toString().equals("")) {

                        btn.setText(getResources().getString(R.string.x));
                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }
            }
        }
        public void placeb10 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)){
                if (view == findViewById(R.id.b10)) {
                    Button btn = findViewById(R.id.b10);
                    if (((Button) view).getText().toString().equals("")) {

                            btn.setText(getResources().getString(R.string.x));

                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }
            }
        }
        public void placeb11 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)) {
                if (view == findViewById(R.id.b11)) {
                    Button btn = findViewById(R.id.b11);
                    if (((Button) view).getText().toString().equals("")) {

                            btn.setText(getResources().getString(R.string.x));
                        }
                        countNumber++;
                        winCheck();
                        surprise = 0;
                    if(!wincheckX()) {
                        computerTurn();
                    }
                    }
                }
            }

        public void placeb12 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)) {
                if (view == findViewById(R.id.b12)) {
                    Button btn = findViewById(R.id.b12);
                    if (((Button) view).getText().toString().equals(""))

                        btn.setText(getResources().getString(R.string.x));


                    countNumber++;
                    winCheck();
                    surprise = 0;
                    if(!wincheckX()) {
                        computerTurn();
                    }
                }

                }
            }

        public void placeb20 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)) {
                if (view == findViewById(R.id.b20)) {
                    Button btn = findViewById(R.id.b20);
                    if (((Button) view).getText().toString().equals("")) {
                            btn.setText(getResources().getString(R.string.x));
                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }
            }
        }
        public void placeb21 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko())&& (countNumber%2 ==0)) {
                if (view == findViewById(R.id.b21)) {
                    Button btn = findViewById(R.id.b21);
                    if (((Button) view).getText().toString().equals("")) {

                        btn.setText(getResources().getString(R.string.x));
                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }
            }
        }
        public void placeb22 (View view){
            if (countNumber < 9 && (!wincheckX()) && (!winchecko()&& (countNumber%2 ==0)) ){
                if (view == findViewById(R.id.b22)) {
                    Button btn = findViewById(R.id.b22);
                    if (((Button) view).getText().toString().equals("")) {

                        btn.setText(getResources().getString(R.string.x));
                        countNumber++;
                        winCheck();
                        surprise = 0;
                        if(!wincheckX()) {
                            computerTurn();
                        }
                    }
                }
            }
        }


        public void computerTurn() {

            if (countNumber % 2 == 1 && countNumber < 9) {
                Button[][] buttons = new Button[3][3];
                buttons[0][0] = findViewById(R.id.b00);
                buttons[0][1] = findViewById(R.id.b01);
                buttons[0][2] = findViewById(R.id.b02);
                buttons[1][0] = findViewById(R.id.b10);
                buttons[1][1] = findViewById(R.id.b11);
                buttons[1][2] = findViewById(R.id.b12);
                buttons[2][0] = findViewById(R.id.b20);
                buttons[2][1] = findViewById(R.id.b21);
                buttons[2][2] = findViewById(R.id.b22);

                String[][] bt = new String[3][3];

                bt[0][0] = buttons[0][0].getText().toString();
                bt[0][1] = buttons[0][1].getText().toString();
                bt[0][2] = buttons[0][2].getText().toString();
                bt[1][0] = buttons[1][0].getText().toString();
                bt[1][1] = buttons[1][1].getText().toString();
                bt[1][2] = buttons[1][2].getText().toString();
                bt[2][0] = buttons[2][0].getText().toString();
                bt[2][1] = buttons[2][1].getText().toString();
                bt[2][2] = buttons[2][2].getText().toString();



//computer algorithms
            String x = getResources().getString(R.string.x);
            String empty = getResources().getString(R.string.defaultButton);


            if(bt[0][0].equals(bt[0][1]) && bt[0][0].equals(x) && bt[0][2].equals(empty)) {
    buttons[0][2].setText(getResources().getString(R.string.o));
            }
            else if(bt[1][0].equals(bt[1][1]) && bt[1][0].equals(x) && bt[1][2].equals(empty)) {
                    buttons[1][2].setText(getResources().getString(R.string.o));
                }
            else if(bt[2][0].equals(bt[2][1]) && bt[2][0].equals(x) && bt[2][2].equals(empty)) {
                    buttons[2][2].setText(getResources().getString(R.string.o));
                }
            else if (bt[0][0].equals(bt[1][0]) && bt[1][0].equals(x) && bt[2][0].equals(empty)){
                buttons[2][0].setText(getResources().getString(R.string.o));
            }
            else if (bt[0][1].equals(bt[1][1]) && bt[1][1].equals(x) && bt[1][2].equals(empty)){
                buttons[2][0].setText(getResources().getString(R.string.o));
            }
            else if (bt[0][2].equals(bt[1][2]) && bt[1][2].equals(x) && bt[2][2].equals(empty)){
                buttons[2][2].setText(getResources().getString(R.string.o));
            }
 //random
              else {
                int column = (int) (Math.random() * ((2) + 1));
                int row = (int) (Math.random() * ((2) + 1));

                Button button = buttons[column][row];
                String buttonText = bt[column][row];


                if (bt[column][row].equals("")) {
                    button.setText(getResources().getString(R.string.o));
                } else {
                    while (!buttonText.equals("")) {
                        column = (int) (Math.random() * ((2) + 1));
                        row = (int) (Math.random() * ((2) + 1));

                        button = buttons[column][row];
                        buttonText = bt[column][row];
                    }
                    button.setText(getResources().getString(R.string.o));
                }

            }
                wincheckX();
                winchecko();
                winCheck();
                countNumber++;
            }










    }









        public void winCheck(){

        Vibrator myVib = (Vibrator) getSystemService(VIBRATOR_SERVICE);if (wincheckX()) {
              Toast.makeText(MainActivity.this, getResources().getString(R.string.winX), Toast.LENGTH_SHORT).show();
              myVib.vibrate(50);
              winX++;
              winCount();
          } else if (winchecko()) {
              Toast.makeText(MainActivity.this, getResources().getString(R.string.winO), Toast.LENGTH_SHORT).show();
              myVib.vibrate(50);
              winO++;
              winCount();
            surprise = 0;
          }
      }


    private int countNumber;

    {
        countNumber = 0;
    }
    private boolean wincheckX() {
        Button b00 = findViewById(R.id.b00);
        Button b01 = findViewById(R.id.b01);
        Button b02 = findViewById(R.id.b02);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b20 = findViewById(R.id.b20);
        Button b21 = findViewById(R.id.b21);
        Button b22 = findViewById(R.id.b22);
        String bt00 = b00.getText().toString();
        String bt01 = b01.getText().toString();
        String bt02 = b02.getText().toString();
        String bt10 = b10.getText().toString();
        String bt11 = b11.getText().toString();

        String bt12 = b12.getText().toString();
        String bt20 = b20.getText().toString();
        String bt21 = b21.getText().toString();
        String bt22 = b22.getText().toString();

        if (bt00.equals(bt01) && bt01.equals(bt02) && bt00.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt10.equals(bt11) && bt11.equals(bt02) && bt10.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt20.equals(bt21) && bt21.equals(bt22) && bt20.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt00.equals(bt10) && bt10.equals(bt20) && bt00.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt01.equals(bt11) && bt11.equals(bt21) && bt01.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt02.equals(bt12) && bt12.equals(bt22) && bt02.equals(getResources().getString(R.string.x))) {
            return true;
        } else if (bt00.equals(bt11) && bt11.equals(bt22) && bt00.equals(getResources().getString(R.string.x))) {
            return true;
        } else
            return bt02.equals(bt11) && bt11.equals(bt20) && bt20.equals(getResources().getString(R.string.x));
    }


private int winO;
    {winO = 0;}
private int winX;
    {winX = 0;}

private boolean winchecko(){
    Button b00 = findViewById(R.id.b00);
    Button b01 = findViewById(R.id.b01);
    Button b02 = findViewById(R.id.b02);
    Button b10 = findViewById(R.id.b10);
    Button b11 = findViewById(R.id.b11);
    Button b12 = findViewById(R.id.b12);
    Button b20 = findViewById(R.id.b20);
    Button b21 = findViewById(R.id.b21);
    Button b22 = findViewById(R.id.b22);
    String bt00 = b00.getText().toString();
    String bt01 = b01.getText().toString();
    String bt02 = b02.getText().toString();
    String bt10 = b10.getText().toString();
    String bt11 = b11.getText().toString();

    String bt12 = b12.getText().toString();
    String bt20 = b20.getText().toString();
    String bt21 = b21.getText().toString();
    String bt22 = b22.getText().toString();

    if (bt00.equals(bt01) && bt01.equals(bt02) && bt00.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt10.equals(bt11) && bt11.equals(bt02) && bt10.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt20.equals(bt21) && bt21.equals(bt22) && bt20.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt00.equals(bt10) && bt10.equals(bt20) && bt00.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt01.equals(bt11) && bt11.equals(bt21) && bt01.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt02.equals(bt12) && bt12.equals(bt22) && bt02.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else if (bt00.equals(bt11) && bt11.equals(bt22) && bt00.equals(getResources().getString(R.string.o))) {
        return true;
    }
    else
        return bt02.equals(bt11) && bt11.equals(bt20) && bt20.equals(getResources().getString(R.string.o));


}
public void reset(View view) {
    Button b00 = findViewById(R.id.b00);
    Button b01 = findViewById(R.id.b01);
    Button b02 = findViewById(R.id.b02);
    Button b10 = findViewById(R.id.b10);
    Button b11 = findViewById(R.id.b11);
    Button b12 = findViewById(R.id.b12);
    Button b20 = findViewById(R.id.b20);
    Button b21 = findViewById(R.id.b21);
    Button b22 = findViewById(R.id.b22);
    b00.setText(getResources().getString(R.string.defaultButton));
    b01.setText(getResources().getString(R.string.defaultButton));
    b02.setText(getResources().getString(R.string.defaultButton));
    b10.setText(getResources().getString(R.string.defaultButton));
    b11.setText(getResources().getString(R.string.defaultButton));
    b12.setText(getResources().getString(R.string.defaultButton));
    b20.setText(getResources().getString(R.string.defaultButton));
    b21.setText(getResources().getString(R.string.defaultButton));
    b22.setText(getResources().getString(R.string.defaultButton));
    countNumber = 0;

    surprise++;

    if (surprise ==  7){
        Toast.makeText(MainActivity.this,getResources().getString(R.string.surprise), Toast.LENGTH_LONG).show();
    }

}
private void winCount(){
    TextView x = findViewById(R.id.textView2);
    TextView o = findViewById(R.id.textView3);
    x.setText(getResources().getString(R.string.scoreX, winX));
    o.setText(getResources().getString(R.string.scoreO, winO));
}
private int surprise;
    {
        surprise = 0;
    }


}

