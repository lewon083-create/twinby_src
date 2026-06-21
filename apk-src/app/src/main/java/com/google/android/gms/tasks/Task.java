package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import sb.a;
import sb.b;
import sb.c;
import sb.d;
import sb.f;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract m c(Executor executor, c cVar);

    public abstract m d(Executor executor, d dVar);

    public Task e(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task f(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Object g(Class cls);

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean isSuccessful();

    public Task j(Executor executor, f fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
