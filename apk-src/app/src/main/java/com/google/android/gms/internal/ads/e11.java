package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e11 implements c11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f4787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n11 f4788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w11 f4789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j21 f4790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f4791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f4792f = new AtomicReference("2.825731049.-1");

    public e11(bw0 bw0Var, n11 n11Var, w11 w11Var, j21 j21Var, ExecutorService executorService) {
        this.f4787a = bw0Var;
        this.f4788b = n11Var;
        this.f4789c = w11Var;
        this.f4790d = j21Var;
        this.f4791e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 a(Context context) {
        return vv.B(new je(12, this, context), this.f4791e);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 b(Context context, View view, Activity activity) {
        return vv.B(new lb0(this, context, view, activity, 2), this.f4791e);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void c(InputEvent inputEvent) {
        yv0 yv0VarB = this.f4787a.b();
        j21 j21Var = this.f4790d;
        if (yv0VarB == null) {
            j21Var.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                yv0VarB.h((MotionEvent) inputEvent);
            } catch (zv0 e3) {
                j21Var.d(e3, 15005);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 d(Context context, String str, View view) {
        return vv.B(new lb0(this, context, str, view, 3), this.f4791e);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final String h() {
        return (String) this.f4792f.get();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final i81 j() {
        i81 i81VarS = i81.s(this.f4788b.j());
        u5 u5Var = u5.C;
        f81 f81Var = f81.f5272b;
        final int i = 0;
        r71 r71VarJ = vv.J(vv.K(vv.G(i81VarS, Throwable.class, u5Var, f81Var), new c31(this) { // from class: com.google.android.gms.internal.ads.d11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e11 f4421b;

            {
                this.f4421b = this;
            }

            @Override // com.google.android.gms.internal.ads.c31
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        bz0 bz0Var = (bz0) obj;
                        e11 e11Var = this.f4421b;
                        if (e11Var.f4789c.a(bz0Var) && bz0Var != null) {
                            return new Boolean(true);
                        }
                        e11Var.f4790d.b(15003);
                        throw new oc(1);
                    default:
                        vv0 vv0Var = (vv0) obj;
                        if (vv0Var == null) {
                            throw new oc(3);
                        }
                        File file = vv0Var.f11495b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        e11 e11Var2 = this.f4421b;
                        e11Var2.f4790d.f(15002, new th0(15, e11Var2, vv0Var));
                        return new Boolean(true);
                }
            }
        }, f81Var), new np(16, this), f81Var);
        final int i10 = 1;
        return vv.K(vv.K(r71VarJ, new c31(this) { // from class: com.google.android.gms.internal.ads.d11

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e11 f4421b;

            {
                this.f4421b = this;
            }

            @Override // com.google.android.gms.internal.ads.c31
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        bz0 bz0Var = (bz0) obj;
                        e11 e11Var = this.f4421b;
                        if (e11Var.f4789c.a(bz0Var) && bz0Var != null) {
                            return new Boolean(true);
                        }
                        e11Var.f4790d.b(15003);
                        throw new oc(1);
                    default:
                        vv0 vv0Var = (vv0) obj;
                        if (vv0Var == null) {
                            throw new oc(3);
                        }
                        File file = vv0Var.f11495b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        e11 e11Var2 = this.f4421b;
                        e11Var2.f4790d.f(15002, new th0(15, e11Var2, vv0Var));
                        return new Boolean(true);
                }
            }
        }, f81Var), u5.B, f81Var);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final int k() {
        return 3;
    }
}
