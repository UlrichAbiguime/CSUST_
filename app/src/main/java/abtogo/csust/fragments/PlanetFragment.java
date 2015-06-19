package abtogo.csust.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import abtogo.csust.R;
import abtogo.csust.utils.Constants;

public class PlanetFragment extends Fragment {


    public static final String ARG_PLANET_NUMBER = "argplanetnumber";
    private int position = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // get the infos from here
        Bundle args = getArguments();
        position = (int) args.get(ARG_PLANET_NUMBER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_planet, container, false);
        ImageView iv_planet = (ImageView) rootview.findViewById(R.id.iv_planet);
        if (position != -1) {
            iv_planet.setImageResource(Constants.PIC_ID[position]);
        }
        return rootview;
    }

}
