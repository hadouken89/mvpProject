package com.jonas.mvptest.ui.login;

import androidx.annotation.Nullable;

import com.jonas.mvptest.model.User;

public class MainActivityPresenter implements MainActivityMVP.Presenter{

    @Nullable
    private MainActivityMVP.View view;
    private MainActivityMVP.Model model;

    public MainActivityPresenter(MainActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(MainActivityMVP.View view) {
        this.view = view;

    }

    @Override
    public void loginButtonClicked() {
        if(view != null){
            if(view.getFirstName().isEmpty() || view.getlastName().isEmpty()){
                view.showInputError();
            } else {
              model.createUser(view.getFirstName().trim(), view.getlastName().trim());
              view.showUserSaved();
            }
        }

    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();

        if(user == null){
            if(view != null){
                view.showUserNotAvaliable();
            }
        }else {
            view.setFirstName(user.getFirstName());
            view.setLastName(user.getLastName());

        }
    }
}
