package com.jonas.mvptest.ui.login;

import com.jonas.mvptest.model.User;

public class MainActivityModel implements MainActivityMVP.Model {

    LoginRepository loginRepository;

    public MainActivityModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void createUser(String firstName, String lastName) {
        //logica de bussiness
        loginRepository.saveUser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        return null;
    }
}
