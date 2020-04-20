package com.cjw.mytest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class BaseVFragment<T extends BaseFragment<T>, B extends ViewDataBinding> extends BaseFragment<T> {

    /**
     * 当前视图绑定的对象
     */
    protected B vdBind;

    @Nullable
    @Override
    protected View getContentView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        vdBind = DataBindingUtil.inflate(inflater, getContentLayoutId() ,container , false);
        return vdBind.getRoot();
    }

}