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

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        //((ActionBarActivity)getActivity()).setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.my);
        toolbar.setTitle("MyTitle");
        //toolbar.inflateMenu(R.menu.my);
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.my, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    /* initBar{

        getToolBar().setNavigationIcon(R.drawable.ic_ab_up_normal);
        getToolBar().setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        getToolBar().getMenu().clear();
        getToolBar().inflateMenu(R.menu.mails);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.toolbar_action_search:
                        Flurry.sendMessageListActionSearch();
                        Intent in = new Intent(getActivity(), SearchActivity.class);
                        //TODO remove empty search
                        in.putExtra(SearchMailsFragment.EXTRA_SEARCH_QUERY,
                                new MailboxSearch(""));
                        startActivity(in);
                        return true;

                    case R.id.toolbar_action_new:
                        Flurry.sendMessageListActionNew();
                        startActivity(new Intent(getString(R.string.action_new_mail)).addCategory(Intent.CATEGORY_DEFAULT));
                        return true;
                }

                return false;
            }
        });

    }

    */
}
