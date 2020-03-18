package com.cjw.mytest;

import android.os.Bundle;

import com.cjw.mytest.data.NameViewModel;
import com.cjw.mytest.data.User;
import com.cjw.mytest.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    User user = new User("Test", "User");
    binding.setUser(user);
    //绑定handler,如绑定ViewModel那样
    binding.setHandlers(new MyHandlers());


    NameViewModel viewModel = new ViewModelProvider(this).get(NameViewModel.class);
    viewModel.getCurrentName().observe(this, s -> {
      user.setLastName(s);
    });

    viewModel.getCurrentName().setValue("啊洗吧");
  }
}
