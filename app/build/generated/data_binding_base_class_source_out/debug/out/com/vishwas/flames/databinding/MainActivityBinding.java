// Generated by data binding compiler. Do not edit!
package com.vishwas.flames.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.vishwas.flames.R;
import com.vishwas.flames.handler.FlamesHandler;
import com.vishwas.flames.model.Names;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainActivityBinding extends ViewDataBinding {
  @NonNull
  public final Button flamesBtn;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final EditText partnerName;

  @NonNull
  public final EditText yourName;

  @Bindable
  protected Names mName;

  @Bindable
  protected FlamesHandler mHandler;

  protected MainActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button flamesBtn, ImageView imageView, EditText partnerName, EditText yourName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flamesBtn = flamesBtn;
    this.imageView = imageView;
    this.partnerName = partnerName;
    this.yourName = yourName;
  }

  public abstract void setName(@Nullable Names name);

  @Nullable
  public Names getName() {
    return mName;
  }

  public abstract void setHandler(@Nullable FlamesHandler handler);

  @Nullable
  public FlamesHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainActivityBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainActivityBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static MainActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainActivityBinding)bind(component, view, R.layout.activity_main);
  }
}