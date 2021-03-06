package com.jacksonw765.familyguysfx;

import android.net.Uri;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainTabs extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private AdView adview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tabs);

        //Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.

        try {
            mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

            // Set up the ViewPager with the sections adapter.
            mViewPager = findViewById(R.id.container);
            mViewPager.setAdapter(mSectionsPagerAdapter);

            TabLayout tabLayout = findViewById(R.id.tabs);

            mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

            adview = this.findViewById(R.id.adView);
            AdRequest request = new AdRequest.Builder()
                    .setGender(AdRequest.GENDER_MALE)
                    .setIsDesignedForFamilies(false)
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adview.loadAd(request);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "An unknown error occered", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * A placeholder fragment containing a simple view.
     */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

            try {
                switch (position) {
                    case 0:
                        return new Home();
                    case 1:
                        return new Bruce();
                    case 2:
                        return new Brian();
                    case 3:
                        return new Chris();
                    case 4:
                        return new Cleveland();
                    case 5:
                        return new Herbert();
                    case 6:
                        return new Lois();
                    case 7:
                        return new Mort();
                    case 8:
                        return new Peter();
                    case 9:
                        return new Quagmire();
                    case 10:
                        return new Stewie();
                    case 11:
                        return new Songs();
                    case 12:
                        return new Info();
                    case 13:
                        return new HiddenFragment();
                }
                return new HiddenFragment();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "Unable to switch tabs", Toast.LENGTH_SHORT).show();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 14;
        }
    }
}
