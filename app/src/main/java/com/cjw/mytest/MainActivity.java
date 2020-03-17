package com.cjw.mytest;

import android.os.Bundle;

import com.cjw.mytest.data.User;
import com.cjw.mytest.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    User user = new User("Test", "User");
    binding.setUser(user);
    binding.tv1.setText("haha");
    //    MyViewModel myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
    //    myViewModel.getName();
    //    mainBinding.acpBt.setOnClickListener(v -> {
    //      System.out.println(myViewModel.getName());
    //    });



  }
}
