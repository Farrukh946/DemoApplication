package com.farrukhworkstation.demoapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;

import com.farrukhworkstation.demoapplication.fragments.HomeFragment;

import java.util.Stack;

public class SplashActivity extends Activity {
    public Stack<Fragment> fragmentsBackStack;
    public FragmentManager fm;
    FragmentTransaction fmt;
    public boolean isBottomUp = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        fragmentsBackStack = new Stack<Fragment>();
        fm = getFragmentManager();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                addFragment(new HomeFragment());
            }
        }, 100);
    }

    public void addFragment(Fragment fr) {
        fragmentsBackStack.add(fr);
        setFragment(fr);
    }

    public void setFragment(Fragment fr) {
        fmt = fm.beginTransaction();
        fmt.replace(R.id.fragmentContainer, fr);
        fmt.commit();
    }

    public void callBackStack() {
        fragmentsBackStack.remove(fragmentsBackStack.size() - 1);
        setFragment(fragmentsBackStack.get(fragmentsBackStack.size() - 1));
    }

    @Override
    public void onBackPressed() {
        if (fragmentsBackStack.size() > 1)
            callBackStack();
        else
            super.onBackPressed();
    }
}