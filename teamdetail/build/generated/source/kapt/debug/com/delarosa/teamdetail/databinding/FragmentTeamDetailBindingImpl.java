package com.delarosa.teamdetail.databinding;
import com.delarosa.teamdetail.R;
import com.delarosa.teamdetail.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTeamDetailBindingImpl extends FragmentTeamDetailBinding implements com.delarosa.teamdetail.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 13);
        sViewsWithIds.put(R.id.nested, 14);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTeamDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentTeamDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (com.google.android.material.appbar.AppBarLayout) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            );
        this.Description.setTag(null);
        this.DetailImage.setTag(null);
        this.DetailToolbar.setTag(null);
        this.foundationYear.setTag(null);
        this.imageView2.setTag(null);
        this.imageView3.setTag(null);
        this.imageView4.setTag(null);
        this.imageView5.setTag(null);
        this.imageView6.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.recycler.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.delarosa.teamdetail.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.delarosa.teamdetail.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.delarosa.teamdetail.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.delarosa.teamdetail.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.delarosa.teamdetail.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.delarosa.teamdetail.teamdetail.TeamDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.delarosa.teamdetail.teamdetail.TeamDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelList((androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Event>>) object, fieldId);
            case 1 :
                return onChangeViewModelNameText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDescriptionText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelUpcoming((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelTeamJerseyText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelTeamBadgeText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelFoundationYearText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelList(androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Event>> ViewModelList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNameText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelNameText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDescriptionText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDescriptionText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUpcoming(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelUpcoming, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTeamJerseyText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTeamJerseyText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTeamBadgeText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTeamBadgeText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFoundationYearText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFoundationYearText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Event>> viewModelList = null;
        java.lang.String viewModelNameTextGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelNameText = null;
        java.lang.String viewModelTeamBadgeTextGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescriptionText = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUpcoming = null;
        java.lang.Boolean viewModelUpcomingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTeamJerseyText = null;
        java.util.List<com.delarosa.domain.Event> viewModelListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTeamBadgeText = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFoundationYearText = null;
        java.lang.String viewModelTeamJerseyTextGetValue = null;
        java.lang.String viewModelDescriptionTextGetValue = null;
        com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
        java.lang.String viewModelFoundationYearTextGetValue = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.list
                        viewModelList = viewModel.getList();
                    }
                    updateLiveDataRegistration(0, viewModelList);


                    if (viewModelList != null) {
                        // read viewModel.list.getValue()
                        viewModelListGetValue = viewModelList.getValue();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nameText
                        viewModelNameText = viewModel.getNameText();
                    }
                    updateLiveDataRegistration(1, viewModelNameText);


                    if (viewModelNameText != null) {
                        // read viewModel.nameText.getValue()
                        viewModelNameTextGetValue = viewModelNameText.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.descriptionText
                        viewModelDescriptionText = viewModel.getDescriptionText();
                    }
                    updateLiveDataRegistration(2, viewModelDescriptionText);


                    if (viewModelDescriptionText != null) {
                        // read viewModel.descriptionText.getValue()
                        viewModelDescriptionTextGetValue = viewModelDescriptionText.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.upcoming
                        viewModelUpcoming = viewModel.getUpcoming();
                    }
                    updateLiveDataRegistration(3, viewModelUpcoming);


                    if (viewModelUpcoming != null) {
                        // read viewModel.upcoming.getValue()
                        viewModelUpcomingGetValue = viewModelUpcoming.getValue();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.teamJerseyText
                        viewModelTeamJerseyText = viewModel.getTeamJerseyText();
                    }
                    updateLiveDataRegistration(4, viewModelTeamJerseyText);


                    if (viewModelTeamJerseyText != null) {
                        // read viewModel.teamJerseyText.getValue()
                        viewModelTeamJerseyTextGetValue = viewModelTeamJerseyText.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.teamBadgeText
                        viewModelTeamBadgeText = viewModel.getTeamBadgeText();
                    }
                    updateLiveDataRegistration(5, viewModelTeamBadgeText);


                    if (viewModelTeamBadgeText != null) {
                        // read viewModel.teamBadgeText.getValue()
                        viewModelTeamBadgeTextGetValue = viewModelTeamBadgeText.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.foundationYearText
                        viewModelFoundationYearText = viewModel.getFoundationYearText();
                    }
                    updateLiveDataRegistration(6, viewModelFoundationYearText);


                    if (viewModelFoundationYearText != null) {
                        // read viewModel.foundationYearText.getValue()
                        viewModelFoundationYearTextGetValue = viewModelFoundationYearText.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.Description, viewModelDescriptionTextGetValue);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            com.delarosa.common.common.BindingsAdaptersKt.bindUrl(this.DetailImage, viewModelTeamBadgeTextGetValue);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.DetailToolbar.setTitle(viewModelNameTextGetValue);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.foundationYear, viewModelFoundationYearTextGetValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.imageView2.setOnClickListener(mCallback3);
            this.imageView3.setOnClickListener(mCallback1);
            this.imageView4.setOnClickListener(mCallback5);
            this.imageView5.setOnClickListener(mCallback4);
            this.imageView6.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            com.delarosa.common.common.BindingsAdaptersKt.bindUrl(this.mboundView4, viewModelTeamJerseyTextGetValue);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            com.delarosa.common.common.BindingsAdaptersKt.setVisible(this.mboundView6, viewModelUpcomingGetValue);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            com.delarosa.teamdetail.teamdetail.BindingsAdaptersKt.setEvents(this.recycler, viewModelListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel.twitterLink
                java.lang.String viewModelTwitterLink = null;
                // viewModel
                com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelTwitterLink = viewModel.getTwitterLink();

                    viewModel.redirectSocialMedia(viewModelTwitterLink);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.instagramLink
                java.lang.String viewModelInstagramLink = null;
                // viewModel
                com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelInstagramLink = viewModel.getInstagramLink();

                    viewModel.redirectSocialMedia(viewModelInstagramLink);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
                // viewModel.youtubeLink
                java.lang.String viewModelYoutubeLink = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelYoutubeLink = viewModel.getYoutubeLink();

                    viewModel.redirectSocialMedia(viewModelYoutubeLink);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.webpageLink
                java.lang.String viewModelWebpageLink = null;
                // viewModel
                com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelWebpageLink = viewModel.getWebpageLink();

                    viewModel.redirectSocialMedia(viewModelWebpageLink);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.facebookLink
                java.lang.String viewModelFacebookLink = null;
                // viewModel
                com.delarosa.teamdetail.teamdetail.TeamDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelFacebookLink = viewModel.getFacebookLink();

                    viewModel.redirectSocialMedia(viewModelFacebookLink);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.list
        flag 1 (0x2L): viewModel.nameText
        flag 2 (0x3L): viewModel.descriptionText
        flag 3 (0x4L): viewModel.upcoming
        flag 4 (0x5L): viewModel.teamJerseyText
        flag 5 (0x6L): viewModel.teamBadgeText
        flag 6 (0x7L): viewModel.foundationYearText
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}