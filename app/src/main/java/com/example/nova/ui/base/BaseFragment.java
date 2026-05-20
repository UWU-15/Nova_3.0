package com.example.nova.ui.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;

/**
 * Базовый Fragment класс с поддержкой View Binding
 */
public abstract class BaseFragment<VB extends ViewBinding> extends Fragment {
    protected VB binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = createViewBinding(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUI();
        setupListeners();
        loadData();
    }

    protected abstract VB createViewBinding(LayoutInflater inflater, ViewGroup container);

    protected abstract void initUI();

    protected abstract void setupListeners();

    protected abstract void loadData();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
