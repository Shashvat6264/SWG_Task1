package com.example.swg_task1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Syllabus extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_syllabus, container, false);
        loadSyllabus(v);
        return v;
    }

    private void loadSyllabus(View v){
        TextView syllabus = v.findViewById(R.id.syllabus);
        String syllabusText = "Topics Introduction - Basic operation of digital computers, " +
                "basic concepts of integer and floating point number representations. " +
                "Elements of C programming language - data types, constants, and variables , " +
                "expressions and assignment statements, input and output statements, " +
                "conditional and branch statements, iteration statements, 1-d and 2-d arrays, " +
                "functions and parameter passing; recursion, strings, structures,introduction " +
                "to pointers and dynamic allocation,file read and write. Searching and sorting- " +
                "Linear and binary search, selection sort, bubble sort, insertion sort, " +
                "merge sort, quick sort. Data structures: Linked lists, stacks, queues.";
        syllabus.setText(syllabusText);
    }
}