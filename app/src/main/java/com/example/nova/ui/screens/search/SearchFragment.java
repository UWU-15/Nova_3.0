package com.example.nova.ui.screens.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentSearchBinding;

/**
 * Экран поиска (Search)
 */
public class SearchFragment extends BaseFragment<FragmentSearchBinding> {

    @Override
    protected FragmentSearchBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSearchBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация SearchView
    }

    @Override
    protected void setupListeners() {
        // Слушатели для поиска с debounce
    }

    @Override
    protected void loadData() {
        // Начальная загрузка
    }
}
