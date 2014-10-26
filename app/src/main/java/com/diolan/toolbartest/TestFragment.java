package com.diolan.toolbartest;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
//http://android-developers.blogspot.ru/2014/10/appcompat-v21-material-design-for-pre.html
public class TestFragment extends Fragment {

    public TestFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        /*((ActionBarActivity)getActivity()).setSupportActionBar(toolbar);*/
        toolbar.inflateMenu(R.menu.my);
        toolbar.setTitle("MyTitle");
        return rootView;
    }


/*
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.my, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
*/

}
