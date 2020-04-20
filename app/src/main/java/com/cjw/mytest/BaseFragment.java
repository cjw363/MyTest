package com.cjw.mytest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment<T> extends Fragment {

  private View mView;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
    savedInstanceState) {
    mView = getContentView(inflater,container);
    initView();
    return mView;
  }

  protected abstract int getContentLayoutId();

  protected abstract void initView();

  protected View getContentView(LayoutInflater inflater, @Nullable ViewGroup container){
    return inflater.inflate(getContentLayoutId(), container);
  }

  protected void initData() {
  }

  @Override
  public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {// 当fragment处于可见状态
      if (mView != null) {
        initData();
      }
    }
  }

  private boolean isFirstCreate = false;

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (getUserVisibleHint() && !isFirstCreate) {
      initData();
      isFirstCreate = true;
    }
  }
}
