package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.dictionary.R;

import java.util.List;

public class AdapterBookmark extends RecyclerView.Adapter<AdapterBookmark.BookmarkVH> {
    private static final String TAG = AdapterBookmark.class.getSimpleName();

    private final List<BWord.Bookmark> poList;
    private final OnWordClickListener mListener;

    public interface OnWordClickListener{
        void OnClick(String args);
        void OnRemove(String wordID, String wordNM);
    }

    public AdapterBookmark(List<BWord.Bookmark> poList, OnWordClickListener listener) {
        this.poList = poList;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public BookmarkVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_bookmark, parent, false);
        return new BookmarkVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkVH holder, int position) {
        BWord.Bookmark loWord = poList.get(position);
        holder.lblWord.setText(loWord.sWordName);
        holder.itemView.setOnClickListener(v -> mListener.OnClick(loWord.sWordIDxx));
        holder.btnRemove.setOnClickListener(v -> mListener.OnRemove(loWord.sWordIDxx, loWord.sWordName));
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }

    public static class BookmarkVH extends RecyclerView.ViewHolder{

        public TextView lblWord;
        public ImageButton btnRemove;

        public BookmarkVH(@NonNull View itemView) {
            super(itemView);
            lblWord = itemView.findViewById(R.id.lblword);
            btnRemove = itemView.findViewById(R.id.btnRemove);
        }
    }
}
