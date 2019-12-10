package com.jonas.mvptest.ui.login;

import com.jonas.mvptest.model.User;

public interface LoginRepository {

    void saveUser(User user);

    User getUser();
}
