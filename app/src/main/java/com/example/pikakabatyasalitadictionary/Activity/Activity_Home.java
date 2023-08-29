package com.example.pikakabatyasalitadictionary.Activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import com.example.pikakabatyasalitadictionary.R;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pikakabatyasalitadictionary.databinding.ActivityHomeBinding;

import org.sticollegeandroidprojects.applicationdriver.Etc.Dialog.MessageBox;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_Search;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_WordList;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_Trivia;


public class Activity_Home extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarActivityHome.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.nav_recent,
                R.id.nav_bookmark,
                R.id.nav_about)
                .setOpenableLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_activity_home);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.getMenu().findItem(R.id.nav_trivia).setOnMenuItemClickListener(item -> {
            startActivity(new Intent(Activity_Home.this, Activity_Trivia.class));
            return false;
        });

        navigationView.getMenu().findItem(R.id.nav_search).setOnMenuItemClickListener(item -> {
            Intent loIntent = new Intent(Activity_Home.this, Activity_Search.class);
            startActivity(loIntent);
            return false;
        });

        navigationView.getMenu().findItem(R.id.nav_pang2eng).setOnMenuItemClickListener(item -> {
            Intent loIntent = new Intent(Activity_Home.this, Activity_WordList.class);
            loIntent.putExtra("instance", 0);
            startActivity(loIntent);
            return false;
        });

        navigationView.getMenu().findItem(R.id.nav_eng2pang).setOnMenuItemClickListener(item -> {
            Intent loIntent = new Intent(Activity_Home.this, Activity_WordList.class);
            loIntent.putExtra("instance", 1);
            startActivity(loIntent);
            return false;
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_activity_home);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        MessageBox poDialog = new MessageBox(Activity_Home.this);
        poDialog.CreateDialog("Exit App?", "Are you sure you want to exit dictionary?");
        poDialog.setPositiveButton("Yes", new MessageBox.OnDialogButtonClickListener() {
            @Override
            public void OnClick(AlertDialog dialog) {
                dialog.dismiss();
                finish();
            }
        });
        poDialog.setNegativeButton("No", new MessageBox.OnDialogButtonClickListener() {
            @Override
            public void OnClick(AlertDialog dialog) {
                dialog.dismiss();
            }
        });
        poDialog.show();
    }
}