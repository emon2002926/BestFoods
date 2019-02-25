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
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity1 extends AppCompatActivity {


    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    AdView mAdView;

    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        mInterstitialAd = new InterstitialAd(this);


        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView1 = (TextView) findViewById(R.id.a1but1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A1.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A1.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A1.class);
                        startActivity(intent);

                    }
                });

            }

        });

        textView2 = (TextView) findViewById(R.id.a1but2);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A2.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A2.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A2.class);
                        startActivity(intent);

                    }
                });

            }

        });

        textView3 = (TextView) findViewById(R.id.a1but3);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A3.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A3.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A3.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView4 = (TextView) findViewById(R.id.a1but4);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A4.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A4.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A4.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView5 = (TextView) findViewById(R.id.a1but5);

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A5.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A5.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A5.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView6 = (TextView) findViewById(R.id.a1but6);

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(MainActivity1.this,A6.class);
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


                        Intent intent  = new Intent(MainActivity1.this,A6.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(MainActivity1.this,A6.class);
                        startActivity(intent);

                    }
                });

            }

        });

    }

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



