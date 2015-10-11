package com.example.navigator.chandlerfoodbank;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;


public class AppFragmentPage extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().add(R.id.menuContainer,new MenuFragment()).commit();

        }
    }
    public void onBackPressed()
    {
        moveTaskToBack(true);
    }

}
