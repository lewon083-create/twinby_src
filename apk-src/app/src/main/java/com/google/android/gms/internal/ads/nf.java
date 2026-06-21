package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nf implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8286c;

    public nf() {
        this.f8284a = 0;
        this.f8286c = Executors.defaultThreadFactory();
        this.f8285b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8284a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f8286c).newThread(runnable);
                int andIncrement = this.f8285b.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb2.append("gads-");
                sb2.append(andIncrement);
                threadNewThread.setName(sb2.toString());
                return threadNewThread;
            default:
                int andIncrement2 = this.f8285b.getAndIncrement();
                int length = String.valueOf(andIncrement2).length();
                String str = (String) this.f8286c;
                StringBuilder sb3 = new StringBuilder(pe.a.b(12, length, str));
                sb3.append("AdWorker(");
                sb3.append(str);
                sb3.append(") #");
                sb3.append(andIncrement2);
                return new Thread(runnable, sb3.toString());
        }
    }

    public nf(String str) {
        this.f8284a = 1;
        this.f8286c = str;
        this.f8285b = new AtomicInteger(1);
    }
}
