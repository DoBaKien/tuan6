package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    private EditText editInput;
    private Button buttonApply;
    private MainActivity mainActivity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        // Read xml file and return View object.
        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editInput =  (EditText) view.findViewById(R.id.etName);

        buttonApply = (Button) view.findViewById(R.id.button);

        buttonApply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editInput.getText().toString();
                mainActivity.showText(name);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }



}