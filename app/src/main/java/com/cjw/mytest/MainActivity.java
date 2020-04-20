package com.cjw.mytest;

import com.cjw.mytest.data.NameViewModel;
import com.cjw.mytest.data.User;
import com.cjw.mytest.databinding.ActivityMainBindingImpl;

import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends BaseVActivity<MainActivity, ActivityMainBindingImpl> {

  @Override
  protected int getContentLayoutId() {
    return R.layout.activity_main;
  }

  @Override
  protected void initView() {
    User user = new User("Test", "User");
    vdBind.setUser(user);
    //绑定handler,如绑定ViewModel那样
    vdBind.setHandlers(new MyHandlers());
    NameViewModel viewModel = new ViewModelProvider(this).get(NameViewModel.class);
    viewModel.getCurrentName().observe(this, s -> {
      user.setLastName(s);
    });

    viewModel.getCurrentName().setValue("啊洗吧");
  }
}