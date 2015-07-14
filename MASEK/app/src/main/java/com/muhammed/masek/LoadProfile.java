package com.muhammed.masek;

import android.app.SearchManager;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class LoadProfile extends ActionBarActivity {
    public final static String TOTAL = "com.muhammed.masek.TOTAL";
    public final static String EXTRA_MESSAGE = "com.muhammed.masek";
    /** Called when the user clicks the Send button */
    public void profileAccount(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void HistoryButton(View view) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }

    public void Payment_Options(View view)
    {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

    public void Link_Button(View view)
    {
        Intent intent = new Intent(this, LinkedAccounts.class);
        startActivity(intent);
    }

    public void Delivery_Button(View view)
    {
        Intent intent = new Intent(this, Delivery.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_profile);

       final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        Button btnAlpha = (Button)findViewById(R.id.profile_button);

        btnAlpha.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
            }});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSearch() {
        startActivity(new Intent(SearchManager.INTENT_ACTION_GLOBAL_SEARCH));
    }

    private void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }

    public void checkout(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CheckoutItems.class);
        //String countermsg = "0";
        //intent.putExtra(TOTAL, countermsg);
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
