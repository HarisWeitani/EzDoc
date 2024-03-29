package com.example.sirwarfox.easydoctor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int flag3 = 0, flag7 = 0, flag4 = 0, flag6 = 0;
    boolean flag33 = false, flag77 = false, flag44 = false, flag66 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);

        easterEgg();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

            if(flag33 == false && flag77 == false && flag44 == false && flag77 == false) {
                Toast.makeText(this, "DISCLAIMER : \nEVERYTHING IN THIS APP IS NOT TRUE\nI REPEAT IT IS NOT TRUE", Toast.LENGTH_LONG).show();
            }
            if(flag33 == false) {
                flag3++;
                Toast.makeText(this, "DISCLAIMER : \nEVERYTHING IN THIS APP IS NOT TRUE\nI REPEAT IT IS NOT", Toast.LENGTH_LONG).show();
            }
            if(flag33 == true && flag77 == false) {
                flag7++;
                Toast.makeText(this, "DISCLAIMER : \nEVERYTHING IN THIS APP IS NOT TRUE\nI REPEAT IT IS", Toast.LENGTH_LONG).show();
            }
            if(flag33 == true && flag77 == true && flag44 == false) {
                flag4++;
                Toast.makeText(this, "DISCLAIMER : \nEVERYTHING IN THIS APP IS NOT TRUE\nI REPEAT", Toast.LENGTH_LONG).show();
            }
            if(flag33 == true && flag77 == true && flag44 == true && flag66 == false) {
                flag6++;
                Toast.makeText(this, "DISCLAIMER : \nEVERYTHING IN THIS APP IS NOT TRUE\n", Toast.LENGTH_LONG).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Fragment fragment = null;

        int id = item.getItemId();

        easterEgg();

        if (id == R.id.nav_rumahsakit) {
            fragment = new RumahSakitFragment();
        } else if (id == R.id.nav_dokter) {
            if(flag3 == 3)
                flag33 = true;
            if(flag7 == 7)
                flag77 = true;
            if(flag4 == 4)
                flag44 = true;
            if(flag6 == 6)
                flag66 = true;
            fragment = new DokterFragment();
        } else if (id == R.id.nav_payYourBill) {
            fragment = new PayYourBillFragment();
        } else if (id == R.id.nav_premiumMember) {
            fragment = new PremiumMemberFragmednt();
        } else if (id == R.id.nav_forum) {
            fragment = new ForumFragment();
        } else if (id == R.id.nav_easterEgg) {
            fragment = new EasterEggFragment();
        }

        if(fragment != null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.screen_area, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void easterEgg(){
        //buat hide menu
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Menu menu = navigationView.getMenu();
        MenuItem target = menu.findItem(R.id.nav_easterEgg);
        if(flag3 == 3 && flag7 == 7 && flag4 == 4 && flag6 == 6)
            target.setVisible(true);
        else
            target.setVisible(false);

    }
}
