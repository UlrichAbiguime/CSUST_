package abtogo.csust.fragments.circle_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abtogo.csust.R;

public class Circle_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_circle_, container, false);
        return rootview;
    }

    public static Fragment newInstance() {
        Circle_Fragment fragment = new Circle_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
