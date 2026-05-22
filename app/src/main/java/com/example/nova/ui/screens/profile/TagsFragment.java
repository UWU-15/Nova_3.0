package com.example.nova.ui.screens.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.nova.MainActivity;
import com.example.nova.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class TagsFragment extends Fragment {

    private ChipGroup genres;
    private ChipGroup moods;
    private MaterialButton btnNext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_select_genres, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        genres = view.findViewById(R.id.genresChipGroup);
        moods = view.findViewById(R.id.moodChipGroup);
        btnNext = view.findViewById(R.id.btnNext);

        setup(genres);
        setup(moods);

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), MainActivity.class));
            requireActivity().finish();
        });
    }

    private void setup(ChipGroup group) {

        for (int i = 0; i < group.getChildCount(); i++) {

            View v = group.getChildAt(i);

            if (v instanceof Chip) {

                Chip chip = (Chip) v;

                chip.setOnCheckedChangeListener((button, checked) -> {

                    if (checked) {
                        chip.setScaleX(1.08f);
                        chip.setScaleY(1.08f);
                        chip.setAlpha(1f);
                    } else {
                        chip.setScaleX(1f);
                        chip.setScaleY(1f);
                        chip.setAlpha(0.7f);
                    }
                });
            }
        }
    }
}