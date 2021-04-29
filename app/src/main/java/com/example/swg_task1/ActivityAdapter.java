package com.example.swg_task1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ActivityAdapter extends ArrayAdapter<SWGActivity> {
    private Context ctx;
    private List<SWGActivity> activityList;

    public ActivityAdapter(Context ctx, List<SWGActivity> list){
        super(ctx, R.layout.activity_item, list);
        this.ctx = ctx;
        this.activityList = list;
    }

    @NonNull
    @Override
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(ctx).inflate(R.layout.activity_item, parent, false);
            viewHolder.textHeader = view.findViewById(R.id.eventHeading);
            viewHolder.textDescription = view.findViewById(R.id.eventDesc);
            viewHolder.imageView = view.findViewById(R.id.eventImg);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }
        SWGActivity swgActivity = activityList.get(position);
        viewHolder.textHeader.setText(swgActivity.getName());
        viewHolder.textDescription.setText(swgActivity.getDescription());
        viewHolder.imageView.setImageResource(swgActivity.getEvtImage());
        return view;
    }

    private static class ViewHolder{
        public TextView textHeader;
        public TextView textDescription;
        public ImageView imageView;
    }
}
