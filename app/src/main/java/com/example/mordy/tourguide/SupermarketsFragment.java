package com.example.mordy.tourguide;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**

 */
public class SupermarketsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_lists, container, false);
        // create listview
        ArrayList<EachView> arrayList = new ArrayList<EachView>();
        arrayList.add(new EachView(R.string.npgs_name, R.string.npgs_address, R
                .drawable.npgs_supermarket));
        arrayList.add(new EachView(R.string.seasons_name, R.string.seasons_address, R.drawable
                .seasons_supermarket));
        arrayList.add(new EachView(R.string.evergreen_name, R.string.evergreen_address, R.drawable
                .evergreen_supermarket));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
