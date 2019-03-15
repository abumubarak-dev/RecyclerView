package com.example.user.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context context;
    List<AndroidApi> androidApis;

    public CustomAdapter(Context context, List<AndroidApi> androidApis) {
        this.context = context;
        this.androidApis = androidApis;
    }



    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(context).inflate(R.layout.inflate,viewGroup,false);

        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder viewHolder, int i) {

        AndroidApi androidApi=androidApis.get(i);

        viewHolder.apilevel.setText(androidApi.getApiLevel());
        viewHolder.apiname.setText(androidApi.getApiname());
        viewHolder.apiImage.setImageResource(androidApi.getImgpath());


    }

    @Override
    public int getItemCount() {
        return androidApis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView apiImage;
        TextView apiname,apilevel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            apiImage=itemView.findViewById(R.id.item_img);
            apiname=itemView.findViewById(R.id.version_name);
            apilevel=itemView.findViewById(R.id.api_level);
        }
    }
}
