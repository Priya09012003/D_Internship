package com.example.d_internship;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;


public class RefineFragment extends Fragment {
    List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");

    public RefineFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_refine, container, false);

        Spinner spinner = view.findViewById(R.id.spinnerRef);
        spinner.setBackgroundResource(R.drawable.custom_spinner);

        // Define your list of items
        List<String> items = Arrays.asList("Available | Hey Let Us Connect","Away | Stay Discrete And Watch","Busy | Do Not Disturb| Will Catch Up Later","SOS | Emergency! Need Assistence! Help");

        // Create an ArrayAdapter and set it to the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Set a listener for Spinner selection
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Handle the selected item
                String selectedItem = items.get(position);
                // You can do something with the selected item here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do something when nothing is selected
            }
        });

        return view;
    }
}





