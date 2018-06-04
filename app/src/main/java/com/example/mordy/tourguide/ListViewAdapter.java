package com.example.mordy.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<EachView>{

    public ListViewAdapter(Activity context, ArrayList<EachView> eachView) {
        super(context, 0, eachView);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        EachView currentItem = getItem(position);

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentItem.getImageResourceId());

        TextView nameTextView = listItemView.findViewById(R.id.text_view_1);
        nameTextView.setText(currentItem.getName());

        TextView addressTextView = listItemView.findViewById(R.id.text_view_2);
        addressTextView.setText(currentItem.getAddress());
        return listItemView;
    }
}
