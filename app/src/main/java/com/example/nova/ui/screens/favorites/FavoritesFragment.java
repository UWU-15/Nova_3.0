package com.example.nova.ui.screens.favorites;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentFavoritesBinding;

/**
 * Экран избранных треков (Favorites)
 */
public class FavoritesFragment extends BaseFragment<FragmentFavoritesBinding> {

    @Override
    protected FragmentFavoritesBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentFavoritesBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация RecyclerView для любимых треков
    }

    @Override
    protected void setupListeners() {
        // Слушатели для удаления из избранного
    }

    @Override
    protected void loadData() {
        // Загрузка избранных треков
    }
}
