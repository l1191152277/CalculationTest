package com.example.calculationtest;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculationtest.databinding.FragmentLostBinding;
import com.example.calculationtest.databinding.FragmentWinBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoseFragment extends Fragment {

    public LoseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MyViewModel model = new ViewModelProvider(requireActivity()).get(MyViewModel.class);
        FragmentLostBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lost, container, false);
        binding.setData(model);
        binding.setLifecycleOwner(requireActivity());
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_loseFragment_to_titleFragment);
            }
        });
        return binding.getRoot();
    }
}
