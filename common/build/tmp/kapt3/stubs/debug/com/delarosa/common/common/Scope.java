package com.delarosa.common.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/delarosa/common/common/Scope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "uiDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getUiDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "destroyScope", "", "initScope", "Impl", "common_debug"})
public abstract interface Scope extends kotlinx.coroutines.CoroutineScope {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.Job getJob();
    
    public abstract void setJob(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.CoroutineDispatcher getUiDispatcher();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract kotlin.coroutines.CoroutineContext getCoroutineContext();
    
    public abstract void initScope();
    
    public abstract void destroyScope();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/delarosa/common/common/Scope$Impl;", "Lcom/delarosa/common/common/Scope;", "uiDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "getUiDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "common_debug"})
    public static final class Impl implements com.delarosa.common.common.Scope {
        @org.jetbrains.annotations.NotNull()
        public kotlinx.coroutines.Job job;
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.CoroutineDispatcher uiDispatcher = null;
        
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
        
        public Impl(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineDispatcher uiDispatcher) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            return null;
        }
        
        public void initScope() {
        }
        
        public void destroyScope() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static kotlin.coroutines.CoroutineContext getCoroutineContext(com.delarosa.common.common.Scope $this) {
            return null;
        }
        
        public static void initScope(com.delarosa.common.common.Scope $this) {
        }
        
        public static void destroyScope(com.delarosa.common.common.Scope $this) {
        }
    }
}