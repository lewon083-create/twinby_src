package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 implements h90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ci0 f7235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xp0 f7236d;

    public /* synthetic */ ki0(fi0 fi0Var, ci0 ci0Var, xp0 xp0Var, int i) {
        this.f7234b = i;
        this.f7235c = ci0Var;
        this.f7236d = xp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h90
    public final void d(boolean z5, Context context, o60 o60Var) throws g90 {
        kq0 kq0Var;
        switch (this.f7234b) {
            case 0:
                try {
                    pq0 pq0Var = (pq0) this.f7235c.f4217b;
                    pq0Var.b(z5);
                    try {
                        pq0Var.f9154a.h4(new xa.b(context));
                        return;
                    } finally {
                    }
                } catch (kq0 e3) {
                    throw new g90(e3.getCause());
                }
            default:
                try {
                    pq0 pq0Var2 = (pq0) this.f7235c.f4217b;
                    pq0Var2.b(z5);
                    try {
                        pq0Var2.f9154a.K();
                        return;
                    } finally {
                    }
                } catch (kq0 e7) {
                    u9.i.i("Cannot show rewarded video.", e7);
                    throw new g90(e7.getCause());
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public final xp0 j() {
        switch (this.f7234b) {
        }
        return this.f7236d;
    }
}
