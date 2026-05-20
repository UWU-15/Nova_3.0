package com.example.nova.ui.screens.player;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentPlayerBinding;

/**
 * Экран полноэкранного плеера (Player)
 */
public class PlayerFragment extends BaseFragment<FragmentPlayerBinding> {

    @Override
    protected FragmentPlayerBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentPlayerBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация элементов плеера: обложка, время, прогресс-бар
    }

    @Override
    protected void setupListeners() {
        // Слушатели для кнопок: play/pause, next, previous, like, repeat, shuffle
    }

    @Override
    protected void loadData() {
        // Загрузка информации о текущем треке
    }
}
