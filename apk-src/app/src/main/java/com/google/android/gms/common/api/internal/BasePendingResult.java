package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.xy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import na.i;
import na.j;
import na.l;
import oa.d;
import oa.e0;
import oa.r;
import pa.c0;
import wa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends l> extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final gb f2637m = new gb(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f2642h;
    public Status i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f2643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2644k;
    private e0 resultGuardian;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2638d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f2639e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2640f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f2641g = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2645l = false;

    public BasePendingResult(i iVar) {
        new d(iVar != null ? ((r) iVar).f29884b.f29196h : Looper.getMainLooper(), 2);
        new WeakReference(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void I(l lVar) {
        if (lVar instanceof xy) {
            try {
                ((xy) lVar).a();
            } catch (RuntimeException e3) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(lVar)), e3);
            }
        }
    }

    public final void C(j jVar) {
        synchronized (this.f2638d) {
            try {
                if (F()) {
                    jVar.a(this.i);
                } else {
                    this.f2640f.add(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract l D(Status status);

    public final void E(Status status) {
        synchronized (this.f2638d) {
            try {
                if (!F()) {
                    G(D(status));
                    this.f2644k = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean F() {
        return this.f2639e.getCount() == 0;
    }

    public final void G(l lVar) {
        synchronized (this.f2638d) {
            try {
                if (this.f2644k) {
                    I(lVar);
                    return;
                }
                F();
                c0.k("Results have already been set", !F());
                c0.k("Result has already been consumed", !this.f2643j);
                H(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H(l lVar) {
        this.f2642h = lVar;
        this.i = lVar.getStatus();
        this.f2639e.countDown();
        if (this.f2642h instanceof xy) {
            this.resultGuardian = new e0(this);
        }
        ArrayList arrayList = this.f2640f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j) arrayList.get(i)).a(this.i);
        }
        arrayList.clear();
    }

    @Override // wa.a
    public final l a() {
        l lVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0.k("Result has already been consumed.", !this.f2643j);
        try {
            if (!this.f2639e.await(0L, timeUnit)) {
                E(Status.i);
            }
        } catch (InterruptedException unused) {
            E(Status.f2630g);
        }
        c0.k("Result is not ready.", F());
        synchronized (this.f2638d) {
            c0.k("Result has already been consumed.", !this.f2643j);
            c0.k("Result is not ready.", F());
            lVar = this.f2642h;
            this.f2642h = null;
            this.f2643j = true;
        }
        if (this.f2641g.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        c0.i(lVar);
        return lVar;
    }
}
