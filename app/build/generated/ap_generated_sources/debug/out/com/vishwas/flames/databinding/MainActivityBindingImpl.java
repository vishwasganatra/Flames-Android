package com.vishwas.flames.databinding;
import com.vishwas.flames.R;
import com.vishwas.flames.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityBindingImpl extends MainActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerFlamesClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener partnerNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of name.partner_name
            //         is name.setPartner_name((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(partnerName);
            // localize variables for thread safety
            // name != null
            boolean nameJavaLangObjectNull = false;
            // name
            com.vishwas.flames.model.Names name = mName;
            // name.partner_name
            java.lang.String namePartnerName = null;



            nameJavaLangObjectNull = (name) != (null);
            if (nameJavaLangObjectNull) {




                name.setPartner_name(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener yourNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of name.your_name
            //         is name.setYour_name((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(yourName);
            // localize variables for thread safety
            // name.your_name
            java.lang.String nameYourName = null;
            // name != null
            boolean nameJavaLangObjectNull = false;
            // name
            com.vishwas.flames.model.Names name = mName;



            nameJavaLangObjectNull = (name) != (null);
            if (nameJavaLangObjectNull) {




                name.setYour_name(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public MainActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private MainActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.flamesBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.partnerName.setTag(null);
        this.yourName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((com.vishwas.flames.handler.FlamesHandler) variable);
        }
        else if (BR.name == variableId) {
            setName((com.vishwas.flames.model.Names) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.vishwas.flames.handler.FlamesHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setName(@Nullable com.vishwas.flames.model.Names Name) {
        updateRegistration(0, Name);
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.name);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeName((com.vishwas.flames.model.Names) object, fieldId);
        }
        return false;
    }
    private boolean onChangeName(com.vishwas.flames.model.Names Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.your_name) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.partner_name) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.vishwas.flames.handler.FlamesHandler handler = mHandler;
        boolean nameCheckInputNameYourNameNamePartnerNameBooleanTrueBooleanFalse = false;
        com.vishwas.flames.model.Names name = mName;
        android.view.View.OnClickListener handlerFlamesClickAndroidViewViewOnClickListener = null;
        java.lang.String nameYourName = null;
        boolean nameCheckInputNameYourNameNamePartnerName = false;
        java.lang.String namePartnerName = null;

        if ((dirtyFlags & 0x1fL) != 0) {



                if (handler != null) {
                    // read handler::flamesClick
                    handlerFlamesClickAndroidViewViewOnClickListener = (((mHandlerFlamesClickAndroidViewViewOnClickListener == null) ? (mHandlerFlamesClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerFlamesClickAndroidViewViewOnClickListener).setValue(handler));
                }
                if (name != null) {
                    // read name.your_name
                    nameYourName = name.getYour_name();
                    // read name.partner_name
                    namePartnerName = name.getPartner_name();
                }


                if (name != null) {
                    // read name.checkInput(name.your_name, name.partner_name)
                    nameCheckInputNameYourNameNamePartnerName = name.checkInput(nameYourName, namePartnerName);
                }
            if((dirtyFlags & 0x1fL) != 0) {
                if(nameCheckInputNameYourNameNamePartnerName) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read name.checkInput(name.your_name, name.partner_name) ? true : false
                nameCheckInputNameYourNameNamePartnerNameBooleanTrueBooleanFalse = ((nameCheckInputNameYourNameNamePartnerName) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x1fL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.flamesBtn, (android.view.View.OnClickListener)handlerFlamesClickAndroidViewViewOnClickListener, nameCheckInputNameYourNameNamePartnerNameBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.partnerName, namePartnerName);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.partnerName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, partnerNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.yourName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, yourNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.yourName, nameYourName);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.vishwas.flames.handler.FlamesHandler value;
        public OnClickListenerImpl setValue(com.vishwas.flames.handler.FlamesHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.flamesClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): name
        flag 1 (0x2L): handler
        flag 2 (0x3L): name.your_name
        flag 3 (0x4L): name.partner_name
        flag 4 (0x5L): null
        flag 5 (0x6L): name.checkInput(name.your_name, name.partner_name) ? true : false
        flag 6 (0x7L): name.checkInput(name.your_name, name.partner_name) ? true : false
    flag mapping end*/
    //end
}