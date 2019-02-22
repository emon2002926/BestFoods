package com.pluto.bestfoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7;


    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_activity_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }
    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mShare:

                Intent i = new Intent(

                        android.content.Intent.ACTION_SEND);

                i.setType("text/plain");

                i.putExtra(

                        android.content.Intent.EXTRA_TEXT, "The string you want to share, which can include URLs");

                startActivity(Intent.createChooser(

                        i,

                        "Title of your share dialog"));

                break;

        }
        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);




        button1 = (Button) findViewById(R.id.Bell_Peppers);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6
                        .this,E4.class);

                startActivity(intent);
            }
        });
        button2 = (Button)findViewById(R.id.Broccoli);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6

                        .this,E5.class);

                startActivity(intent);
            }
        });
        button3=(Button)findViewById(R.id.Carrots);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6

                        .this,E6.class);

                startActivity(intent);
            }
        });
        button4 = (Button) findViewById(R.id.Cauliflower);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6

                        .this,Cauliflower.class);

                startActivity(intent);
            }
        });
        button5 = (Button)findViewById(R.id.Cucumber);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6

                        .this,Cucumber.class);

                startActivity(intent);
            }
        });
        button6 =(Button)findViewById(R.id.Kale);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6

                        .this,Kale.class);
                startActivity(intent);
            }
        });
        button7 = (Button) findViewById(R.id.Tomatos);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6.this,
                        Tomatoes.class);

                startActivity(intent);
            }
        });



    }
}
