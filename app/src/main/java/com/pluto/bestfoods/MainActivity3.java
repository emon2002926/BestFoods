package com.pluto.bestfoods;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity3 extends AppCompatActivity {



    TextView textView1,textView2,textView3;
    InterstitialAd mInterstitialAd;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());




        textView1 = (TextView) findViewById(R.id.LeanBeef);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity3.this,MainActivity1.class);
                    startActivity(intent);

                }

                mInterstitialAd.setAdListener(new AdListener(){


                    @Override
                    public void onAdLoaded() {

                        super.onAdLoaded();


                        mInterstitialAd.show();

                    }

                    @Override
                    public void onAdFailedToLoad(int i) {

                        super.onAdFailedToLoad(i);


                        Intent intent  = new Intent(MainActivity3.this,MainActivity1.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity3.this,MainActivity1.class);
                        startActivity(intent);

                    }
                });

            }

        });

        textView2 = (TextView) findViewById(R.id.Chicken_Breasts);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity3.this,MainActivity1.class);
                    startActivity(intent);

                }

                mInterstitialAd.setAdListener(new AdListener(){


                    @Override
                    public void onAdLoaded() {

                        super.onAdLoaded();


                        mInterstitialAd.show();

                    }

                    @Override
                    public void onAdFailedToLoad(int i) {

                        super.onAdFailedToLoad(i);


                        Intent intent  = new Intent(MainActivity3.this,MainActivity1.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity3.this,MainActivity1.class);
                        startActivity(intent);

                    }
                });

            }

        });

        textView3= (TextView) findViewById(R.id.Lamb);

        textView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3

                        .this,D3.class);

                startActivity(intent);
            }
        });

    }



    //////////////////////for share system///////////////////////////////
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


}
