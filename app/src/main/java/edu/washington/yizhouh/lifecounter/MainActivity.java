package edu.washington.yizhouh.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;




public class MainActivity extends ActionBarActivity{

    private static int[] counter = {20,20,20,20};
    private static int lose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text5 = (TextView) findViewById(R.id.textView5);
        if(lose > 0)
            text5.setText("Player "+ lose+" LOSES!");
        final LinearLayout bottomRow1 = (LinearLayout) findViewById(R.id.bottomrow1);
        final TextView text1 = (TextView) findViewById(R.id.textViewPlayer1);
        text1.setText("Player1  Life Total: " + counter[0]);
        Button button11 = (Button) findViewById(R.id.btn1player1);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[0]++;
                text1.setText("Player1  Life Total: " + counter[0]);
                bottomRow1.setVisibility(View.VISIBLE);
            }
        });

        Button button12 = (Button) findViewById(R.id.btn2player1);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[0]--;
                if(counter[0] >= 0){
                    text1.setText("Player1 Life Total: " + counter[0]);
                    bottomRow1.setVisibility(View.VISIBLE);
                }else{
                    text1.setText("Player 1 LOSES!");
                    text5.setText("Player 1 LOSES!");
                    lose = 1;
                };
            }
        });

        Button button13 = (Button) findViewById(R.id.btn3player1);
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[0] += 5;
                text1.setText("Player1 Life Total: " + counter[0]);
                bottomRow1.setVisibility(View.VISIBLE);
            }
        });

        Button button14 = (Button) findViewById(R.id.btn4player1);
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[0] -= 5;
                if(counter[0] >= 0){
                    text1.setText("Player1 Life Total: " + counter[0]);
                    bottomRow1.setVisibility(View.VISIBLE);
                }else{
                    text1.setText("Player 1 LOSES!");
                    text5.setText("Player 1 LOSES!");
                    lose = 1;
                }
            }
        });

        final LinearLayout bottomRow2 = (LinearLayout) findViewById(R.id.bottomrow2);
        final TextView text2 = (TextView) findViewById(R.id.textViewPlayer2);
        text2.setText("Player2  Life Total: " + counter[1]);
        Button button21 = (Button) findViewById(R.id.btn1player2);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[1]++;
                text2.setText("Player2  Life Total: " + counter[1]);
                bottomRow2.setVisibility(View.VISIBLE);
            }
        });

        Button button22 = (Button) findViewById(R.id.btn2player2);
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[1]--;
                if(counter[1] >= 0){
                    text2.setText("Player2 Life Total: " + counter[1]);
                    bottomRow2.setVisibility(View.VISIBLE);
                }else{
                    text2.setText("Player 2 LOSES!");
                    text5.setText("Player 2 LOSES!");
                    lose = 2;
                }
            }
        });

        Button button23 = (Button) findViewById(R.id.btn3player2);
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[1] += 5;
                text2.setText("Player2 Life Total: " + counter[1]);
                bottomRow2.setVisibility(View.VISIBLE);
            }
        });

        Button button24 = (Button) findViewById(R.id.btn4player2);
        button24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[1] -= 5;
                if(counter[1] >= 0){
                    text2.setText("Player2 Life Total: " + counter[1]);
                    bottomRow2.setVisibility(View.VISIBLE);
                }else{
                    text2.setText("Player 2 LOSES!");
                    text5.setText("Player 2 LOSES!");
                    lose = 2;
                }
            }
        });


        final LinearLayout bottomRow3 = (LinearLayout) findViewById(R.id.bottomrow3);
        final TextView text3 = (TextView) findViewById(R.id.textViewPlayer3);
        text3.setText("Player3  Life Total: " + counter[2]);
        Button button31 = (Button) findViewById(R.id.btn1player3);
        button31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[2]++;
                text3.setText("Player3  Life Total: " + counter[2]);
                bottomRow3.setVisibility(View.VISIBLE);
            }
        });

        Button button32 = (Button) findViewById(R.id.btn2player3);
        button32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[2]--;
                if(counter[2] >= 0){
                    text3.setText("Player3 Life Total: " + counter[2]);
                    bottomRow3.setVisibility(View.VISIBLE);
                }else{
                    text3.setText("Player 3 LOSES!");
                    text5.setText("Player 3 LOSES!");
                    lose = 3;
                }
            }
        });

        Button button33 = (Button) findViewById(R.id.btn3player3);
        button33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[2] += 5;
                text3.setText("Player3 Life Total: " + counter[2]);
                bottomRow3.setVisibility(View.VISIBLE);
            }
        });

        Button button34 = (Button) findViewById(R.id.btn4player3);
        button34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[2] -= 5;
                if(counter[2] >= 0){
                    text3.setText("Player3 Life Total: " + counter[2]);
                    bottomRow3.setVisibility(View.VISIBLE);
                }else{
                    text3.setText("Player 3 LOSES!");
                    text5.setText("Player 3 LOSES!");
                    lose = 3;
                }
            }
        });

        final LinearLayout bottomRow4 = (LinearLayout) findViewById(R.id.bottomrow4);
        final TextView text4 = (TextView) findViewById(R.id.textViewPlayer4);
        Button button41 = (Button) findViewById(R.id.btn1player4);
        text4.setText("Player4  Life Total: " + counter[3]);
        button41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[3]++;
                text4.setText("Player4  Life Total: " + counter[3]);
                bottomRow4.setVisibility(View.VISIBLE);
            }
        });

        Button button42 = (Button) findViewById(R.id.btn2player4);
        button42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[3]--;
                if(counter[3] >= 0){
                    text4.setText("Player4 Life Total: " + counter[3]);
                    bottomRow4.setVisibility(View.VISIBLE);
                }else{
                    text4.setText("Player 4 LOSES!");
                    text5.setText("Player 4 LOSES!");
                    lose = 4;

                }
            }
        });

        Button button43 = (Button) findViewById(R.id.btn3player4);
        button43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[3] += 5;
                text4.setText("Player4 Life Total: " + counter[3]);
                bottomRow4.setVisibility(View.VISIBLE);
            }
        });

        Button button44 = (Button) findViewById(R.id.btn4player4);
        button44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter[3] -= 5;
                if(counter[3] >= 0){
                    text4.setText("Player4 Life Total: " + counter[3]);
                    bottomRow4.setVisibility(View.VISIBLE);
                }else{
                    text4.setText("Player 4 LOSES!");
                    text5.setText("Player 4 LOSES!");
                    lose = 4;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

