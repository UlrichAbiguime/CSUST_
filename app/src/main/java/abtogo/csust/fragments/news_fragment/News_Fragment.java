package abtogo.csust.fragments.news_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abtogo.csust.R;

public class News_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_news_, container, false);

        return rootview;
    }

    public static Fragment newInstance() {
        News_Fragment fragment = new News_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
