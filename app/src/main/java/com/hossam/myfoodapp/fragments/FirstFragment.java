package com.hossam.myfoodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hossam.myfoodapp.R;
import com.hossam.myfoodapp.adapters.FeaturedAdapter;
import com.hossam.myfoodapp.adapters.FeaturedVerAdapter;
import com.hossam.myfoodapp.models.FeaturedModel;
import com.hossam.myfoodapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

/*/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    /*private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;*/

    //Featured Hor RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    //Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    /*/**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    /*public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false);
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        //Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.fav1, "Featured 1", "Description1"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav2, "Featured 2", "Description2"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav3, "Featured 3", "Description3"));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);


        //Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1, "Featured 1", "Description 1", "4.8", "8:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2, "Featured 2", "Description 2", "4.8", "8:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3, "Featured 3", "Description 3", "4.8", "8:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1, "Featured 4", "Description 1", "4.8", "8:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2, "Featured 5", "Description 2", "4.8", "8:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3, "Featured 6", "Description 3", "4.8", "8:00 - 10:00"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}