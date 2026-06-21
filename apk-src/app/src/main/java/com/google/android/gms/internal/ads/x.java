package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11951c;

    public /* synthetic */ x(int i, Object obj) {
        this.f11950b = i;
        this.f11951c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11950b) {
            case 0:
                ((Executor) this.f11951c).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((t9.d0) this.f11951c).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    t9.g0 g0Var = p9.k.C.f31297c;
                    Context context = p9.k.C.f31302h.f3944e;
                    if (context != null) {
                        try {
                            if (((Boolean) km.f7258b.r()).booleanValue()) {
                                ua.b.a(context, th2);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th2;
                }
            default:
                ((lo0) this.f11951c).e(runnable);
                return;
        }
    }

    public x() {
        this.f11950b = 1;
        this.f11951c = new t9.d0(Looper.getMainLooper(), 0);
    }
}
