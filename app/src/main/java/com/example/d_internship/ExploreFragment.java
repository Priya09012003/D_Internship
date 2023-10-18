package com.example.d_internship;

import android.app.Person;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ExploreFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ExploreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<person> personArrayList;
    private String[] PersonName;
    private String[] PersonLocation;
    private String[] Personchoices;
    private String[] PersonL;
    private int[] imageResourceId;
    private RecyclerView recyclerView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExploreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExploreFragment newInstance(String param1, String param2) {
        ExploreFragment fragment = new ExploreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ExploreFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        recyclerView =view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        Myadapter myadapter =new Myadapter(getContext(),personArrayList);
        recyclerView.setAdapter(myadapter);
        myadapter.notifyDataSetChanged();


    }

    private void dataInitialize() {
        personArrayList = new ArrayList<>();

        PersonName = new String[]{
                getString(R.string.head_1),
                getString(R.string.head_2),
                getString(R.string.head_3),
                getString(R.string.head_4),
                getString(R.string.head_5),
        };

        PersonLocation = new String[]{
                getString(R.string.location1),
                getString(R.string.location2),
                getString(R.string.location3),
                getString(R.string.location4),
                getString(R.string.location5),
        };

        Personchoices = new String[]{
                getString(R.string.choices1),
                getString(R.string.choices2),
                getString(R.string.choices3),
                getString(R.string.choices4),
                getString(R.string.choices5),
        };
        PersonL= new String[]{
                getString(R.string.last1),
                getString(R.string.last2),
                getString(R.string.last3),
                getString(R.string.last4),
                getString(R.string.last5),
        };

         imageResourceId = new int[]{
                 R.drawable.man1,
                 R.drawable.women1,
                 R.drawable.man2,
                 R.drawable.women3,
                 R.drawable.man3,
         };

         for (int i=0;i<PersonName.length;i++){
             person person;
             person = new person(PersonName[i],PersonLocation[i],Personchoices[i],PersonL[i], imageResourceId[i]);
             personArrayList.add(person);
         }
    }
}