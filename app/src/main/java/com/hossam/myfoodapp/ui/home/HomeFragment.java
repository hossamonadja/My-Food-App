package com.hossam.myfoodapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hossam.myfoodapp.R;
import com.hossam.myfoodapp.adapters.HomeHorAdapter;
//import com.hossam.myfoodapp.databinding.FragmentHomeBinding;
import com.hossam.myfoodapp.adapters.HomeVerAdapter;
import com.hossam.myfoodapp.adapters.UpdateVerticalRec;
import com.hossam.myfoodapp.models.HomeHorModel;
import com.hossam.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    //private FragmentHomeBinding binding;
    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    //Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);*/

        //binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec =  root.findViewById(R.id.home_ver_rec);

        //Horizontal Recycler View
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.pizza, "Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger, "Hamburger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes, "Fried"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream, "Ice_Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich, "Sandwich"));

        homeHorAdapter = new HomeHorAdapter(this, getActivity(), homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);
        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        //Vertical Recycler View
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        /*homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);*/
        //final TextView textView = binding.textHome;

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }

    /*@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }*/
}