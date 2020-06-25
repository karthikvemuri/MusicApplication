package com.example.android.musicapplication;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetailDisplayAdapter extends ArrayAdapter<DetailDisplay> {

    public DetailDisplayAdapter(Context context, ArrayList<DetailDisplay> details) {
        super(context, 0, details);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;

        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.details_grid, parent, false);
        }

        DetailDisplay currentItem = getItem(position);

        TextView itemName = gridItemView.findViewById(R.id.itemname);

        itemName.setText(currentItem.getName());

        ImageView itemImage = gridItemView.findViewById(R.id.itemimage);

        itemImage.setImageResource(currentItem.getImageResouceId());

        return gridItemView;
    }
}
