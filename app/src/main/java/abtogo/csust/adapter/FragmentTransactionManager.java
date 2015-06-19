package abtogo.csust.adapter;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

import abtogo.csust.fragments.activities_fragment.Activites_Fragment;
import abtogo.csust.fragments.circle_fragment.Circle_Fragment;
import abtogo.csust.fragments.forums_fragment.Forums_Fragment;
import abtogo.csust.fragments.news_fragment.News_Fragment;
import abtogo.csust.utils.Constants;

/**
 * Created by lakiu_000 on 6/17/2015.
 */
public class FragmentTransactionManager {

    /**
     * d'abord realiser une souche, un truk sans contenu tranquilement
     *
     * - ensuite recuperer les donnees depuis un server,
     * - concocter par mes amis de yunzuofang et les ajouter a mon pc.
     *
     *
     */

    public final FragmentContainer fragmentContainer = new FragmentContainer();


    public FragmentContainer getFragmentContainerInstance () {
        return fragmentContainer;
    }

    public class FragmentContainer {

        private Map<String, Fragment> map_fragments;

        private FragmentContainer() {
            this.map_fragments = new HashMap<>();
        }

        public Fragment getFragmentWithTag(String tag) {

            Fragment fr = null;
            switch (tag) {
                case Constants._1:

                    if (map_fragments.get(tag) == null) {
                        map_fragments.put(tag, News_Fragment.newInstance());
                    }
                    fr = map_fragments.get(tag);
                    break;
                case Constants._2:

                    if (map_fragments.get(tag) == null) {
                        map_fragments.put(tag, Activites_Fragment.newInstance());
                    }
                    fr = map_fragments.get(tag);
                    break;
                case Constants._3:

                    if (map_fragments.get(tag) == null) {
                        map_fragments.put(tag, Circle_Fragment.newInstance());
                    }
                    fr = map_fragments.get(tag);
                    break;
                case Constants._4:
                    if (map_fragments.get(tag) == null) {
                        map_fragments.put(tag, Forums_Fragment.newInstance());
                    }
                    fr = map_fragments.get(tag);
                    break;
            }
            return fr;
        }

    }
}
