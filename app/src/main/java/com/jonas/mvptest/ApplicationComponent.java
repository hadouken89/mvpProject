package com.jonas.mvptest;

import com.jonas.mvptest.ui.activities.BaseActivity;
import com.jonas.mvptest.ui.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity target);

}
