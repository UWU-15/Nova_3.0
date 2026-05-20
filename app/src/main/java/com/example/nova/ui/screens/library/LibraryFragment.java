package com.example.nova.ui.screens.library;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentLibraryBinding;

/**
 * Экран библиотеки (Library)
 * Показывает: плейлисты пользователя
 */
public class LibraryFragment extends BaseFragment<FragmentLibraryBinding> {

    @Override
    protected FragmentLibraryBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentLibraryBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация RecyclerView для плейлистов
    }

    @Override
    protected void setupListeners() {
        // Слушатели для создания нового плейлиста
    }

    @Override
    protected void loadData() {
        // Загрузка плейлистов пользователя
    }
}
