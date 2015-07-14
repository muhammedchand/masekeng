package com.muhammed.masek;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class CheckoutItems extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent intent = getIntent();
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.TOTAL);
        //final TextView textViewToChange = (TextView) findViewById(R.id.total);//how to change actual content
        //textViewToChange.setText(message);

        setContentView(R.layout.activity_checkout_items);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        Button btnAlpha = (Button)findViewById(R.id.checkout_button);
        Button btnAlpha2= (Button)findViewById(R.id.purchase_cart);

        btnAlpha.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
            }
        });

        btnAlpha2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkout_items, menu);
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

    public void checkout(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CheckoutItems.class);
        startActivity(intent); //Should start the purchaseItemclass
    }

    public void profile(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, LoadProfile.class);
        startActivity(intent); //Should start the purchaseItemclass
    }

    public void home(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //Should start the purchaseItemclass
    }

    public void share(View view){
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Hey I'm using the SAyle app to find the trendiest South African clothes.See it,by it, share it!";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Found cool clothes using SAyle");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
