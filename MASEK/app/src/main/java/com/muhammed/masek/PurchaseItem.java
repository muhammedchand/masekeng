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


public class PurchaseItem extends ActionBarActivity {
    static int counter =0;
    public final static String TOTAL = "com.muhammed.masek.TOTAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_item);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        Button btnAlpha = (Button)findViewById(R.id.add);
        Button btnAlpha1 = (Button)findViewById(R.id.add1);
        Button btnAlpha2 = (Button)findViewById(R.id.add2);

        btnAlpha.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
            }
        });
        btnAlpha1.setOnClickListener(new Button.OnClickListener() {
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

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_purchase_item, menu);
        return true;
    }*/

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
       // String countermsg = String.valueOf(counter);
       // intent.putExtra(TOTAL, countermsg);
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

    public void addToCart(View view){

        counter = counter + 1000;
    }

}
