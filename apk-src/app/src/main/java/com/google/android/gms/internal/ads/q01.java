package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 implements cz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final js1 f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js1 f9254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final js1 f9255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9257e;

    public q01(js1 js1Var, js1 js1Var2, js1 js1Var3, boolean z5, long j10) {
        this.f9253a = js1Var;
        this.f9254b = js1Var2;
        this.f9255c = js1Var3;
        this.f9256d = z5;
        this.f9257e = j10;
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d a(Context context) {
        return ((c11) this.f9254b.j()).a(context);
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d b(Context context, View view, Activity activity) {
        return ((c11) this.f9254b.j()).b(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final void c(InputEvent inputEvent) {
        ((c11) this.f9254b.j()).c(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d d(Context context, String str, View view) {
        return ((c11) this.f9254b.j()).d(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final String h() {
        return ((c11) this.f9254b.j()).h();
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d j() {
        boolean z5 = this.f9256d;
        f81 f81Var = f81.f5272b;
        if (z5) {
            final int i = 1;
            r71 r71VarJ = vv.J(vv.G(i81.s(((x01) this.f9253a.j()).a()), Throwable.class, u5.f10835v, f81Var), new z71(this) { // from class: com.google.android.gms.internal.ads.p01

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q01 f8868b;

                {
                    this.f8868b = this;
                }

                @Override // com.google.android.gms.internal.ads.z71
                public final /* synthetic */ ed.d a(Object obj) {
                    switch (i) {
                        case 0:
                            return ((c11) this.f8868b.f9254b.j()).j();
                        case 1:
                            return ((m11) this.f8868b.f9255c.j()).h();
                        default:
                            return ((c11) this.f8868b.f9254b.j()).j();
                    }
                }
            }, f81Var);
            final int i10 = 2;
            return vv.J(r71VarJ, new z71(this) { // from class: com.google.android.gms.internal.ads.p01

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q01 f8868b;

                {
                    this.f8868b = this;
                }

                @Override // com.google.android.gms.internal.ads.z71
                public final /* synthetic */ ed.d a(Object obj) {
                    switch (i10) {
                        case 0:
                            return ((c11) this.f8868b.f9254b.j()).j();
                        case 1:
                            return ((m11) this.f8868b.f9255c.j()).h();
                        default:
                            return ((c11) this.f8868b.f9254b.j()).j();
                    }
                }
            }, f81Var);
        }
        final int i11 = 0;
        r71 r71VarJ2 = vv.J(vv.G(i81.s(((m11) this.f9255c.j()).h()), Throwable.class, u5.f10836w, f81Var), new z71(this) { // from class: com.google.android.gms.internal.ads.p01

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q01 f8868b;

            {
                this.f8868b = this;
            }

            @Override // com.google.android.gms.internal.ads.z71
            public final /* synthetic */ ed.d a(Object obj) {
                switch (i11) {
                    case 0:
                        return ((c11) this.f8868b.f9254b.j()).j();
                    case 1:
                        return ((m11) this.f8868b.f9255c.j()).h();
                    default:
                        return ((c11) this.f8868b.f9254b.j()).j();
                }
            }
        }, f81Var);
        r71VarJ2.a(new kr0(6, this), f81Var);
        return r71VarJ2;
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final int k() {
        return ((c11) this.f9254b.j()).k();
    }
}
