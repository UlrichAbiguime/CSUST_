package abtogo.csust.fragments.forums_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abtogo.csust.R;

public class Forums_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_forums_, container, false);

        return rootview;
    }

    public static Fragment newInstance() {
        Forums_Fragment fragment = new Forums_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
