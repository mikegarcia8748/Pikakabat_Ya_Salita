package org.sticollegeandroidprojects.dictionary.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMTrivia;

public class Activity_Trivia extends AppCompatActivity {

    private VMTrivia mViewModel;

   private AppCompatImageView imgTrivia;
   private TextView lblWord, lblInfo;
   private MaterialButton btnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(Activity_Trivia.this).get(VMTrivia.class);
        setContentView(R.layout.activity_trivia);

        imgTrivia = findViewById(R.id.img_header);
        lblWord = findViewById(R.id.triviaWord);
        lblInfo = findViewById(R.id.lblTriviaInfo);
        btnMore = findViewById(R.id.btnMore);

        if(!getIntent().hasExtra("sWordIDxx")){
            mViewModel.GetRandomTrivia().observe(Activity_Trivia.this, trivia -> {
                try{
                    Picasso.get().load(trivia.getImgLinkx()).placeholder(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_image_not_supported)
                            .error(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_broken_image).into(imgTrivia);
                    lblWord.setText(trivia.getWordName());
                    lblInfo.setText(trivia.getInfoxxxx());
                } catch (Exception e){
                    e.printStackTrace();
                }
            });
        } else {
            String lsWordID = getIntent().getStringExtra("sWordIDxx");

            mViewModel.GetTriviaDetail(lsWordID).observe(Activity_Trivia.this, trivia -> {
                try {
                    Picasso.get().load(trivia.getImgLinkx()).placeholder(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_image_not_supported)
                            .error(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_broken_image).into(imgTrivia);
                    lblWord.setText(trivia.getWordName());
                    lblInfo.setText(trivia.getInfoxxxx());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        btnMore.setOnClickListener(v -> {
            startActivity(new Intent(Activity_Trivia.this, Activity_MoreTrivia.class));
            finish();
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