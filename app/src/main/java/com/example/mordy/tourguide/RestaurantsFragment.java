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
public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_lists, container, false);
        // create listview
        ArrayList<EachView> arrayList = new ArrayList<EachView>();
        arrayList.add(new EachView(R.string.bagel_nosh_name, R.string.bagel_nosh_address, R
                .drawable.bagel_nosh));
        arrayList.add(new EachView(R.string.glatt_bite_name, R.string.glatt_bite_address, R.drawable
                .glatt_bite));
        arrayList.add(new EachView(R.string.yapchick_name, R.string.yapchick_address, R.drawable
                .yapchick));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
