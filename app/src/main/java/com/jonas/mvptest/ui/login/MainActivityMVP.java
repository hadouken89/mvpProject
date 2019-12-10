package com.jonas.mvptest.ui.login;

import com.jonas.mvptest.model.User;

public interface MainActivityMVP {

    interface View{

        String getFirstName();
        String getlastName();

        void showUserNotAvaliable();
        void showInputError();
        void showUserSaved();

        void setFirstName(String firstName);
        void setLastName(String lastName);
    }

    interface Presenter{
        void setView(MainActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();

    }

    interface Model{
        void createUser(String firstName, String lastName);

        User getUser();
    }
}
