package com.example.nova.ui.screens.player;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentBlindPlayerBinding;

/**
 * Экран слепого прослушивания (Blind Player)
 * Минималистичный режим - только обложка и базовые кнопки
 */
public class BlindPlayerFragment extends BaseFragment<FragmentBlindPlayerBinding> {

    @Override
    protected FragmentBlindPlayerBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentBlindPlayerBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация минималистичного интерфейса
    }

    @Override
    protected void setupListeners() {
        // Слушатели для базовых кнопок управления
    }

    @Override
    protected void loadData() {
        // Загрузка текущего трека
    }
}
