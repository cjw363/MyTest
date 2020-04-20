package com.cjw.mytest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T> extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initContentView();
    initView();
  }

  protected abstract int getContentLayoutId();

  protected abstract void initView();

  protected void initContentView(){
    setContentView(getContentLayoutId());
  }

  @Override
  protected void onResume() {
    super.onResume();
    initData();
  }

  protected void initData() {
  }


}
