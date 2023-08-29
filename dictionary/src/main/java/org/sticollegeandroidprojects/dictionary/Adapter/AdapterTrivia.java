package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;
import org.sticollegeandroidprojects.dictionary.R;

import java.util.List;

public class AdapterTrivia extends RecyclerView.Adapter<AdapterTrivia.VHTrivia> {
    private static final String TAG = AdapterTrivia.class.getSimpleName();

    private final List<ETrivia> poList;
    private final OnTriviaClickListener listener;

    public interface OnTriviaClickListener{
        void OnClick(String args);
    }

    public AdapterTrivia(List<ETrivia> poList, OnTriviaClickListener listener) {
        this.poList = poList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VHTrivia onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_words, parent, false);
        return new VHTrivia(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHTrivia holder, int position) {
        ETrivia loDetail = poList.get(position);
        holder.lblWord.setText(loDetail.getWordName());
        holder.itemView.setOnClickListener(v -> listener.OnClick(loDetail.getWordIDxx()));
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }

    public static class VHTrivia extends RecyclerView.ViewHolder{

        public TextView lblWord;

        public VHTrivia(@NonNull View itemView) {
            super(itemView);
            lblWord = itemView.findViewById(R.id.lblword);
        }
    }
}
