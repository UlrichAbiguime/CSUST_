package abtogo.csust.fragments.activities_fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abtogo.csust.R;

public class Activites_Fragment extends Fragment {

    public static Fragment newInstance() {
        Activites_Fragment fragment = new Activites_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_activites_, container, false);
        // add a swipetab fragment.
        return rootview;
    }
}
