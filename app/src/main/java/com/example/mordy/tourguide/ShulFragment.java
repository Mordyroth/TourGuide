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
public class ShulFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_lists, container, false);
        // create listview
        ArrayList<EachView> arrayList = new ArrayList<EachView>();
        arrayList.add(new EachView(R.string.bmg_name, R.string.bmg_address, R
                .drawable.bmg));
        arrayList.add(new EachView(R.string.choshen_mishpat_name, R.string.choshen_mishpat_address, R.drawable
                .choshen_mishpat));
        arrayList.add(new EachView(R.string.anshei_sefard_name, R.string.anshei_sefard_address, R.drawable
                .anshei_sefard));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
