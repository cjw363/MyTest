package com.cjw.mytest.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
  private MutableLiveData<String> name;
  public LiveData<String> getName() {
    if (name == null) {
      name = new MutableLiveData<String>();
      loadUsers();
    }
    return name;
  }

  private void loadUsers() {
    // Do an asynchronous operation to fetch users.
    name.setValue("xiaoming");
  }
}

