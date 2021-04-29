package com.example.swg_task1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class StudyMaterialAdapter extends ArrayAdapter<StudyMaterial> {
    private Context ctx;
    private List<StudyMaterial> materialList;

    public StudyMaterialAdapter(@NonNull Context context, List<StudyMaterial> materialList) {
        super(context, R.layout.material_item, materialList);
        this.ctx = context;
        this.materialList = materialList;
    }

    @NonNull
    @Override
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(ctx).inflate(R.layout.material_item, parent, false);
            viewHolder.textHeader = view.findViewById(R.id.materialName);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }
        StudyMaterial studyMaterial = materialList.get(position);
        viewHolder.textHeader.setText(studyMaterial.getName());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctx.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(studyMaterial.getLink())));
            }
        });
        return view;
    }

    private static class ViewHolder{
        public TextView textHeader;
    }
}
