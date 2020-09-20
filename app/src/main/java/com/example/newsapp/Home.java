package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    NavigationView navigationView;

    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setItemIconTintList(null);
        drawerLayout = findViewById(R.id.drawer);

      //  actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




/*
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.facebookPage:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent facebook = new Intent(Home.this, Facebook.class);
                        startActivity(facebook);
                        break;

                    case R.id.instagramPage:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent instagram = new Intent(Home.this, Instagram.class);
                        startActivity(instagram);
                        break;

                    case R.id.nav_rate:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("market://details?id=" + getPackageName())));

                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                        }
                        break;

                    case R.id.nav_share:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent myIntent = new Intent(Intent.ACTION_SEND);
                        myIntent.setType("text/plain");
                        String shareBody = "Hindi Shayari = get all type of quotes \n" + "https://play.google.com/store/apps/details?id=com.click2code.rationcarddetailsjharkhand&hl=en";
                        String shareSub = "Your Subject Here";
                        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(myIntent, "Share using"));
                        break;

                    case R.id.nav_privacy_policy:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent privacy = new Intent(Home.this, PrivacyPolicy.class);
                        startActivity(privacy);
                        break;

                    case R.id.nav_terms_conditions:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent terms = new Intent(Home.this, TermsConditions.class);
                        startActivity(terms);
                        break;
                }
                return true;
            }
        });
        */

    }
}