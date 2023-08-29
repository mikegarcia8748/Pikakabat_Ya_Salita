package org.sticollegeandroidprojects.dictionary.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import org.sticollegeandroidprojects.dictionary.Adapter.AdapterTrivia;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMTrivia;

public class Activity_MoreTrivia extends AppCompatActivity {

    private VMTrivia mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(Activity_MoreTrivia.this).get(VMTrivia.class);
        setContentView(R.layout.activity_more_trivia);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Trivia");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager loLayout = new LinearLayoutManager(Activity_MoreTrivia.this);
        loLayout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(loLayout);
        mViewModel.GetTriviaList().observe(Activity_MoreTrivia.this, trivia -> {
            try{
                recyclerView.setAdapter(new AdapterTrivia(trivia, args -> {
                    Intent loIntent = new Intent(Activity_MoreTrivia.this, Activity_Trivia.class);
                    loIntent.putExtra("sWordIDxx", args);
                    startActivity(loIntent);
                    finish();
                }));
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}