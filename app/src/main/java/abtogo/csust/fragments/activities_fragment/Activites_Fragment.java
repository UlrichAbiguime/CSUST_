package abtogo.csust.fragments.activities_fragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import abtogo.csust.R;
import abtogo.csust.entities.ActivityItem;

public class Activites_Fragment extends Fragment {

    // views
    RecyclerView recyclerView;
    private MyActivityAdapter mAdapter;


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
        // and again
        recyclerView = (RecyclerView) rootview.findViewById(R.id.m_recyclerview);

        List<ActivityItem> items = new ArrayList<ActivityItem>();
        items.add(new ActivityItem("1"));
        items.add(new ActivityItem("2"));
        items.add(new ActivityItem("3"));
        items.add(new ActivityItem("4"));
        items.add(new ActivityItem("5"));
        items.add(new ActivityItem("6"));
        items.add(new ActivityItem("7"));
        items.add(new ActivityItem("8"));
        items.add(new ActivityItem("9"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        // 设置适配器
        mAdapter = new MyActivityAdapter(items);
        recyclerView.setAdapter(mAdapter);

        return rootview;
    }



    // recycler adapter
    class MyActivityAdapter extends RecyclerView.Adapter<MyActivityAdapter.ViewHolder> {

        private Context mContext;
        private List<ActivityItem> data;


        private MyActivityAdapter (List<ActivityItem> data) {

            mContext = getActivity();
            this.data = data;
        }


        class ViewHolder extends RecyclerView.ViewHolder {

            public TextView textView;

            public ViewHolder(View view) {

                super(view);
                textView = (TextView) view.findViewById(R.id.card_tv);
            }
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(getActivity()).inflate(R.layout.newscardlayout, null);
            ViewHolder vh = new ViewHolder(view);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            if (data == null)
                return;
            ActivityItem current_item = data.get(position);
//            holder.textView.setText(current_item.title);
        }

        @Override
        public int getItemCount() {
            if (data != null)
                return data.size();
            return 0;
        }
    }

}
