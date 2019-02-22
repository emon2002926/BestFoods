package com.pluto.bestfoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity2 extends AppCompatActivity {

    AdView adView;

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
        setContentView(R.layout.activity_main2);


        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");



    }

    public void C1(View view) {
        Intent intent = new Intent(MainActivity2
                .this,C1.class);

        startActivity(intent);
    }

        public void C2(View view) {
        Intent intent = new Intent(MainActivity2
                .this,C2.class);

        startActivity(intent);
        }

    public void C3(View view) {
        Intent intent = new Intent(MainActivity2
                .this,C3.class);

        startActivity(intent);
    }

    public void C4(View view) {
        Intent intent = new Intent(MainActivity2
                .this,C4.class);

        startActivity(intent);
    }

    public void C5(View view) {

        Intent intent = new Intent(MainActivity2
                .this,C5.class);

        startActivity(intent);
    }

    public void C6(View view) {
        Intent intent = new Intent(MainActivity2
                .this,C6.class);

        startActivity(intent);
    }



}
