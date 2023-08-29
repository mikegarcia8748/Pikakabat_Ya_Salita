package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.dictionary.R;

public class AdapterDescriptionInfos extends RecyclerView.Adapter<AdapterDescriptionInfos.VHInfos> {

    private final String[] strings;

    public AdapterDescriptionInfos(String[] strings) {
        this.strings = strings;
    }

    @NonNull
    @Override
    public VHInfos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_description_infos, parent, false);
        return new VHInfos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHInfos holder, int position) {
        String lblInfo = strings[position];
        holder.lblInfo.setText(position + 1 + ". " + lblInfo);
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public static class VHInfos extends RecyclerView.ViewHolder{

        public TextView lblInfo;

        public VHInfos(@NonNull View itemView) {
            super(itemView);
            lblInfo = itemView.findViewById(R.id.lblWordSmpl);
        }
    }
}
