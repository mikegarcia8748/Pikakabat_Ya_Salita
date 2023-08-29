package com.example.pikakabatyasalitadictionary.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pikakabatyasalitadictionary.R;
import com.example.pikakabatyasalitadictionary.ViewModel.VMAbout;

public class Fragment_About extends Fragment {

    private VMAbout mViewModel;

    public static Fragment_About newInstance() {
        return new Fragment_About();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMAbout.class);
        return inflater.inflate(R.layout.fragment_about, container, false);
    }
}