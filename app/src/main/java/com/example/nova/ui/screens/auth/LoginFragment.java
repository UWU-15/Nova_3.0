package com.example.nova.ui.screens.auth;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentLoginBinding;

/**
 * Экран входа (Login)
 */
public class LoginFragment extends BaseFragment<FragmentLoginBinding> {

    @Override
    protected FragmentLoginBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentLoginBinding.inflate(inflater, container, false);
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
        // Загрузка сохраненных данных
    }
}
