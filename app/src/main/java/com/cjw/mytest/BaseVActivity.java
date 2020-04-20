package com.cjw.mytest;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class BaseVActivity<T extends BaseActivity<T>, B extends ViewDataBinding> extends BaseActivity<T> {

    protected B vdBind;

    @Override
    protected void initContentView() {
        vdBind = DataBindingUtil.setContentView(this, getContentLayoutId());
    }

}