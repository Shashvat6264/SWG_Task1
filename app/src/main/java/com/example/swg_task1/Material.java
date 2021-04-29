package com.example.swg_task1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Material extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_material, container, false);
        loadMaterials(v);
        return v;
    }

    private void loadMaterials(View v){
        ListView listView = v.findViewById(R.id.materialView);
        List<StudyMaterial> materials = new ArrayList<StudyMaterial>();

        materials.add(new StudyMaterial("Books", "https://drive.google.com/drive/folders/1mjtpt6bVt0_WpSawZke-bSrK3GraPKgt?usp=sharing"));
        materials.add(new StudyMaterial("Previous Papers", "https://drive.google.com/drive/folders/1aultXWJcVjEA2DJzsLFzCPa7eEde6vSB?usp=sharing"));
        materials.add(new StudyMaterial("Lecture Slides", "https://drive.google.com/drive/folders/1-1oa-SKsN3ZaJRhyqOafwHUVqv1slLFp?usp=sharing"));
        materials.add(new StudyMaterial("Lab Assignments", "https://drive.google.com/drive/folders/1yB95BJrYHYN-8ZwVXuJM25oNqmdGQxBq?usp=sharing"));
        materials.add(new StudyMaterial("Linux Commands", "https://drive.google.com/file/d/1AsbFOjR3qsoLb9Oc4Q1EwmmVv2OtfUEL/view?usp=sharing"));

        StudyMaterialAdapter adapter = new StudyMaterialAdapter(Objects.requireNonNull(getContext()), materials);
        listView.setAdapter(adapter);


    }

}