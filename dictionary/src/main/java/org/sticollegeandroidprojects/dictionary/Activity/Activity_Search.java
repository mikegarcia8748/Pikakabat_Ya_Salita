package org.sticollegeandroidprojects.dictionary.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;

import org.sticollegeandroidprojects.dictionary.Adapter.AdapterWords;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

public class Activity_Search extends AppCompatActivity {
    private static final String TAG = Activity_Search.class.getSimpleName();

    private VMWordList mViewModel;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private TextInputEditText txtSearch;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(Activity_Search.this).get(VMWordList.class);
        setContentView(R.layout.activity_search);
        InitWidgets();

        //parameter has been set to empty string in order to retrieve all values from database.
        //words retrieve will be use for searching using autocomplete textview.
        tabLayout.addTab(tabLayout.newTab().setText("Pangasinan - English"));
        tabLayout.addTab(tabLayout.newTab().setText("English - Pangasinan"));
        initWordList(0);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                initWordList(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void InitWidgets() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("List of Words");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = findViewById(R.id.tablayout);
        txtSearch = findViewById(R.id.txtSearch);
        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager loLayout = new LinearLayoutManager(Activity_Search.this);
        loLayout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(loLayout);
    }
    private void initWordList(int args){
        mViewModel.GetWordsList(args).observe(Activity_Search.this, eDictionaryWords -> {
            try{
                AdapterWords loAdapter = new AdapterWords(eDictionaryWords, args1 -> {
                    saveRecent(args1);
                    Intent loIntent = new Intent(Activity_Search.this, Activity_WordList.class);
                    loIntent.putExtra("sWordIDxx", args1);
                    loIntent.putExtra("instance", args);
                    startActivity(loIntent);
                });
                recyclerView.setAdapter(loAdapter);

                txtSearch.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        loAdapter.getSearchFilter().filter(s.toString());
                        loAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    private void saveRecent(String args){
        mViewModel.SaveRecent(args, new VMWordList.OnSaveWordListener() {
            @Override
            public void OnSave(String args) {
                Log.d(TAG, "a new recent has been saved/updated.");
            }

            @Override
            public void OnFailed(String message) {
                Log.e(TAG, "unable to save new recent search. " + message);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}