package com.muhammed.masek;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class History extends ActionBarActivity {
    public final static String TOTAL = "com.muhammed.masek.TOTAL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_history, menu);
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
        String countermsg = "0";
        intent.putExtra(TOTAL, countermsg);
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

}
