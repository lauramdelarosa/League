package com.delarosa.team.databinding;
import com.delarosa.team.R;
import com.delarosa.team.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTeamBindingImpl extends FragmentTeamBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appCompatTextView, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTeamBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentTeamBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.recycler.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.delarosa.team.team.TeamViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.delarosa.team.team.TeamViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelList((androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Team>>) object, fieldId);
            case 1 :
                return onChangeViewModelLoadingProgressBar((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelList(androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Team>> ViewModelList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingProgressBar(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoadingProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Team>> viewModelList = null;
        java.lang.Boolean viewModelLoadingProgressBarGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoadingProgressBar = null;
        java.util.List<com.delarosa.domain.Team> viewModelListGetValue = null;
        com.delarosa.team.team.TeamViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

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
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingProgressBar
                        viewModelLoadingProgressBar = viewModel.getLoadingProgressBar();
                    }
                    updateLiveDataRegistration(1, viewModelLoadingProgressBar);


                    if (viewModelLoadingProgressBar != null) {
                        // read viewModel.loadingProgressBar.getValue()
                        viewModelLoadingProgressBarGetValue = viewModelLoadingProgressBar.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.delarosa.common.common.BindingsAdaptersKt.setVisible(this.progress, viewModelLoadingProgressBarGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.delarosa.team.team.BindingsAdaptersKt.setTeams(this.recycler, viewModelListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.list
        flag 1 (0x2L): viewModel.loadingProgressBar
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}