package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.dictionary.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterWords extends RecyclerView.Adapter<AdapterWords.WordVH> {
    private static final String TAG = AdapterWords.class.getSimpleName();

    private final List<EDictionaryWords> poList;
    private List<EDictionaryWords> poFilter;
    private final OnWordClickListener mListener;

    private final SearchFilter poSearch;

    public interface OnWordClickListener{
        void OnClick(String args);
    }

    public AdapterWords(List<EDictionaryWords> poList, OnWordClickListener listener) {
        this.poList = poList;
        this.poFilter = poList;
        this.mListener = listener;
        this.poSearch = new SearchFilter(this);
    }

    @NonNull
    @Override
    public WordVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_words, parent, false);
        return new WordVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordVH holder, int position) {
        EDictionaryWords loWord = poFilter.get(position);
        holder.lblWord.setText(loWord.getWordName());
        holder.itemView.setOnClickListener(v -> mListener.OnClick(loWord.getWordIDxx()));
    }

    @Override
    public int getItemCount() {
        return poFilter.size();
    }

    public SearchFilter getSearchFilter(){
        return poSearch;
    }

    public static class WordVH extends RecyclerView.ViewHolder{

        public TextView lblWord;

        public WordVH(@NonNull View itemView) {
            super(itemView);
            lblWord = itemView.findViewById(R.id.lblword);
        }
    }

    public class SearchFilter extends Filter{

        private final AdapterWords poAdapter;

        public SearchFilter(AdapterWords poAdapter) {
            super();
            this.poAdapter = poAdapter;
        }

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            final FilterResults results = new FilterResults();
            if(constraint.length() == 0){
                poFilter = poList;
            } else {
                List<EDictionaryWords> filterSearch = new ArrayList<>();
                for(EDictionaryWords loWord : poList){
                    String lsClientNm = loWord.getWordName().toLowerCase();
                    if(lsClientNm.contains(constraint.toString().toLowerCase())){
                        filterSearch.add(loWord);
                    }
                }
                poFilter = filterSearch;
            }

            results.values = poFilter;
            results.count = poFilter.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            poAdapter.poFilter = (List<EDictionaryWords>) results.values;
            this.poAdapter.notifyDataSetChanged();
        }
    }
}
