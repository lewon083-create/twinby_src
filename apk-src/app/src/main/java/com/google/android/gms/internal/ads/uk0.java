package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements l9.d, q70, z60, l60, r60, q9.a, i60, h70, p60, v80 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd0 f10961j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10954b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f10955c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f10956d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f10957e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f10958f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f10959g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f10960h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayBlockingQueue f10962k = new ArrayBlockingQueue(((Integer) q9.s.f31967e.f31970c.a(al.f2957ca)).intValue());

    public uk0(sd0 sd0Var) {
        this.f10961j = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        Object obj = this.f10954b.get();
        if (obj != null) {
            try {
                ((q9.y) obj).z();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f10958f.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((q9.a1) obj2).g();
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        Object obj;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue() && (obj = this.f10954b.get()) != null) {
            try {
                ((q9.y) obj).m();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f10958f.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((q9.a1) obj2).c();
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        AtomicReference atomicReference = this.f10954b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((q9.y) obj).d0(x1Var);
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((q9.y) obj2).E(x1Var.f31976b);
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f10957e.get();
        if (obj3 != null) {
            try {
                ((q9.b0) obj3).p0(x1Var);
            } catch (RemoteException e12) {
                u9.i.k("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        this.f10959g.set(false);
        this.f10962k.clear();
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
        Object obj = this.f10954b.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.y) obj).f();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
        Object obj = this.f10954b.get();
        if (obj != null) {
            try {
                ((q9.y) obj).k();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        AtomicReference atomicReference = this.f10958f;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((q9.a1) obj2).h();
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((q9.a1) obj3).i();
        } catch (RemoteException e12) {
            u9.i.k("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void a(q9.h3 h3Var) {
        Object obj = this.f10956d.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.s1) obj).l3(h3Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final synchronized q9.y b() {
        return (q9.y) this.f10954b.get();
    }

    public final void g(q9.v0 v0Var) {
        this.f10955c.set(v0Var);
        this.f10960h.set(true);
        r();
    }

    @Override // l9.d
    public final synchronized void h(String str, String str2) {
        if (!this.f10959g.get()) {
            Object obj = this.f10955c.get();
            if (obj != null) {
                try {
                    ((q9.v0) obj).r0(str, str2);
                } catch (RemoteException e3) {
                    u9.i.k("#007 Could not call remote method.", e3);
                } catch (NullPointerException e7) {
                    u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                }
            }
            return;
        }
        if (!this.f10962k.offer(new Pair(str, str2))) {
            u9.i.c("The queue for app events is full, dropping the new event.");
            sd0 sd0Var = this.f10961j;
            if (sd0Var != null) {
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "dae_action");
                zd1VarA.v("dae_name", str);
                zd1VarA.v("dae_data", str2);
                zd1VarA.w();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void j(q9.x1 x1Var) {
        Object obj = this.f10958f.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.a1) obj).P2(x1Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:14:0x001f, B:17:0x0028, B:25:0x003d, B:23:0x0032, B:24:0x0038, B:12:0x0014, B:13:0x001a), top: B:31:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.z60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void k() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r2.f10954b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto La
            goto L1f
        La:
            q9.y r0 = (q9.y) r0     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L12 java.lang.Throwable -> L48
            r0.c()     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L12 java.lang.Throwable -> L48
            goto L1f
        L10:
            r0 = move-exception
            goto L14
        L12:
            r0 = move-exception
            goto L1a
        L14:
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            u9.i.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L1f
        L1a:
            java.lang.String r1 = "#007 Could not call remote method."
            u9.i.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L1f:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f10957e     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L28
            goto L3d
        L28:
            q9.b0 r0 = (q9.b0) r0     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            r0.z()     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            goto L3d
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            goto L38
        L32:
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            u9.i.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L3d
        L38:
            java.lang.String r1 = "#007 Could not call remote method."
            u9.i.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L3d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.i     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L48
            r2.r()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)
            return
        L48:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uk0.k():void");
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        this.f10959g.set(true);
        this.i.set(false);
    }

    @Override // q9.a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue() || (obj = this.f10954b.get()) == null) {
            return;
        }
        try {
            ((q9.y) obj).m();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void r() {
        if (this.f10960h.get() && this.i.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.f10962k;
            for (Pair pair : arrayBlockingQueue) {
                Object obj = this.f10955c.get();
                if (obj != null) {
                    try {
                        ((q9.v0) obj).r0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                    } catch (NullPointerException e7) {
                        u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f10959g.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
        Object obj = this.f10954b.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.y) obj).i();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        vv.n(this.f10954b, l80.f7438v);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
    }
}
