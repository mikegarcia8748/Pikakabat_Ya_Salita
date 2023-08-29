package org.sticollegeandroidprojects.dictionary.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.sticollegeandroidprojects.applicationdriver.Etc.Dialog.MessageBox;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_WordList;
import org.sticollegeandroidprojects.dictionary.Adapter.AdapterRecent;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMRecent;

public class Fragment_RecentWords extends Fragment {
    private static final String TAG = Fragment_RecentWords.class.getSimpleName();

    private VMRecent mViewModel;

    private View view;

    private TabLayout tabLayout;
    private RecyclerView recyclerView;

    public static Fragment_RecentWords newInstance() {
        return new Fragment_RecentWords();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(requireActivity()).get(VMRecent.class);
        view = inflater.inflate(R.layout.fragment_recent_words, container, false);

        tabLayout = view.findViewById(R.id.tablayout);
        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager loLayout = new LinearLayoutManager(requireActivity());
        loLayout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(loLayout);

        tabLayout.addTab(tabLayout.newTab().setText("Pangasinan-English"));
        tabLayout.addTab(tabLayout.newTab().setText("English-Pangasinan"));

        InitializeList(0);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                InitializeList(tab.getPosition());
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

    private void InitializeList(int args){
        mViewModel.GetRecents(args).observe(getViewLifecycleOwner(), recentWords -> {
            try {
                if(recentWords.size() > 0) {
                    view.findViewById(R.id.lblNoRecord).setVisibility(View.GONE);
                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerView.setAdapter(new AdapterRecent(recentWords, new AdapterRecent.OnWordClickListener() {
                        @Override
                        public void OnClick(String wordID) {
                            OpenDescription(args, wordID);
                        }

                        @Override
                        public void OnRemove(String wordID, String wordNM) {
                            MessageBox loDialog = new MessageBox(requireActivity());
                            loDialog.CreateDialog("Recent Words", "Remove " + wordNM + " from recent?");
                            loDialog.setPositiveButton("Yes", dialog -> {
                                dialog.dismiss();
                                mViewModel.RemoveWord(wordID, new VMRecent.OnRemoveWordListener() {
                                    @Override
                                    public void OnRemoved(String args) {
                                        Toast.makeText(requireActivity(), "Word removed successfully", Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void OnFailed(String message) {
                                        Toast.makeText(requireActivity(), message, Toast.LENGTH_SHORT).show();
                                    }
                                });
                            });
                            loDialog.setNegativeButton("No", dialog -> dialog.dismiss());
                            loDialog.show();
                        }
                    }));
                } else {
                    view.findViewById(R.id.lblNoRecord).setVisibility(View.VISIBLE);
                    recyclerView.setVisibility(View.GONE);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    private void OpenDescription(int type, String args){
        mViewModel.SaveRecent(args, new VMRecent.OnSaveWordListener() {
            @Override
            public void OnSave(String result) {
                Intent loIntent = new Intent(requireActivity(), Activity_WordList.class);
                loIntent.putExtra("instance", type);
                startActivity(loIntent);
            }

            @Override
            public void OnFailed(String message) {
                Log.e(TAG, message);
            }
        });
    }
}