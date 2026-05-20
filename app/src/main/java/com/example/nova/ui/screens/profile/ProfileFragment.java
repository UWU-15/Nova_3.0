package com.example.nova.ui.screens.profile;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nova.ui.base.BaseFragment;
import com.example.nova.databinding.FragmentProfileBinding;

/**
 * Экран профиля пользователя (Profile)
 */
public class ProfileFragment extends BaseFragment<FragmentProfileBinding> {

    @Override
    protected FragmentProfileBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentProfileBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initUI() {
        // Инициализация элементов профиля: аватар, имя, email и т.д.
    }

    @Override
    protected void setupListeners() {
        // Слушатели для редактирования профиля, выхода
    }

    @Override
    protected void loadData() {
        // Загрузка данных пользователя
    }
}
