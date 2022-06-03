package com.hossam.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hossam.myfoodapp.R;
import com.hossam.myfoodapp.adapters.DailyMealAdapter;
import com.hossam.myfoodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;
//import com.hossam.myfoodapp.databinding.FragmentGalleryBinding;

public class DailyMealFragment extends Fragment {

    //private FragmentGalleryBinding binding;
    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //binding = FragmentGalleryBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();
        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Breakfast", "30% OFF", "Description Description","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "20% OFF", "Description Description", "lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "50% OFF", "Description Description", "dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Sweets", "39% OFF", "Description Description", "sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe, "Coffee", "30% OFF", "Description Description", "coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(), dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        //final TextView textView = binding.textGallery;
        return root;
    }

    /*@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }*/
}