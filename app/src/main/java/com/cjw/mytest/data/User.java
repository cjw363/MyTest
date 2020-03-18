package com.cjw.mytest.data;

import com.cjw.mytest.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

//使用可观察数据对象
//数据变化 界面自动刷新
public class User extends BaseObservable {
  private String firstName;
  private String lastName;

  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Bindable
  public String getFirstName() {
    return this.firstName;
  }

  @Bindable
  public String getLastName() {
    return this.lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    notifyPropertyChanged(BR.firstName);
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    notifyPropertyChanged(BR.lastName);
  }
}

    