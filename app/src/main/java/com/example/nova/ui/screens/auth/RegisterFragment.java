package com.example.nova.ui.screens.auth;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentRegisterBinding;

/**
 * Экран регистрации (Register)
 */
public class RegisterFragment extends BaseFragment<FragmentRegisterBinding> {

    @Override
    protected FragmentRegisterBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentRegisterBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация UI элементов
    }

    @Override
    protected void setupListeners() {
        // Установка слушателей на кнопки
    }

    @Override
    protected void loadData() {
        // Загрузка жанров для выбора
    }
}
