package com.jonas.mvptest.ui.login;

import com.jonas.mvptest.model.User;

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }

    @Override
    public User getUser() {
        if (user == null) {
            user = new User("Antonio", "Banderas");
            user.setId(0);

        }
        return user;
    }
}
