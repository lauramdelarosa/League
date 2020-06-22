package com.delarosa.common.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\b\u0010\u0015\u001a\u00020\u0013H\u0015R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0003\u001a\u00020\u0004X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/delarosa/common/common/ScopedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/delarosa/common/common/Scope;", "uiDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "getUiDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "destroyScope", "", "initScope", "onCleared", "common_debug"})
public abstract class ScopedViewModel extends androidx.lifecycle.ViewModel implements com.delarosa.common.common.Scope {
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ScopedViewModel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher uiDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    @java.lang.Override()
    public void setJob(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineDispatcher getUiDispatcher() {
        return null;
    }
    
    @java.lang.Override()
    public void destroyScope() {
    }
    
    @java.lang.Override()
    public void initScope() {
    }
}