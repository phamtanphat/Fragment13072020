package com.example.fragment13072020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Random;

public class AndroidFragment extends Fragment {

    RelativeLayout mRelativeLayout;
    Random mRandom;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_android, container, false);
        mRelativeLayout = v.findViewById(R.id.relativeLayoutAndroid);
        mRandom = new Random();
        mRelativeLayout.setBackgroundColor(Color.rgb(mRandom.nextInt(255),mRandom.nextInt(255),mRandom.nextInt(255)));
        return v;
    }
}