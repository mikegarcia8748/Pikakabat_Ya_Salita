package org.sticollegeandroidprojects.dictionary.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;

import org.sticollegeandroidprojects.dictionary.Activity.Activity_WordList;
import org.sticollegeandroidprojects.dictionary.Adapter.AdapterWords;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

import java.util.ArrayList;

public class Fragment_WordList extends Fragment {
    private static final String TAG = Fragment_WordList.class.getSimpleName();

    private VMWordList mViewModel;

    private View view;
    private TabLayout tabLayout;
    private TextInputEditText txtSearch;
    private RecyclerView recyclerView;

    public static Fragment_WordList newInstance() {
        return new Fragment_WordList();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(requireActivity()).get(VMWordList.class);
        view = inflater.inflate(R.layout.fragment_word_list, container, false);

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

        return view;
    }

    private void InitWidgets() {
        tabLayout = view.findViewById(R.id.tablayout);
        txtSearch = view.findViewById(R.id.txtSearch);
        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager loLayout = new LinearLayoutManager(requireActivity());
        loLayout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(loLayout);
    }

    private void initWordList(int args){
        mViewModel.GetWordsList(args).observe(requireActivity(), eDictionaryWords -> {
            try{
                AdapterWords loAdapter = new AdapterWords(eDictionaryWords, args1 -> {
                    saveRecent(args1);
                    Intent loIntent = new Intent(requireActivity(), Activity_WordList.class);
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
}