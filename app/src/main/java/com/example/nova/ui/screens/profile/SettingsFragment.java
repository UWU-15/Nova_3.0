package com.example.nova.ui.screens.profile;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import com.example.nova.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsFragment extends Fragment {

    private MaterialButton audioQualityButton;
    private SwitchMaterial normalizationSwitch;
    private SwitchMaterial themeSwitch;

    private ImageButton backButton;
    private LinearLayout logoutItem;

    private SharedPreferences preferences;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        preferences = requireContext()
                .getSharedPreferences("nova_settings", 0);

        initViews(view);
        loadSettings();
        setupListeners();
    }

    private void initViews(View view) {

        audioQualityButton = view.findViewById(R.id.audioQualityButton);
        normalizationSwitch = view.findViewById(R.id.normalizationSwitch);
        themeSwitch = view.findViewById(R.id.themeSwitch);
        backButton = view.findViewById(R.id.backButton);
        logoutItem = view.findViewById(R.id.logoutItem);
    }

    private void loadSettings() {

        boolean darkMode = preferences.getBoolean("dark_mode", true);
        boolean normalization = preferences.getBoolean("normalization", true);

        themeSwitch.setChecked(darkMode);
        normalizationSwitch.setChecked(normalization);
    }

    private void setupListeners() {

        // BACK
        backButton.setOnClickListener(v ->
                requireActivity().onBackPressed()
        );

        // AUDIO QUALITY TOGGLE
        audioQualityButton.setOnClickListener(v -> {

            String text = audioQualityButton.getText().toString();

            if (text.equals("High")) {
                audioQualityButton.setText("Ultra");
            } else {
                audioQualityButton.setText("High");
            }
        });

        // NORMALIZATION
        normalizationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {

            preferences.edit()
                    .putBoolean("normalization", isChecked)
                    .apply();
        });

        // THEME SWITCH
        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {

            preferences.edit()
                    .putBoolean("dark_mode", isChecked)
                    .apply();

            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(
                        AppCompatDelegate.MODE_NIGHT_YES
                );
            } else {
                AppCompatDelegate.setDefaultNightMode(
                        AppCompatDelegate.MODE_NIGHT_NO
                );
            }
        });

        // LOGOUT
        logoutItem.setOnClickListener(v ->
                Toast.makeText(requireContext(),
                        "Logged out",
                        Toast.LENGTH_SHORT).show()
        );
    }
}