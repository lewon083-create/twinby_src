package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.internal.ads.tr0;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 implements pa.b, pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10705f;

    public tr0() {
        this.f10701b = false;
        this.f10704e = new WeakHashMap();
        this.f10703d = new bj.g(10, this);
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (this.f10701b && !this.f10702c) {
                    int length = ((long[]) this.f10703d).length;
                    int i = 0;
                    while (true) {
                        int i10 = 1;
                        if (i >= length) {
                            this.f10702c = true;
                            this.f10701b = false;
                            return (int[]) this.f10705f;
                        }
                        boolean z5 = ((long[]) this.f10703d)[i] > 0;
                        boolean[] zArr = (boolean[]) this.f10704e;
                        if (z5 != zArr[i]) {
                            int[] iArr = (int[]) this.f10705f;
                            if (!z5) {
                                i10 = 2;
                            }
                            iArr[i] = i10;
                        } else {
                            ((int[]) this.f10705f)[i] = 0;
                        }
                        zArr[i] = z5;
                        i++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public void b(final boolean z5, final boolean z10) {
        m3.v vVar = (m3.v) this.f10704e;
        if (z5 && z10) {
            vVar.c(new Runnable() { // from class: m3.a0
                @Override // java.lang.Runnable
                public final void run() {
                    l6.i.a((l6.i) this.f28539b.f10703d, z5, z10);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m3.v vVar2 = (m3.v) this.f10705f;
        vVar2.f28601a.postDelayed(new io.appmetrica.analytics.impl.cp(29, this, atomicBoolean), 1000L);
        vVar.c(new Runnable() { // from class: m3.b0
            @Override // java.lang.Runnable
            public final void run() {
                tr0 tr0Var = this.f28544b;
                tr0Var.getClass();
                atomicBoolean.set(false);
                l6.i.a((l6.i) tr0Var.f10703d, z5, z10);
            }
        });
    }

    public void c(boolean z5) {
        if (this.f10702c == z5) {
            return;
        }
        this.f10702c = z5;
        if (this.f10701b) {
            b(true, z5);
        }
    }

    public synchronized void d(Context context) {
        try {
            if (this.f10701b) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f10705f = applicationContext;
            if (applicationContext == null) {
                this.f10705f = context;
            }
            al.a((Context) this.f10705f);
            wk wkVar = al.f3298z4;
            q9.s sVar = q9.s.f31967e;
            this.f10702c = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) sVar.f31970c.a(al.f3082kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f10705f).registerReceiver((bj.g) this.f10703d, intentFilter);
            } else {
                ((Context) this.f10705f).registerReceiver((bj.g) this.f10703d, intentFilter, 4);
            }
            this.f10701b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void e(boolean z5) {
        if (this.f10702c == z5) {
            return;
        }
        this.f10702c = z5;
        if (this.f10701b) {
            h(true, z5);
        }
    }

    public void f() {
        synchronized (this.f10705f) {
            try {
                rv0 rv0Var = (rv0) this.f10703d;
                if (rv0Var.r() || rv0Var.s()) {
                    rv0Var.f();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void g(Context context, bj.g gVar) {
        if (this.f10702c) {
            ((WeakHashMap) this.f10704e).remove(gVar);
        } else {
            context.unregisterReceiver(gVar);
        }
    }

    public void h(final boolean z5, final boolean z10) {
        lo0 lo0Var = (lo0) this.f10704e;
        if (z5 && z10) {
            lo0Var.e(new aa.g0(1, this, z5, z10));
            return;
        }
        ut utVar = (ut) this.f10703d;
        Objects.requireNonNull(utVar);
        final h30 h30Var = new h30(28, utVar);
        ((lo0) this.f10705f).f7588a.postDelayed(h30Var, 1000L);
        lo0Var.e(new Runnable() { // from class: com.google.android.gms.internal.ads.hr0
            @Override // java.lang.Runnable
            public final void run() {
                tr0 tr0Var = this.f6234b;
                ((lo0) tr0Var.f10705f).f7588a.removeCallbacks(h30Var);
                ((ut) tr0Var.f10703d).q(z5, z10);
            }
        });
    }

    @Override // pa.b
    public void n0() {
        synchronized (this.f10705f) {
            try {
                if (this.f10702c) {
                    return;
                }
                this.f10702c = true;
                try {
                    uv0 uv0Var = (uv0) ((rv0) this.f10703d).n();
                    qv0 qv0Var = new qv0(1, ((nv0) this.f10704e).b());
                    Parcel parcelD0 = uv0Var.D0();
                    vg.c(parcelD0, qv0Var);
                    uv0Var.L1(parcelD0, 2);
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    f();
                    throw th2;
                }
                f();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public tr0(Context context, Looper looper, c6 c6Var) {
        this.f10703d = new ut(18, (Object) context.getApplicationContext(), false);
        this.f10704e = c6Var.y(looper, null);
        this.f10705f = c6Var.y(Looper.getMainLooper(), null);
    }

    public tr0(Context context, Looper looper, nv0 nv0Var) {
        this.f10705f = new Object();
        this.f10701b = false;
        this.f10702c = false;
        this.f10704e = nv0Var;
        this.f10703d = new rv0(context, looper, this, this, 12800000);
    }

    public tr0(Context context, Looper looper, m3.t tVar) {
        this.f10703d = new l6.i(context.getApplicationContext(), 4);
        this.f10704e = tVar.a(looper, null);
        this.f10705f = tVar.a(Looper.getMainLooper(), null);
    }

    public tr0(int i) {
        long[] jArr = new long[i];
        this.f10703d = jArr;
        boolean[] zArr = new boolean[i];
        this.f10704e = zArr;
        this.f10705f = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
    }

    @Override // pa.b
    public void l0(int i) {
    }
}
