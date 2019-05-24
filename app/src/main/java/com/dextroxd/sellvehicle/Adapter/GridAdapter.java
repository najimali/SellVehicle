package com.dextroxd.sellvehicle.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import com.dextroxd.sellvehicle.Model.ModelCard;
import com.dextroxd.sellvehicle.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<ModelCard> {

    public GridAdapter(@NonNull Context context, @NonNull ArrayList<ModelCard> objects) {
        super(context,0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View GridItemView = convertView;
        if (GridItemView == null) {
            GridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cardsofsale, parent, false);
        }
        final ModelCard servicesModel = getItem(position);
        ImageView imageView = GridItemView.findViewById(R.id.imageView);
        //Un comment the below line to load image from url;
//        Picasso.get().load(servicesModel.getImageUrl()).into(imageView);
        TextView cost = GridItemView.findViewById(R.id.cost);
        cost.setText("₹"+servicesModel.getCost());
        ImageButton imageButton = GridItemView.findViewById(R.id.likebutton);
        if(servicesModel.isLike()){
            imageButton.setColorFilter(Color.argb(255,255,0,0));
        }
        TextView heading = GridItemView.findViewById(R.id.heading);
        heading.setText(servicesModel.getTitle());
        TextView description = GridItemView.findViewById(R.id.description);
        description.setText(servicesModel.getDescription());
        TextView location = GridItemView.findViewById(R.id.locationofsale);
        location.setText(servicesModel.getLocation());
        // Use code below for click event happen on click of card element.
//        GridItemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });

        return GridItemView;

    }
}