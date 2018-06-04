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
public class HallsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_lists, container, false);
        // create listview
        ArrayList<EachView> arrayList = new ArrayList<EachView>();
        arrayList.add(new EachView(R.string.cheder_name, R.string.cheder_address, R
                .drawable.cheder_hall));
        arrayList.add(new EachView(R.string.neimas_hachaim_name, R.string.neimas_hachaim_address, R.drawable
                .neimas_hachaim_hall));
        arrayList.add(new EachView(R.string.ateres_chana_name, R.string.ateres_chana_address, R.drawable
                .bais_faiga_hall));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
