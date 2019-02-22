package com.pluto.bestfoods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class HomeActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;


    AdView mAdView;

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");


        mAdView = findViewById(R.id.banner);

        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);
////////////////////for InterstitialAd/////////////////
        mInterstitialAd = new InterstitialAd(this);


        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        textView1 = (TextView) findViewById(R.id.FruitsandBerries);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                    {

                        Intent intent = new Intent(HomeActivity.this,MainActivity1.class);
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


                        Intent intent  = new Intent(HomeActivity.this,MainActivity1.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity.this,MainActivity1.class);
                        startActivity(intent);

                    }
                });

            }

        });


        textView2 = (TextView) findViewById(R.id.NutsSeedsandPeanuts);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity.this,MainActivity2.class);
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


                        Intent intent  = new Intent(HomeActivity.this,MainActivity2.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity.this,MainActivity2.class);
                        startActivity(intent);

                    }
                });

            }

        });

        textView3 = (TextView) findViewById(R.id.Meats) ;

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity
                            .this,MainActivity3.class);

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


                        Intent intent  = new Intent(HomeActivity
                                .this,MainActivity3.class);

                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity.this,MainActivity3.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView4 = (TextView) findViewById(R.id.FishandSeafood);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity
                            .this,MainActivity4.class);

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


                        Intent intent  = new Intent(HomeActivity.this,MainActivity4.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity.this,MainActivity4.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView5 = (TextView) findViewById(R.id.Eggs);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity.this,MainActivity5.class);
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


                        Intent intent  = new Intent(HomeActivity
                                .this,MainActivity5.class);

                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity
                                .this,MainActivity5.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView6 = (TextView) findViewById(R.id.Vegetables);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity
                            .this,MainActivity6.class);

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


                        Intent intent  = new Intent(HomeActivity
                                .this,MainActivity6.class);

                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity
                                .this,MainActivity6.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView7= (TextView) findViewById(R.id.Grains);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity
                            .this,MainActivity7.class);
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


                        Intent intent  = new Intent(HomeActivity.this,MainActivity7.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity.this,MainActivity7.class);
                        startActivity(intent);

                    }
                });

            }

        });
        textView8 = (TextView) findViewById(R.id.FatsandOils);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {

                    mInterstitialAd.show();


                }else
                {

                    Intent intent = new Intent(HomeActivity
                            .this,MainActivity8.class);

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


                        Intent intent  = new Intent(HomeActivity
                                .this,MainActivity5.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onAdClosed() {

                        super.onAdClosed();


                        Intent intent = new Intent(HomeActivity
                                .this,MainActivity4.class);

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
