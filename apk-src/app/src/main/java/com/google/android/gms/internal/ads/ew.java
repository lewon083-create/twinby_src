package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ew implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f5105b;

    public /* synthetic */ ew(String str) {
        this.f5104a = 2;
        this.f5105b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f5104a;
        Serializable serializable = this.f5105b;
        switch (i) {
            case 0:
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, l7.o.j(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            case 1:
                int andIncrement2 = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, l7.o.j(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
            default:
                String str = cq0.f4293a;
                return new Thread(runnable, (String) serializable);
        }
    }

    public ew() {
        this.f5104a = 1;
        this.f5105b = new AtomicInteger(1);
    }

    public ew(fw fwVar) {
        this.f5104a = 0;
        this.f5105b = new AtomicInteger(1);
    }
}
