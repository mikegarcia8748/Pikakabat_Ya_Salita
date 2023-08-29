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

import com.google.android.material.tabs.TabLayout;

import org.sticollegeandroidprojects.applicationdriver.Etc.Dialog.MessageBox;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_WordList;
import org.sticollegeandroidprojects.dictionary.Adapter.AdapterBookmark;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMBookmarks;

public class Fragment_Bookmarks extends Fragment {
    private static final String TAG = Fragment_Bookmarks.class.getSimpleName();

    private VMBookmarks mViewModel;

    private View view;
    private TabLayout tabLayout;
    private RecyclerView recyclerView;

    public static Fragment_Bookmarks newInstance() {
        return new Fragment_Bookmarks();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMBookmarks.class);
        view =  inflater.inflate(R.layout.fragment_bookmarks, container, false);

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
        mViewModel.GetBookmarkList(args).observe(requireActivity(), bookmarks -> {
            try{
                if(bookmarks.size() > 0) {
                    view.findViewById(R.id.lblNoRecord).setVisibility(View.GONE);
                    recyclerView.setVisibility(View.VISIBLE);
                    LinearLayoutManager loManager = new LinearLayoutManager(requireActivity());
                    loManager.setOrientation(RecyclerView.VERTICAL);
                    recyclerView.setLayoutManager(loManager);
                    recyclerView.setAdapter(new AdapterBookmark(bookmarks, new AdapterBookmark.OnWordClickListener() {
                        @Override
                        public void OnClick(String wordID) {
                            OpenDescription(args, wordID);
                        }

                        @Override
                        public void OnRemove(String wordID, String wordNM) {
                            MessageBox loDialog = new MessageBox(requireActivity());
                            loDialog.CreateDialog("Favorite", "Removed " + wordNM + " on your favorites?");
                            loDialog.setPositiveButton("Yes", dialog -> {
                                dialog.dismiss();
                                RemoveBookmark(wordID);
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
        mViewModel.SaveRecent(args, new VMBookmarks.OnSaveWordListener() {
            @Override
            public void OnSave(String args) {
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

    private void RemoveBookmark(String args){
        mViewModel.RemoveBookmark(args, new VMBookmarks.OnRemoveBookmarkListener() {
            @Override
            public void OnRemove(String args) {
                Log.d(TAG, "Bookmark removed successfully.");
            }

            @Override
            public void OnFailed(String message) {
                Log.e(TAG, message);
            }
        });
    }
}