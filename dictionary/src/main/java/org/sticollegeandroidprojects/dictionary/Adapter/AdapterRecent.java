package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;
import org.sticollegeandroidprojects.dictionary.R;

import java.util.List;

public class AdapterRecent extends RecyclerView.Adapter<AdapterRecent.RecentVH> {
    private static final String TAG = AdapterRecent.class.getSimpleName();

    private final List<RWord.RecentWord> poList;
    private final OnWordClickListener mListener;

    public interface OnWordClickListener{
        void OnClick(String args);
        void OnRemove(String wordID, String wordNM);
    }

    public AdapterRecent(List<RWord.RecentWord> poList, OnWordClickListener listener) {
        this.poList = poList;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public RecentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_recent, parent, false);
        return new RecentVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentVH holder, int position) {
        RWord.RecentWord loWord = poList.get(position);
        holder.lblWord.setText(loWord.sWordName);
        holder.btnRemove.setOnClickListener(v -> mListener.OnRemove(loWord.sWordIDxx, loWord.sWordName));
        holder.itemView.setOnClickListener(v -> mListener.OnClick(loWord.sWordIDxx));
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }

    public static class RecentVH extends RecyclerView.ViewHolder{

        public TextView lblWord;
        public ImageButton btnRemove;

        public RecentVH(@NonNull View itemView) {
            super(itemView);
            lblWord = itemView.findViewById(R.id.lblword);
            btnRemove = itemView.findViewById(R.id.btnRemove);
        }
    }
}
