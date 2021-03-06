package com.example.fragment13072020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();

    }

    public void addAndroid(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,androidFragment,"androidfragment");
        fragmentTransaction.addToBackStack("androidstack");
        fragmentTransaction.commit();
    }

    public void addIos(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        IosFragment iosFragment = new IosFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,iosFragment);
        fragmentTransaction.addToBackStack("androidstack");
        fragmentTransaction.commit();
    }

    public void replaceAndroid(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,androidFragment);
        fragmentTransaction.commit();
    }

    public void replaceIos(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        IosFragment iosFragment = new IosFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,iosFragment);
        fragmentTransaction.commit();
    }

    public void removeAndroid(View view) {
        AndroidFragment androidFragment = (AndroidFragment) mFragmentManager.findFragmentByTag("androidfragment");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void popbackstack(View view) {
        mFragmentManager.popBackStack(2 , FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}