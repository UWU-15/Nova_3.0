package com.example.nova.ui.screens.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentHomeBinding;

/**
 * Главный экран (Home)
 * Показывает: популярные треки, новинки, рекомендации
 */
public class HomeFragment extends BaseFragment<FragmentHomeBinding> {

    @Override
    protected FragmentHomeBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentHomeBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация RecyclerView для треков
    }

    @Override
    protected void setupListeners() {
        // Слушатели для кнопок, элементов списков
    }

    @Override
    protected void loadData() {
        // Загрузка популярных, новых треков и рекомендаций
    }
}
