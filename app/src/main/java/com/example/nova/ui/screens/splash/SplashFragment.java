package com.example.nova.ui.screens.splash;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentSplashBinding;

/**
 * Splash экран при запуске приложения
 */
public class SplashFragment extends BaseFragment<FragmentSplashBinding> {

    @Override
    protected FragmentSplashBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSplashBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация UI элементов
    }

    @Override
    protected void setupListeners() {
        // Установка слушателей
    }

    @Override
    protected void loadData() {
        // Загрузка данных, проверка авторизации
    }
}
